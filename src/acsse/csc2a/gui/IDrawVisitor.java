package acsse.csc2a.gui;

import acsse.csc2a.model.Planet;
import acsse.csc2a.model.SpaceShip;

public interface IDrawVisitor {
    void draw(Planet planet);
    void draw(SpaceShip spaceship);
}
