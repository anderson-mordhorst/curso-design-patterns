package patterns.design.builder.builders;

import patterns.design.builder.cars.Car;
import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

import java.awt.*;

public class CarBuilder implements IBuilder {

    private CarType type;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCartType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult(){
        return new Car(type, seats, engine, transmission);
    }
}
