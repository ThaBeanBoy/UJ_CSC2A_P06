package acsse.csc2a.model;

import acsse.csc2a.gui.IDrawVisitor;
import acsse.csc2a.gui.IDrawable;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * @author TG Chipoyera
 * @version P06
 * @see IDrawable,IDrawVisitor,Point2D,GraphicsContext,Color
 */
public class Planet implements IDrawable {
    private final String name;
    private final Point2D planetPosition;
    private final Color planetColor;
    private final int radius;

    /**
     * Creates a planet object
     * @param name The name of the planet
     * @param x_position The x coordinate of the planet
     * @param y_position The y position of the planet
     * @param color The color of the planet
     * @param radius The radius of the planet
     */
    public Planet(String name, double x_position, double y_position, Color color, int radius) {
        this.name = name;
        this.planetPosition = new Point2D(x_position, y_position);
        this.planetColor = color;
        this.radius = radius;
    }

    /**
     * Returns the name of the planet
     * @return String
     */
    public String getName() {return this.name;}

    /**
     * Returns the Position of the planet
     * @return Point2D
     */
    public Point2D getPlanetPosition(){ return this.planetPosition;}

    /**
     * Returns the color of the planet
     * @return Color
     */
    public Color getPlanetColor() { return this.planetColor;}

    /**
     * Returns the radius of the planet
     * @return int
     */
    public int getRadius(){return this.radius;}

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
