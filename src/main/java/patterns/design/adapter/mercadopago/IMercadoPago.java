package patterns.design.adapter.mercadopago;

import patterns.design.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void mercadoPagoPayment();
    void mercadoPagoReceive();
}
