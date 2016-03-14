/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
   }

   public double getPurchase() {
      return this.purchase;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }

   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }

   /**
      Computes the change due by coins and resets the machine for the next customer.
      @return the change due to the customer
   */

   public void calculateChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;

      System.out.println("Cash to be given: £" + change);

      int onePoundCoins = 0;
      int fiftyPenceCoins = 0;
      int twentyPenceCoins = 0;
      int tenPenceCoins = 0;
      int fivePenceCoins = 0;
      int twoPenceCoins = 0;
      int onePenceCoins = 0;

      if (change >= 1.00) {
         onePoundCoins = (int)(change / 1.00);
         change = change % 1.00 + 0.001;
      }

      if (change >= 0.50) {
         fiftyPenceCoins = (int)(change / 0.50);
         change = change % 0.50 + 0.001;
      }

      if (change >= 0.20) {
         twentyPenceCoins = (int)(change / 0.20);
         change = change % 0.20 + 0.001;
      }

      if (change >= 0.10) {
         tenPenceCoins = (int)(change / 0.10);
         change = change % 0.10 + 0.001;
      }

      if (change >= 0.05) {
         fivePenceCoins = (int)(change / 0.05);
         change = change % 0.05 + 0.001;
      }

      if (change >= 0.02) {
         twoPenceCoins = (int)(change / 0.02);
         change = change % 0.02 + 0.001;
      }

      if (change >= 0.01) {
         onePenceCoins = (int)(change / 0.01);
         change = change % 0.01 + 0.001;
      }

      System.out.println("£1: "+ onePoundCoins);
      System.out.println("50p: "+ fiftyPenceCoins);
      System.out.println("20p: "+ twentyPenceCoins);
      System.out.println("10p: "+ tenPenceCoins);
      System.out.println("5p: "+ fivePenceCoins);
      System.out.println("2p: "+ twoPenceCoins);
      System.out.println("1p: "+ onePenceCoins);
   }

}
