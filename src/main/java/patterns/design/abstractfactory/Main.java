package patterns.design.abstractfactory;

import patterns.design.abstractfactory.app.Application;
import patterns.design.abstractfactory.factories.ITransportFactory;
import patterns.design.abstractfactory.factories.NineNineTransport;
import patterns.design.abstractfactory.factories.UberTransport;

public class Main {

    public static Application configureApplication(){
        ITransportFactory factory;
        String company = "99";

        if("uber".equals(company)) {
            factory = new UberTransport();
        } else {
            factory = new NineNineTransport();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}
