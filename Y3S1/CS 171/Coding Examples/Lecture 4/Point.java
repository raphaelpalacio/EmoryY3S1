public class Point {
    // Instance Variables
    private int x;
    private int y;

    // 1. No argument constructor (no paramters)
    public Point(){
        x = -1;
        y = -1;
    }

    // 2. Constructor that takes initial values for (x,y)
    /*
     If you dont provide any explicit constructors,
     java will create a no argument constructor
     */
    public Point(int xPoint, int yPoint){
        x = xPoint;
        y = yPoint;
        /*
         this.x = x;
         this.y = y;
         */
        // this. allows you to have paramters that are the same name as instance variables
        // it refers to the current object's variables



    }
    //3. Common Opterations (Instance Methods)
    // Getters (public):

    public int getX(){ // gets x value
        return x;
    }

    public int getY(){// gets y value
        return y;
    }

    //Setters(public)""
    public void setX(int xPoint){
        x = xPoint;
    }

    public void setY(int yPoint){
        y = yPoint;
    }
}
