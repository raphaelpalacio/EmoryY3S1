public class PointTester {
    public static void changePoint(Point p){
        /*
         Apply different types of changes
         To point 'p' and verify if the changes are reflected
         */

         // 1. change x or y coordinates in object "p"
        //p.setX(5);
         // 2. make p point to null
        //p = null;
         // 3. reinitialize p to a new point
         //p = new Point();
    }   


    public static void main(String[] args){
    
        // point1 using no argumetn constructor
        Point point1 = new Point();
        System.out.println("point1(x,y)= ("+ point1.getX()+ "," + point1.getY() + ")");

        Point point2 = new Point(3,8);
        System.out.println("point1(x,y)= ("+ point2.getX()+ "," + point2.getY() + ")");


    }
}
