package Homework7;

public class CardAccount extends BankAccount {


//    @Override
//    public void take (double amountToTake) {
//
//            if (amount  >= amountToTake + amountToTake * 0.01 && amountToTake > 0.00) {
//               amount  = amount  - amountToTake * 0.01- amountToTake;
//
//
//
//        }
//            else {
//                System.out.println("Недостаточно средств");
//            }

   public void take (double amountToTake) {
      amountToTake = amountToTake * 1.01;


       super.take(amountToTake);

    }
}


