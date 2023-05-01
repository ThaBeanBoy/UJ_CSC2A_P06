package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.control.MenuBar;

import acsse.csc2a.gui.MyCanvas;

import acsse.csc2a.file.FileIO;

import java.io.File;
import java.util.ArrayList;

public class MyPane extends StackPane {
    private ArrayList<Planet> Planets;
    private ArrayList<SpaceShip> SpaceShips;

    private final MenuBar menuBar;

    public MyPane(){
        final Menu fileMenu = new Menu("File");
        final MenuItem PlanetMenuItem = new MenuItem("Open Planets");
        final MenuItem SpaceShipsMenuItem = new MenuItem("Open Space Ships");

        // Adding file menu to the menu bar
        menuBar = new MenuBar(fileMenu);
        setAlignment(menuBar, Pos.TOP_LEFT);

        // Adding menu items to file menu
        fileMenu.getItems().add(PlanetMenuItem);
        fileMenu.getItems().add(SpaceShipsMenuItem);

        // Binding event listener to open planets' file
        PlanetMenuItem.setOnAction(e-> this.Planets = FileIO.readPlanet(new File("data/planets.txt")));

        // Binding event listener to open spaceships' file
        SpaceShipsMenuItem.setOnAction(e-> this.SpaceShips = FileIO.readSpaceShip(new File("data/spaceships.txt")));

        // Making the canvas
        final MyCanvas Canvas = new MyCanvas();
        setAlignment(Canvas, Pos.BOTTOM_LEFT);
        // Pane
        this.getChildren().addAll(Canvas, menuBar);
        this.setWidth(Canvas.getWidth());
        this.setHeight(menuBar.getHeight() + MyCanvas.canvasHeight);
    }
}
