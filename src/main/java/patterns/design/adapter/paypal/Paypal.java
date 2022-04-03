package patterns.design.adapter.paypal;

import patterns.design.adapter.utils.Token;

public class Paypal implements IPaypalPayments {

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via Paypal");
    }

    @Override
    public void paypalReceive() {
        System.out.println("Enviando pagamentos via Paypal");
    }
}
