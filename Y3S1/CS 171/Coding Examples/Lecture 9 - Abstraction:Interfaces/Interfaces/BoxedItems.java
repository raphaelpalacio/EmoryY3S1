public class BoxedItems implements Sellable, Transportable {

    // instance varaibles
    private int weight;
    private boolean hazard;
    private int price;
    private String description;
    private String item;

   

    // Box Dimensions
    private int height;
    private int width;
    private int depth;

    // Constructors

    public BoxedItems(int weight, boolean haz, int p, String desc, String i, int h, int w, int d){
        this.weight = weight;
        this.hazard = haz;
        this.price = p;
        this.description = desc;
        this.item = i;
        this.height = h;
        this.width = w;
        this.depth = d;
    }


    // methods

    // sellable methods
    public String description(){
        // return "Photograph by Shane"; // this is not what we should do 
        return description;
      }
    
      /** Returns the list price in cents. */
      public int listPrice(){
        return price;
    
      }
    
      /** Returns the lowest price in cents we will accept. */
      public int lowestPrice(){
        return (price / 2);
    
      }
    
      // need public getter for item
      public String getItem(){
        return item;
      }

      // methods from Transportable
      public int weight(){
        return weight;
      }

      public boolean isHazardous(){
        return hazard;
      }

      public int getHeight(){
        return height;
      }

      public int getWidth(){
        return width;
      }
      public int getDepth(){
        return depth;
      }

      public static void main(String[] args){
        BoxedItems box = new BoxedItems(100, true, 400, "Not a gun", "GUN", 16, 3, 10);
        System.out.println("Item inside the box: " + box.getItem());
        System.out.println("Weight = " + box.weight());
      }
}
