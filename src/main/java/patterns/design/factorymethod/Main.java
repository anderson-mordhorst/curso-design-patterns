package patterns.design.factorymethod;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null){
            transport.startTransport();
        }
    }

    private static void configure(String arg) {
        switch (arg){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Selecione um tipo de transporte");
        }
    }
}
