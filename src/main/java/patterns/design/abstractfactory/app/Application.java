package patterns.design.abstractfactory.app;

import patterns.design.abstractfactory.aircrafts.IAircraft;
import patterns.design.abstractfactory.factories.ITransportFactory;
import patterns.design.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
