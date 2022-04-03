package patterns.design.builder.cars;

import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

import java.awt.*;

public class Car {

    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Car(CarType type, int seats, Engine engine, Transmission transmission) {
        this(type, seats, engine, transmission, null);
    }

    public Car(CarType type, int seats, Engine engine, Transmission transmission, Color color) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }
}
