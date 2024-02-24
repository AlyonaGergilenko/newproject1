package Homework7;

public class CardAccount extends BankAccount {


   public void take (double amountToTake) {
      amountToTake = amountToTake * 1.01;


       super.take(amountToTake);

    }
}


