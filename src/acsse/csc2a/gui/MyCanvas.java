package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class MyCanvas extends Canvas {
    public final static int canvasWidth = 800;
    public final static int canvasHeight = 400;

    private GraphicsContext gc;
    public MyCanvas(){
        this.gc = this.getGraphicsContext2D();

        // Setting the dimensions
        this.setWidth(canvasWidth);
        this.setHeight(canvasHeight);

        // Making the space background
        gc.setFill(Color.LIGHTGRAY);
        gc.fillRect(0,0, this.getWidth(), this.getHeight());
    }
    public void repaintCanvas(ArrayList<SpaceShip> SpaceShips, ArrayList<Planet> Planets){

    }
}
