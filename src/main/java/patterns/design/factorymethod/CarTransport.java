package patterns.design.factorymethod;

import patterns.design.factorymethod.vehicles.Car;
import patterns.design.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport {

    @Override
    protected IVehicle createTranport() {
        return new Car();
    }
}
