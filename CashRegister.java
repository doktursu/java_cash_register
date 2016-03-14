import java.math.*;

/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private BigDecimal purchase;
   private BigDecimal payment;
   public static final BigDecimal ZERO = new BigDecimal("0.00");
   public static final BigDecimal ONE_POUND = new BigDecimal("1.00");
   public static final BigDecimal FIFTY_PENCE = new BigDecimal("0.50");
   public static final BigDecimal TWENTY_PENCE = new BigDecimal("0.20");
   public static final BigDecimal TEN_PENCE = new BigDecimal("0.10");
   public static final BigDecimal FIVE_PENCE = new BigDecimal("0.05");
   public static final BigDecimal TWO_PENCE = new BigDecimal("0.02");
   public static final BigDecimal ONE_PENCE = new BigDecimal("0.01");
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = ZERO;
      payment = ZERO;
   }

   public BigDecimal getPurchase() {
      return this.purchase;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(BigDecimal amount)
   {
      BigDecimal total = purchase.add(amount.setScale(2, RoundingMode.FLOOR));
      purchase = total;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(BigDecimal amount)
   {
      payment = amount.setScale(2, RoundingMode.FLOOR);
   }

   /**
      Computes the change due by coins and resets the machine for the next customer.
   */

   public void calculateChange()
   {
      BigDecimal change = payment.subtract(purchase);
      purchase = ZERO;
      payment = ZERO;

      System.out.println("Cash to be given: £" + change);

      BigDecimal onePoundCoins;
      BigDecimal fiftyPenceCoins;
      BigDecimal twentyPenceCoins;
      BigDecimal tenPenceCoins;
      BigDecimal fivePenceCoins;
      BigDecimal twoPenceCoins;
      BigDecimal onePenceCoins;

      BigDecimal[] results;
      results = new BigDecimal[2];

      results = change.divideAndRemainder(ONE_POUND);
      onePoundCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);
   
      results = change.divideAndRemainder(FIFTY_PENCE);
      fiftyPenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);

      results = change.divideAndRemainder(TWENTY_PENCE);
      twentyPenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);
      
      results = change.divideAndRemainder(TEN_PENCE);
      tenPenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);

      results = change.divideAndRemainder(FIVE_PENCE);
      fivePenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);

      results = change.divideAndRemainder(TWO_PENCE);
      twoPenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);

      results = change.divideAndRemainder(ONE_PENCE);
      onePenceCoins = results[0].setScale(0);
      change = results[1].setScale(2, RoundingMode.CEILING);
      
      System.out.println("£1: "+ onePoundCoins);
      System.out.println("50p: "+ fiftyPenceCoins);
      System.out.println("20p: "+ twentyPenceCoins);
      System.out.println("10p: "+ tenPenceCoins);
      System.out.println("5p: "+ fivePenceCoins);
      System.out.println("2p: "+ twoPenceCoins);
      System.out.println("1p: "+ onePenceCoins);
   }

}
