
/**
 * Write a description of class Items here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Items
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;
    private long itemId;
    
    public Items(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getItemName()
    {
        return name;
    }
    
    public double getItemPrice(){
        return price;
    }
}
