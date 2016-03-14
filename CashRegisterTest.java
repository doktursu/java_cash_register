import java.util.Scanner;

/**
   A class to test the CashRegister class.
*/
public class CashRegisterTest
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister();
      Scanner in = new Scanner(System.in);

      System.out.println("Enter first item price: ");
      double item1;
      item1 = in.nextDouble();

      System.out.println("Enter second item price: ");
      double item2;
      item2 = in.nextDouble();

      System.out.println("Enter payment amount: ");
      double amount;
      amount = in.nextDouble();

      register.recordPurchase(item1);
      register.recordPurchase(item2);
      register.enterPayment(amount);
      // double change = register.giveChange();
      // System.out.println(change);  
      register.calculateChange();       
   }
}
