// class Tesla should extend AbstractCar: 
public class Tesla extends AbstractCar{
    
    // constructor
    public Tesla(String model, String color){
        super("Tesla", model, color);
    }
    
    
    // provide implimentation for the method 
    // driveSelf

    public  void driveSelf (double miles){
        run(miles);
        System.out.println("Miles so far: " + getMileage());
    }

    public static void main (String[] args){
        AbstractCar car = new Tesla("Model X", "Pink");
        System.out.println(car);
        car.driveSelf(100);

    }
}