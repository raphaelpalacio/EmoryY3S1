// Define a class that represents a point,
// with (x,y) coordinates
public class Point{
  // ---------------------------------------- //
  // 1. Instance Variables (Member Data)
  private int x; //default int = 0
  private int y; //default = 0

  // ---------------------------------------- //
  // 2. Constructor(s)
  // If you don't provide any explicit Constructors
  // Java wil create a no-argument implicit constructor
  // ==> public Point(){ }

  // 1) No-argument constructor (doesn't take any parameters)
  public Point(){
    // Initialize instance variables here:
    System.out.println("[INFO] Inside Point(x, y)");
    x = -1;
    y = -1;
  }

  // 2) A constructor that takes initial values
  // for (x,y) as int parameters:
  public Point(int x, int y){
    this.x = x; // "this" references the current object's variables
    this.y = y;
  }

  // ---------------------------------------- //
  // 3. Common operations (Instance Methods)
  // Getters (public):
  public int getX(){ 
    return x; 
  }
  public int getY(){ 
    return y; 
  }

  // Setters (public):
  public void setX( int xPoint ){ this.x = xPoint; }
  public void setY( int yPoint ){ this.y = yPoint; }

  // printCoordinates (public):
  public void printCoordinates(){
    System.out.println("The coordinates of this point object are: (x = " + getX() + ", " + "y = " + getY() + ")");
  }

  // TODO: Override the method toString(), inherited from class Object
  // Use the @Override annotation before your method declaration
  // ... //

  @Override
  public String toString(){
    return " The coordinates of this point object are: (x = " + getX() + ", " + "y = " + getY() + ")";
  }

} // end of class Point definition
