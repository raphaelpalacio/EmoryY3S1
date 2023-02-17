public class CheckingAccount extends BankAccount
{
   /* Static variables that are consistent across all checking accounts */
    private static final int FREE_TRANSACTIONS = 2;
    private static final double TRANSACTION_FEE_MULTIPLIER = 2.0;

    private int transactionCount;

    // Adding a 'static' counter variable that CAN be updated by objects
    // (Note that when abt object modifies this variable, all other instantiated
    // objects of this class should be able to see the changes ;-).
    public static int numberAccounts = 0;

    public CheckingAccount(double initialBalance) {
      super(initialBalance);
      transactionCount = 0;
   }

   // CheckingAccount.faqPrintFees(); <-- we can call this static method using the Class name directly ;-)
   // It belongs to the class, not to a specific object!
   public static void faqPrintFees(){
     System.out.println("The number of free transactions = " + FREE_TRANSACTIONS + ". The fee multiplier = " + TRANSACTION_FEE_MULTIPLIER + ".");
   }

   @Override
   public void deposit(double amount) {
      //Override deposit to keep track of transactions
      transactionCount++;
      super.deposit(amount);
   }

   @Override
   public void withdraw(double amount) {
      //Override withdraw to keep track of transactions
	    transactionCount++; // object-specific variable
      super.withdraw(amount);
   }

   public void deductFees()
   {
     if (transactionCount > FREE_TRANSACTIONS) {
        double fees = TRANSACTION_FEE_MULTIPLIER * (transactionCount - FREE_TRANSACTIONS);
        withdraw(fees);
      }
      transactionCount = 0;
    }

}
