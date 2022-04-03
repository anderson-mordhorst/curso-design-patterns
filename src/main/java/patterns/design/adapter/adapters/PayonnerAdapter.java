package patterns.design.adapter.adapters;

import patterns.design.adapter.payonner.Payonner;
import patterns.design.adapter.paypal.IPaypalPayments;
import patterns.design.adapter.utils.Token;

public class PayonnerAdapter implements IPaypalPayments {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando o Payonner usando os métodos do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
