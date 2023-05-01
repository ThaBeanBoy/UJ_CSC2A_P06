package acsse.csc2a.gui;

public interface IDrawable {
    public void accept(IDrawVisitor visitor);
}
