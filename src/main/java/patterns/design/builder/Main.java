package patterns.design.builder;

import patterns.design.builder.builders.CarBuilder;
import patterns.design.builder.builders.SportCarBuilder;
import patterns.design.builder.cars.Car;
import patterns.design.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);
        Car car = builder.getResult();
        System.out.println(String.format("%s produzido com sucesso", car.getType()));

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportiveCar(sportCarBuilder);
        car = sportCarBuilder.getResult();
        System.out.println(String.format("%s produzido com sucesso", car.getType()));
    }
}
