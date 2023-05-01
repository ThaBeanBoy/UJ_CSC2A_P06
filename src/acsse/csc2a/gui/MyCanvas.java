package acsse.csc2a.gui;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;

import java.util.ArrayList;

/**
 * A canvas that extends upon  the javafx canvas class, specifically meant for spaceships & planets
 * @author TG Chipoyera
 * @version P04
 * @see Planet,SpaceShip,ArrayList
 */
public class MyCanvas extends Canvas {
    public final static int canvasWidth = 1500;
    public final static int canvasHeight = 500;
    private final GraphicsContext gc;

    /**
     * Creates a MyCanvas object
     */
    public MyCanvas(){
        this.gc = this.getGraphicsContext2D();

        // Setting the dimensions
        this.setWidth(canvasWidth);
        this.setHeight(canvasHeight);
      // this.setStyle("-fx-background-image: url('assets/space-bg.jpg'); -fx-background-size: cover;");

        // Making the space background
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0,0, this.getWidth(), this.getHeight());
    }

    /**
     * Updates the canvas with new information
     * @param SpaceShips The spaceships that should be drawn on the canvas
     * @param Planets The planets that should be drawn on the canvas
     */
    public void repaintCanvas(ArrayList<SpaceShip> SpaceShips, ArrayList<Planet> Planets){
        DrawVisitor Drawer = new DrawVisitor();

        // Drawing planets
        for(Planet planet : Planets){
            planet.accept(Drawer, gc);
        }

        // Drawing spaceships
        for(SpaceShip spaceShip: SpaceShips){
            spaceShip.accept(Drawer, gc);
        }
    }
}
