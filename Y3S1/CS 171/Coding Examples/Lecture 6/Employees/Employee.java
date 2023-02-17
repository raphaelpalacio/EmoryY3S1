public class Employee
{
    // Employee has one private member variable: name
    private String name;

    // Employee constructors
    public Employee (String n) {
      System.out.println("Inside Employee(String n)");
      name = n;
    }
    public Employee() {
      // name = "Unknown";
      this("Unknown"); // alternate way to set name
      System.out.println("Inside Employee()");
    }

    public String getName() {
      return name;
    }

    public double earnings () {
      return 0;
    }

    // Overriding toString() method which is
    // inherited from Object
    public String toString() {
      return name;
    }

    // TODO: Override method equals() which is inherited from Object
    // If you don't override equals()? => returns true iff
    // memory references/addresses are equal!
    // Return true iff the two Employees have the same name
    // and make the same earnings, false otherwise
    /*
    @Override
    public boolean equals(Object obj){
        // ... //
    }
    */

    public static void main(String[] args) {
        Employee e1 = new Employee("A");
        Employee e2 = new Employee("B");
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        Employee e3 = new Employee();
        System.out.println("e3: " + e3);

        // Tests:
        System.out.println("e1 and e2 are the same employee: " + e1.equals(e2));
        Employee e4 = new Employee();
        System.out.println("e4: " + e4); // does this work? what is printed?
        System.out.println("e3 and e4 are the same employee: " + e3.equals(e4));
    }

}
