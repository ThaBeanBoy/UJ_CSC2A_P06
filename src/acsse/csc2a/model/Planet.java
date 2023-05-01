package acsse.csc2a.model;

import acsse.csc2a.gui.IDrawVisitor;
import acsse.csc2a.gui.IDrawable;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Planet implements IDrawable {
    private final String name;
    private final Point2D planetPosition;
    private final Color planetColor;
    private final int radius;

    public Planet(String name, double x_position, double y_position, Color color, int radius) {
        this.name = name;
        this.planetPosition = new Point2D(x_position, y_position);
        this.planetColor = color;
        this.radius = radius;
    }

    public String getName() {return this.name;}

    public Point2D getPlanetPosition(){ return this.planetPosition;}

    public Color getPlanetColor() { return this.planetColor;}

    public int getRadius(){return this.radius;}

    @Override
    public void accept(IDrawVisitor visitor, GraphicsContext gc) {
        visitor.draw(this, gc);
    }
}
