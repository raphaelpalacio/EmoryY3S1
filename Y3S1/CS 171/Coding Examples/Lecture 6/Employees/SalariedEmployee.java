import java.util.function.ToDoubleBiFunction;

public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    public SalariedEmployee(String n){
      super(n);
      weeklySalary = 0.0;
    }

    public SalariedEmployee(String n, double salary) {
        super(n); // --> Employee(String n)
        // if we don't have an explicit call to the parent's
        // constructor --> super(); the no-argument constructor
        System.out.println("Inside SalariedEmployee(String n, double salary)");
        // super(n);   //invalid
        weeklySalary = salary;
    }

    @Override
    public double earnings() {
        return weeklySalary;
    }

    // TODO: Override equals() to provide a meaningful equality
    // check for salaried employees:
    //    (a) names must be equal
    //    (b) weeklySalary must be equal
    @Override
    public boolean equals(Object obj) {// Object becuase of the overall Object class

    
    // Tentative steps (TODO please implement this!):
       // 1. check instanceof SalariedEmployee ...?
       //TODO 
       // 2. cast to SalariedEmployee
        //SalariedEmployee temp = (SalariedEmployee) obj; // casting obj to SalariedEmployee

        if (!(obj instanceof SalariedEmployee)) return false; // This is checking if the object is a SalariedEmployee
        
      // Since name is a private variable from the parent class, you need to use the getter method
      

       // 3. comparison elements:
       // 3.a)  super.getName() or getName() - can't invoke name directly (private variable!)
       // 3.b)  compare weeklySalary using the earnings() method!

       return getName().equals(temp.getName()) && earnings() == temp.earnings();
       // past employee name vs current employee name  
       // temp.getName() is accessing the name of the SalariedEmployee
       // getName() is the first name
    }

    public static void main(String[]args){
      SalariedEmployee se1 = new SalariedEmployee("Mario");
      SalariedEmployee se2 = new SalariedEmployee("Cindy", 100);

      System.out.println(se1.equals(se2));

      //the first getName() in equals is checkin se1, then within equals, it accesses the paramters name

    //   System.out.println("se1: " + se1);  // toString() => Mario
    //   System.out.println("Mario's earnings: " + se1.earnings());
    //   System.out.println("se2: " + se2);  // toString() => Cindy
    //   System.out.println("Cindy's earnings: " + se2.earnings());

    //   SalariedEmployee se1_copy = new SalariedEmployee("Mario");
    //   System.out.println(se1.equals(se1_copy)); // true
    //   SalariedEmployee se2_copy = new SalariedEmployee("Cindy", 200);
    //   System.out.println(se2.equals(se2_copy)); // false?
    }
}
