package patterns.design.abstractfactory.factories;

import patterns.design.abstractfactory.aircrafts.IAircraft;
import patterns.design.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
