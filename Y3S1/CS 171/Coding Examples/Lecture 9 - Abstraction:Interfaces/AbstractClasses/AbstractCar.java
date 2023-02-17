public abstract class AbstractCar { // so far, do we need the keyword abstract?
  private String brand;
  private String model;
  private String color;
  private double mileage;

  public AbstractCar(String b, String m, String c){
    this.brand = b;
    this.model = m;
    this.color = c;
    this.mileage = 0.0;
  }

  public String toString(){
    return "Brand: " + brand + ", Model: " + model + ", Color: " + color;
  }

  public void run(double miles){
    mileage += miles;
  }

  public double getMileage(){ 
    return mileage;
  }

  public abstract void driveSelf (double miles); // because of this one line, the whole class is now an abstract class 

}
