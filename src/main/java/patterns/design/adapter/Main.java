package patterns.design.adapter;

import patterns.design.adapter.adapters.MercadoPagoAdapter;
import patterns.design.adapter.adapters.PayonnerAdapter;
import patterns.design.adapter.mercadopago.MercadoPago;
import patterns.design.adapter.payonner.Payonner;
import patterns.design.adapter.paypal.IPaypalPayments;

public class Main {

    public static void main(String[] args) {
        IPaypalPayments payment = new PayonnerAdapter(new Payonner());
        payment.paypalPayment();
        payment.paypalReceive();

        System.out.println("Trocando forma de pagameto");
        payment = new MercadoPagoAdapter(new MercadoPago());
        payment.paypalPayment();
        payment.paypalReceive();
    }
}
