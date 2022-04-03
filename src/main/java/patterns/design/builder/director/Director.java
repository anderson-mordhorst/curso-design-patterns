package patterns.design.builder.director;

import patterns.design.builder.builders.IBuilder;
import patterns.design.builder.builders.IColorBuilder;
import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

import java.awt.*;

public class Director {

    public void constructSedanCar(IBuilder builder) {
        builder.setCartType(CarType.SEDAN);
        builder.setSeats(4);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void construtctTruck(IBuilder builder){
        builder.setCartType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportiveCar(IColorBuilder builder){
        builder.setCartType(CarType.SPORT);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(4000));
        builder.setColor(Color.YELLOW);
    }
}
