package patterns.design.builder.cars;

import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

public class Truck {

    private final CarType type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType type, int seats, Engine engine, Transmission transmission) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("Truck with motor: %d", engine.getPower()));
        builder.append(String.format("Transmission: %s", transmission.toString()));
        return builder.toString();
    }
}
