package ru.ezhov.lessons.homework.resolance.glava5.innerClass;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.LogManager;
import java.util.logging.Level;

public class ShipWheelTest {

    private static final Logger LOG = Logger.getLogger(ShipWheelTest.class.getName());

    public static void main(String[] args) {

        try {
            LogManager
                    .getLogManager()
                    .readConfiguration(ShipWheelTest.
                            class
                            .getResourceAsStream(
                                    "/log.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }


        Ship.ShipWheel shipWheel = new Ship.ShipWheel();
        Ship ship = new Ship();
        ship.setShipWheel(shipWheel);
        for (int i = 0 ; i < 100; i++){
            LOG.log(Level.INFO, String.valueOf(i));
        }

    }
}
