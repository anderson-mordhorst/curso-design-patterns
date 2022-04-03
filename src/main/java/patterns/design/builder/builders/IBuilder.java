package patterns.design.builder.builders;

import patterns.design.builder.components.CarType;
import patterns.design.builder.components.Engine;
import patterns.design.builder.components.Transmission;

import java.awt.*;

public interface IBuilder {
    void setCartType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
