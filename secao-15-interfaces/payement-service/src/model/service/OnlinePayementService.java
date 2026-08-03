package model.service;

public interface OnlinePayementService {

    double paymentFee(Double amount);

    double interest(Double amount, Integer months);
}
