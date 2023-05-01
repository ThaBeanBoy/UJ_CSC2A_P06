package acsse.csc2a.gui;

import javafx.scene.canvas.GraphicsContext;

public interface IDrawable {
    public void accept(IDrawVisitor visitor, GraphicsContext gc);
}
