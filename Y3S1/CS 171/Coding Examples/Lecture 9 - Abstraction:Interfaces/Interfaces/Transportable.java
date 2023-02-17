/** TODO: Create an interface for objects that can be transported.
  * Classes that implement this interface should be able to get the
  * "weight" of the transportable object (return: int), and whether
  * it is hazardous (return: boolean)
  */
  
public interface Transportable{
    public int weight();

    public boolean isHazardous();
}