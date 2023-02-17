// This class represents a rectangle shape
public class Rectangle {

		private double L; // the length of the rectangle
		private double H; // the height of the rectangle
		private double x; // the x coordinate of the  bottom left corner of the rectangle
		private double y; // the y coordinate of the bottom left corner of the rectangle

		// A basic constructor that creates a rectangle with
		// side lengths 1 whose bottom left corner is at (0.0,0.0)
		
		public Rectangle(){
			L = 1;
			H = 1;
			x = 0.0;
			y = 0.0;
		}

		// A constructor that takes all four inputs,
		// named Ell, Eich, Ex, and Why for L, H, x, and y, respectively.
	
		public Rectangle(double Ell, double Eich, double Ex, double Why) {
			this.L = Ell;
			this.H = Eich;
			this.x = Ex;
			this.y = Why;
		}

		// A public method called getLength which returns the length.
		
		public double getLength(){
			return this.L;
		}

		// A public method called getHeight which returns the height.
		
		public double getHeight(){
			return this.H;
		}

		// A public method called setLength which takes as input a double
		// called Ell and uses it to set the length of the rectangle.
		
		public void setLength(double Ell){
			this.L = Ell;
		}

		// A public method called setHeight which takes as input a double
		// called Eich and uses it to set the height of the rectangle.
		
		public void setHeight(double Eich){
			this.H = Eich;
		}

		// A public method called getPerimeter which computes and returns
		// the perimeter of the rectangle.
		// Formula is: 2L + 2H

		public double getPerimeter(){
			return ((this.L * 2) + (this.H * 2));
		}

		// A public method called getArea which computes and returns the
		// area of the rectangle.
		// Forumal is: H * L
		public double getArea(){
			return this.H * this.L;
		}

		// Override the method equals which is inherited from class Object
		// (similar to what we did in class Employee), and make it return true if the
		// two rectangles have equal areas, false otherwise
		// Important: Use the @Override annotation
		// TODO: [2 pts] Add your code here ... //
		@Override
		public boolean equals(Object obj){
			if(this == obj){
				return true;
			}
			Rectangle other = (Rectangle) obj; // If the heights dont match -> they are not the equal
			if (H != other.H) {
				return false;
			}
			if (L != other.L) { // If the lengths dont match -> they are not the equal
				return false;
			}
			if (x != other.x) { // If the x's dont match -> they are not the equal
				return false;
			}
			if (y != other.y) { // If the y's dont match -> they are not the equal
				return false;
			}
			return true;
		}

}
