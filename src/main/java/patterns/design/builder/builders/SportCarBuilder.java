package patterns.design.builder.builders;

import patterns.design.builder.cars.Car;
import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

import java.awt.*;

public class SportCarBuilder implements IColorBuilder {

    private CarType type;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    private Color color;

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

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, color);
    }
}
