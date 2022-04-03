package patterns.design.abstractfactory.factories;

import patterns.design.abstractfactory.aircrafts.Helicopter;
import patterns.design.abstractfactory.aircrafts.IAircraft;
import patterns.design.abstractfactory.landvehicles.ILandVehicle;
import patterns.design.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
