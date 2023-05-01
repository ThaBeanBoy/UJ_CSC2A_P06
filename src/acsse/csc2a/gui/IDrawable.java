package acsse.csc2a.gui;

import javafx.scene.canvas.GraphicsContext;

/**
 * @author TG Chipoyera
 * @version P06
 * @see IDrawable,GraphicsContext
 */
public interface IDrawable {
    /**
     * Method signature that is the visitable's method
     * @param visitor The visitor object
     * @param gc The Graphics Context
     */
    public void accept(IDrawVisitor visitor, GraphicsContext gc);
}
