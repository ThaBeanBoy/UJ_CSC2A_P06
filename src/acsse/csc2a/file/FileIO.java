package acsse.csc2a.file;

import acsse.csc2a.model.SpaceShip;
import acsse.csc2a.model.Planet;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public static ArrayList<SpaceShip> readSpaceShip(File file) {
        ArrayList<SpaceShip> spaceShips = new ArrayList<>();;
        try(Scanner read = new Scanner(file)){
            while(read.hasNext()){
                //Getting spaceship properties
                String line = read.nextLine();
                String[] spaceProperties = line.split(" ");

                double x_position = Double.parseDouble(spaceProperties[0]);
                double y_position = Double.parseDouble(spaceProperties[1]);
                String ID = spaceProperties[2];
                StringBuilder ShipName = new StringBuilder(spaceProperties[3]);
                for(int i=3; i<spaceProperties.length; i++)
                    ShipName.append(spaceProperties[i]);

                //Ading spaceship to the array
                spaceShips.add(new SpaceShip(ID, ShipName.toString(), x_position, y_position));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.err.println("File Not Found");
            System.exit(-1);
        }

        return spaceShips;
    }

    public static ArrayList<Planet> readPlanet(File file) {
        ArrayList<Planet> Planets = new ArrayList<>();
        try(Scanner read = new Scanner(file)){
            while(read.hasNext()){
                String[] PlanetProperties = read.nextLine().split(" ");
                String PlanetName = PlanetProperties[0];
                Color Col = StringToColor(PlanetProperties[1]);
                double x_position = Double.parseDouble(PlanetProperties[2]);
                double y_position = Double.parseDouble(PlanetProperties[3]);
                int radius = Integer.parseInt(PlanetProperties[4]);

                //Adding the Planet to the array
                Planets.add(new Planet(PlanetName, x_position, y_position, Col, radius));
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.err.println("File Not Found");
            System.exit(-1);
        }

        return Planets;
    }

    private static Color StringToColor(String ColorString){
        return switch(ColorString){
            case "Brown" -> Color.BROWN;
            case "Pink" -> Color.PINK;
            case "Green" -> Color.GREEN;
            case "Red" -> Color.RED;
            case "Gray" -> Color.GREY;
            case "Yellow" -> Color.YELLOW;
            case "Blue" -> Color.BLUE;

            default -> Color.GREY;
        };
    }
}
