package patterns.design.adapter.paypal;

import patterns.design.adapter.utils.Token;

public interface IPaypalPayments {
    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
