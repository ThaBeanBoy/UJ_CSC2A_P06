package acsse.csc2a.model;

import acsse.csc2a.gui.IDrawVisitor;
import acsse.csc2a.gui.IDrawable;
import acsse.csc2a.model.Ship;
import javafx.geometry.Point2D;

public class SpaceShip extends Ship implements IDrawable {
    private final Point2D shipPosition;
    /**
     * Constructor for SpaceShip class
     * @param iD            ID of the Ship
     * @param name          Name of the Ship
     * @param x_position    X Coordinate  of the Spaceship
     */
    public SpaceShip(String iD, String name, double x_position, double y_position) {
        super(iD, name);
        this.shipPosition = new Point2D(x_position, y_position);
    }

    public Point2D getShipPosition(){return this.shipPosition;}

    @Override
    public void accept(IDrawVisitor visitor) {
        visitor.draw(this);
    }
}
