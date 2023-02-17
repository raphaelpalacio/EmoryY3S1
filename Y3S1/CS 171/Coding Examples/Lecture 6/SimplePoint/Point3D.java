public class Point3D extends Point {
  // What did we inhert?
  /* 
   Data: int x, int y
   Methods: getX, getY, setX, setY, printcoordinates, toString
   */

  // what do we want to add?
  private int z;


  // Constructors -> initialize the state of the object
  public Point3D(){
    // first: construct the parent class
    /*
     If we dont have an explicit call to the parent's constructor
     Java is going to invoke the parent's
     no argument constructor
     */

     super(); // super has to tbe the first thing; this is calling the point no constructor
     z = -1; // Call the super class's no input constructor and adding the z coordinate
     System.out.println("[INFO] Inside Point3D(x, y, z)");
  }

  public Point3D(int x, int y, int z){
    //this.x = x; is not allowed because x is private in the parent class

    super(x, y); // Initializes X and Y
    this.z = z;
  }
  /*
   What do we want to override?
   toString()
   printCoordinates()
   */

   @Override
   public String toString(){
    String s = super.toString() + "and z = " + z;
    return s;
   }



   public static void main (String[] args){
    Point3D p3d = new Point3D();
    System.out.println(p3d);

    p3d = new Point3D(1, 2, 3);
   }
}
