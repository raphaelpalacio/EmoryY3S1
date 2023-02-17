public class SavingsAccount extends BankAccount {
        /* private variable capturing interest*/
        private double interestRate;

        public SavingsAccount() {
            super();
            interestRate = 10;
        }
        public SavingsAccount(double initialBalance, double rate) {
            super(initialBalance);
            interestRate = rate;
        }

        public void setInterest(double rate) {
            interestRate = rate;
        }

        public void addInterest() {
            double interest = (interestRate/100.0)*getBalance();
            deposit(interest);
        }

    // TODO: Override BankAccount class toString() method
}
