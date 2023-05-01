package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.geometry.Pos;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.StackPane;
import javafx.scene.control.MenuBar;

import java.util.ArrayList;

public class MyPane extends StackPane {
    private ArrayList<Planet> Planets;
    private ArrayList<SpaceShip> SpaceShips;

    private final MenuBar menuBar;

    public MyPane(){
        final Menu fileMenu = new Menu("File");
        final MenuItem PlanetMenuItem = new MenuItem("Open Planets");
        final MenuItem SpaceShipsMenuItem = new MenuItem("Open Space Ships");

        //Adding file menu to the menu bar
        menuBar = new MenuBar(fileMenu);
        setAlignment(menuBar, Pos.TOP_LEFT);

        // Adding menu items to file menu
        fileMenu.getItems().add(PlanetMenuItem);
        fileMenu.getItems().add(SpaceShipsMenuItem);

        // Binding event listener to open planets' file
        PlanetMenuItem.setOnAction(e->{});

        //Binding event listener to open spaceships' file
        SpaceShipsMenuItem.setOnAction(e->{});

        //Pane
        this.getChildren().add(menuBar);
        this.setWidth(800);
    }
}
