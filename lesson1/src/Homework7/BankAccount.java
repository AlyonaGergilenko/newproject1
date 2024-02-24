package Homework7;

import java.time.Instant;

public class BankAccount {

    public double amount;

    public BankAccount() {
        amount = 0.0;
    }

    public double getAmount() {
        return amount;


    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {

            amount += amountToPut;


        }
    }

    public void take(double amountToTake) {
        if (amountToTake >= 0 && amountToTake <= amount) {
            amount -= amountToTake;

        } else {
            System.out.println("Недостаточно средств");
        }

    }

}

