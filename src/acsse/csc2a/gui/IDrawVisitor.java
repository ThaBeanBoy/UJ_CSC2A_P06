package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;
import javafx.scene.canvas.GraphicsContext;

/**
 * @author TG Chipoyera
 * @version P06
 * @see Planet,SpaceShip,GraphicsContext
 */
public interface IDrawVisitor {
    /**
     * Method signature meant to draw a Planet on the giver Graphics Context
     * @param planet The planet meant to be drawn
     * @param gc The Graphics Context the planet will be drawn on
     */
    void draw(Planet planet, GraphicsContext gc);

    /**
     * Method signature meant to draw a SpaceShip on the giver Graphics Context
     * @param spaceship The SpaceShip meant to be drawn
     * @param gc The Graphics Context the SpaceShip will be drawn on
     */
    void draw(SpaceShip spaceship, GraphicsContext gc);
}
