public class HourlyEmployee extends Employee
{
    // adds instance variables:
    private double wage;
    private double hours;

    // inherits:
    //  name (but it's private, so it can't directly access it ;-)
    //  getName()
    //  earnings()
    //  toString() -> prints the employee name

    public HourlyEmployee(String n, double w, double h) {
        super(n); // Employee(n)
        // What if I comment out super(n)? What gets called?

        wage = w;
        hours = h;

        // Can I have super(n) below?
        // super(n);
    }

    // Overriding earnings()
    @Override
    public double earnings() {
        return wage * hours;
    }

    // Overriding toString()
    @Override
    public String toString() {
    // explicitly invoke parent's toString()? yes, allowed!
    return super.toString() + ", earnings=" + earnings();

    // a different way of accomplishing the above logic:
    // return super.getName() + ", earnings=" + earnings();
    }

    // testing
    public static void main(String[] args){
        HourlyEmployee e1 = new HourlyEmployee("Bob", 20, 40);
        HourlyEmployee e2 = new HourlyEmployee("Nancy", 25, 40);
        System.out.println(e1);
        System.out.println(e2);
    }

}
