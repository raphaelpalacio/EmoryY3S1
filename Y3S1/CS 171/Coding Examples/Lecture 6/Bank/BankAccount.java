public class BankAccount
{
   private double balance; //account balance

   public BankAccount() { balance = 0; }
   public BankAccount(double initialBalance) { balance = initialBalance; }

   public void deposit(double amount) {
      System.out.println("BankAccount.deposit("+amount+")");
      balance = balance + amount;
   }

   public void withdraw(double amount) {
      System.out.println("BankAccount.withdraw("+amount+")");
      balance = balance - amount;
   }

   public void transfer(double amount, BankAccount otherAccount) {
      System.out.println("BankAccount.transfer("+amount+")");
      // withdraw money from this account and deposit to the other
      this.withdraw(amount);
      otherAccount.deposit(amount);
   }

   public double getBalance() {
      return(balance);
   }

   // TODO: Override Object class toString() method

}
