package patterns.design.factorymethod;

import patterns.design.factorymethod.vehicles.Bike;
import patterns.design.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport {

    @Override
    protected IVehicle createTranport() {
        return new Bike();
    }
}
