package patterns.design.adapter.mercadopago;

import patterns.design.adapter.utils.Token;

public class MercadoPago implements IMercadoPago {

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPagoPayment() {
        System.out.println("Enviando pagamentos via Mercado Pago");
    }

    @Override
    public void mercadoPagoReceive() {
        System.out.println("Recebendo pagamentos via Mercado Pago");
    }
}
