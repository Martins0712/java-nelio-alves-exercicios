package model.service;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private OnlinePayementService onlinePaymentService;

    public ContractService(OnlinePayementService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){

        double basicQuot = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++){

            double updatedQuota = basicQuot + onlinePaymentService.interest(basicQuot, i);

            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);

            Date dueDate = addMonths(contract.getDate(), i);

            Installment installment = new Installment(fullQuota, dueDate );

            contract.addInstallment(installment);

        }

    }
    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
