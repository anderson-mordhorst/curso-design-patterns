package patterns.design.builder.builders;

import java.awt.*;

public interface IColorBuilder extends IBuilder {
    void setColor(Color color);
}
