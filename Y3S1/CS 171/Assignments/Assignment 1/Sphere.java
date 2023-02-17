public class Sphere extends Circle{
    
    // instance variables
    private double z; // z coordinate since a sphere is 3D

    public Sphere(){ // constructor with z and radius of 1
        super();
        z = 0.0;
        radius = 1;
    }

    public Sphere(double ex, double why, double zeee, double r){ // constructor with parameters
        super(r, ex, why);
        z = zeee;

    }

    @Override
    public double[] getCenter(){ // gets the center of the sphere and stores it into an array
        double [] sphereCenter = {super.x, super.y, this.z};
        return sphereCenter;
    }

    public void setCenter(double ex, double why, double zeee){
        super.setCenter(ex, why); // use the super method to make things easier
        z = zeee;
    }  
    
    @Override
    public double getArea(){ 
        // Area = 4 * pi * radius ^2
        return super.getArea() * 4;
    }

    public double getVolume(){
        // volume of a sphere is 4/3(pi)(radius)^3
        return super.getArea() * (4.0/3.0 * super.getRadius());
    }
}