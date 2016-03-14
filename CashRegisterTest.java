import java.util.Scanner;
import java.math.*;

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
      BigDecimal item1;
      item1 = new BigDecimal(in.nextDouble());

      System.out.println("Enter second item price: ");
      BigDecimal item2;
      item2 = new BigDecimal(in.nextDouble());

      System.out.println("Enter payment amount: ");
      BigDecimal amount;
      amount =new BigDecimal( in.nextDouble());

      register.recordPurchase(item1);
      register.recordPurchase(item2);
      register.enterPayment(amount); 
      register.calculateChange();     
   }
}
