package patterns.design.adapter.payonner;

import patterns.design.adapter.utils.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void receivePayment();
}
