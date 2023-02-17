public class ShapeTester {

  // !!!Important!!!
  // All methods in this class should be declared "static"

  // A public method isLarger which takes as input two shapes
  // (a Circle first, then a Rectangle) and returns true if the area of
  // the circle is bigger than (or equal to) the area of the rectangle,
  // false otherwise.


    public static boolean isLarger(Circle a, Rectangle b){ // circle first, rectangle second
        if(a.getArea() >= b.getArea()){
            return true;
        } else {
            return false;
        }
    }

  // A public method longerPerim which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the length of the perimeter of the longer of the two objects.
  

    public static double longerPerim(Circle a, Rectangle b){
        if(a.getCircumference() > b.getPerimeter()){
            return a.getCircumference(); // if a is larger than b; return a
        } else { // otherwise, return b
            return b.getPerimeter();
        }
    }

  // Another version of the public method longerPerim which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object. The method also returns the length of
  // the perimeter of the longer of the two objects.
  
  // Method Overloading
  public static double longerPerim (Rectangle b, Circle a) {
    if(a.getCircumference() > b.getPerimeter()){
      return a.getCircumference();
    } else {
      return b.getPerimeter();
    } 
	}

  // A public method largerArea which takes as input
  // a Circle object followed by a Rectangle object and returns
  // the area of the larger of the two objects.
  
  public static double largerArea(Circle a, Rectangle b){
    if(a.getArea() > b.getArea()){
      return a.getArea();
    } else {
      return b.getArea();
    }
  }

  // Another version of the public method largerArea which has the
  // same name and functionality but it takes as input a Rectangle object
  // followed by a Circle object.
  
  // More method overloading

    public static double largerArea(Rectangle b, Circle a){
      if(a.getArea() > b.getArea()){
        return a.getArea();
      } else {
        return b.getArea();
      }
    }

  // A public method containsCenter which takes as input two circles,
  // and returns true if the first circle contains the center of the second circle,
  // false otherwise.
  // TODO: [10 pts] Add your code here ... //

  public static boolean containsCenter (Circle x, Circle y){

    // storing the center of Circle y into an array 
    double center[] = y.getCenter();
    if(x.containsPoint(center[0], center[1])){ // looking to see if x contains the points at index 0 and 1
      return true;
    } else {
      return false;
    }
  }

}
