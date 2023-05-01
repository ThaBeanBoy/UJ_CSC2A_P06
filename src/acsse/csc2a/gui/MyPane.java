package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.MenuBar;

import acsse.csc2a.gui.MyCanvas;

import acsse.csc2a.file.FileIO;

import java.io.File;
import java.util.ArrayList;

/**
 * @author TG Chipoyera
 * @version P06
 * @see Planet,SpaceShip,File
 */
public class MyPane extends StackPane {
    private ArrayList<Planet> Planets = new ArrayList<>();
    private ArrayList<SpaceShip> SpaceShips = new ArrayList<>();

    private final MenuBar menuBar;
    private final MyCanvas CanvasDisplay;

    /**
     * Creates a pane that displays a menubar where planets &/or spaceships can be displayed on a canvas
     */
    public MyPane(){
        final Menu fileMenu = new Menu("File");
        final MenuItem PlanetMenuItem = new MenuItem("Open Planets");
        final MenuItem SpaceShipsMenuItem = new MenuItem("Open Space Ships");

        // Adding file menu to the menu bar
        menuBar = new MenuBar(fileMenu);
        setAlignment(menuBar, Pos.TOP_LEFT);

        // Making the canvas
        this.CanvasDisplay = new MyCanvas();
        setAlignment(this.CanvasDisplay, Pos.BOTTOM_LEFT);

        // Adding menu items to file menu
        fileMenu.getItems().add(PlanetMenuItem);
        fileMenu.getItems().add(SpaceShipsMenuItem);

        // Binding event listener to open planets' file
        PlanetMenuItem.setOnAction(e-> {
            this.Planets = FileIO.readPlanet(new File("data/planets.txt"));
            this.CanvasDisplay.repaintCanvas(this.SpaceShips, this.Planets);
        });

        // Binding event listener to open spaceships' file
        SpaceShipsMenuItem.setOnAction(e-> {
            this.SpaceShips = FileIO.readSpaceShip(new File("data/spaceships.txt"));
            this.CanvasDisplay.repaintCanvas(this.SpaceShips, this.Planets);
        });

        this.getChildren().addAll(this.CanvasDisplay, menuBar);
        this.setWidth(this.CanvasDisplay.getWidth());
        this.setHeight(menuBar.getHeight() + MyCanvas.canvasHeight);
    }
}
