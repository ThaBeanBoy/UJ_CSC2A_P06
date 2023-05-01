package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.geometry.Bounds;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class DrawVisitor implements  IDrawVisitor{
    @Override
    public void draw(Planet planet, GraphicsContext gc) {
        final double x_pos = planet.getPlanetPosition().getX();
        final double y_pos = planet.getPlanetPosition().getY();
        final int radius = planet.getRadius();
        final String name = planet.getName();
        final Color col = planet.getPlanetColor();

        // Drawing the planet
        gc.setFill(planet.getPlanetColor());
        gc.fillOval(x_pos, y_pos, radius, radius);

        // Writing the name
        /*
        If the planet is yellow, the text will be black,
        Yellow & white has very poor contrast
        Black & Yellow has sharp contrast
        */
        gc.setFill(col == Color.YELLOW ? Color.BLACK : Color.WHITE);
        TextMidpoint midpoints = new TextMidpoint(x_pos, y_pos, radius, radius, name);
        gc.fillText(name, midpoints.getX_pos(), midpoints.getY_pos());
    }

    @Override
    public void draw(SpaceShip spaceship, GraphicsContext gc) {
        final double x_pos = spaceship.getShipPosition().getX();
        final double y_pos = spaceship.getShipPosition().getY();
        final double width = 100;
        final double height = 30;
        final String name = spaceship.getName();

        // Drawing the spaceship
        gc.setFill(Color.GREEN);
        gc.fillRect(x_pos, y_pos, width, height);

        // Writing the name of the spaceship
        TextMidpoint midpoints = new TextMidpoint(x_pos, y_pos, width, height, name);
        gc.setFill(Color.WHITE);
        gc.fillText(name, midpoints.getX_pos(), midpoints.getY_pos());
    }

    private static class TextMidpoint{
        private final double x_pos, y_pos;
        public TextMidpoint(double x_position, double y_position, double width, double height, String text){
            //Getting width & height of text element
            Bounds textBounds = new Text(text).getLayoutBounds();
            double textWidth = textBounds.getWidth();
            double textHeight = textBounds.getHeight();

            //Calculating midpoints
            this.x_pos = x_position + (width/2) - (textWidth/2);
            this.y_pos = y_position + (height/2);
        }

        public double getX_pos() {
            return this.x_pos;
        }

        public double getY_pos() {
            return this.y_pos;
        }
    }
}
