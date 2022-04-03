package patterns.design.abstractfactory.factories;

import patterns.design.abstractfactory.aircrafts.Airplane;
import patterns.design.abstractfactory.aircrafts.IAircraft;
import patterns.design.abstractfactory.landvehicles.Car;
import patterns.design.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
