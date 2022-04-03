package patterns.design.factorymethod;

import patterns.design.factorymethod.vehicles.IVehicle;
import patterns.design.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {

    @Override
    protected IVehicle createTranport() {
        return new Motorcycle();
    }
}
