public class PredatoryCreditCard extends CreditCard {
    // add one instnace variabel representing the apr
    private double apr;
    // 7% -> 0.07
    // 12% -> 0.12

    // Constructors
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double aprInit){
        super(cust, bk, acnt, lim, initialBal);
        apr = aprInit;
    }

    // New method processMonth() should assess monthly interst on any outstanding balance (i.e balance > 0)
    public void processMonth(){
        // protected instnace variables can be accesssed by subclasses
        
        if(balance > 0){
            double fees = (apr/12 * balance); 
            // apply the apr, if the balance is larger than 0, apply the fee
            balance += fees;
        }
    }

    // TODO #2: Override charge(double price) inherited from CreditCard class
  // to make it add a $5 fee for an attempted overcharge. More details below:
  /*
   * Method charge(double price) charges given price to the card,
   * assuming sufficient credit limit.
   * Returns true if charge was processed.
   * Returns false and assesses $5 fee if charge is denied.
   */
    @Override // essentially if the balane is maxed add a $5 charge 
    public boolean charge(double price){
        boolean success = super.charge(price); // This runs the logic if the purchace plus the palance is higher than the users limit
        if(!success){
            balance += 5;
        }
        return success;
    }

    @Override
    public boolean equals (Object obj){
        if(!(obj instanceof PredatoryCreditCard)) return false;
        PredatoryCreditCard temp = (PredatoryCreditCard) obj;
        return
        getAccount().equals(temp.getAccount())&& getBalance() == temp.getBalance(); 
    }

}
