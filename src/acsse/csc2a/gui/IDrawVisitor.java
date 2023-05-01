package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.scene.canvas.GraphicsContext;

public interface IDrawVisitor {
    void draw(Planet planet, GraphicsContext gc);
    void draw(SpaceShip spaceship, GraphicsContext gc);
}
