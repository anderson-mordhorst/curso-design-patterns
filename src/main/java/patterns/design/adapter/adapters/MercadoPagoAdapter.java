package patterns.design.adapter.adapters;

import patterns.design.adapter.mercadopago.MercadoPago;
import patterns.design.adapter.paypal.IPaypalPayments;
import patterns.design.adapter.utils.Token;

public class MercadoPagoAdapter implements IPaypalPayments {

    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o Mercado Pago usando os métodos do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        mercadoPago.mercadoPagoPayment();
    }

    @Override
    public void paypalReceive() {
        mercadoPago.mercadoPagoReceive();
    }
}
