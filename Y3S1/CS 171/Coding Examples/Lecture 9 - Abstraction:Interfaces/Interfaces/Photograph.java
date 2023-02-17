/** Class for photographs that can be sold. */
public class Photograph implements Sellable {
  private String description;  // description of this photo
  private int price;        // the price we are setting
  private String item;    // true if photo is in color


  // TODO: What methods do I need to implement? 

  // Constructor 
  public Photograph(int p, String i, String d){
    this.price = p;
    this.item = i;
    this.description = d;
  }

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
}
