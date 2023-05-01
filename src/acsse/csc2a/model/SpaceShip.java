package acsse.csc2a.model;

import acsse.csc2a.gui.IDrawVisitor;
import acsse.csc2a.gui.IDrawable;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;

/**
 * @author TG Chipoyera
 * @version P06
 * @see IDrawVisitor,IDrawable,Point2D,GraphicsContext
 */
public class SpaceShip extends Ship implements IDrawable {
    private final Point2D shipPosition;

    /**
     * Constructor for SpaceShip class
     * @param iD ID of the Ship
     * @param name Name of the Ship
     * @param x_position X coordinate  of the Spaceship
     * @param y_position Y coordinate  of the Spaceship
     */
    public SpaceShip(String iD, String name, double x_position, double y_position) {
        super(iD, name);
        this.shipPosition = new Point2D(x_position, y_position);
    }

    /**
     * Returns the position of the ship
     * @return Point2D
     */
    public Point2D getShipPosition(){return this.shipPosition;}

    /**
     * Accept methods which accepts a visitor object & a graphics context
     * @param visitor The visitor object
     * @param gc The Graphics Context
     */
    @Override
    public void accept(IDrawVisitor visitor, GraphicsContext gc) {
        visitor.draw(this, gc);
    }
}
