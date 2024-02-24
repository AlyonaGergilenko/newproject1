package Homework7;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DepositAccount extends BankAccount {

    LocalDate lastIncome = null;


    public void put(double amountToPut) {
        super.put(amountToPut);
        lastIncome = LocalDate.now();
    }


    @Override
    public void take(double amountToTake) {

        if (ChronoUnit.MONTHS.between(lastIncome, LocalDate.now()) >= 1) {
            super.take(amountToTake);
        } else {
            System.out.println("С последнего пополнения прошло меньше месяца");
        }

    }

}





