package Homework7;

import java.time.Instant;

public class BankAccount {
//    public Instant lastPutTime;
//    public Instant lastTakeTime;
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
//            lastPutTime = Instant.now();


        }
    }

        public void take (double amountToTake) {
            if (amountToTake >= 0 && amountToTake <= amount) {
                amount -= amountToTake;
//                lastTakeTime = Instant.now();
            }
            else {
                System.out.println("Недостаточно средств");
            }

        }

    }

