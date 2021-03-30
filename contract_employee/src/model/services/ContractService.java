package model.services;

import model.entities.Contract;
import model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        double totalValueDividedPerMonth = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double updatedTotalValueDividedPerMonth = totalValueDividedPerMonth + onlinePaymentService.interest(totalValueDividedPerMonth, i);
            double fullTotalValueDividedPerMonth = updatedTotalValueDividedPerMonth + onlinePaymentService.paymentFee(updatedTotalValueDividedPerMonth);
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, fullTotalValueDividedPerMonth));
        }
    }

    public Date addMonths(Date date, int nMonths) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendar.MONTH, nMonths);
        return calendar.getTime();
    }
}
