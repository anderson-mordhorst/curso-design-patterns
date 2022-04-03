package patterns.design.factorymethod;

import patterns.design.factorymethod.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTranport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTranport();
}
