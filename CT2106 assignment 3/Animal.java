
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animal
{
    // instance variables - replace the example below with your own
    boolean hasSkin;  //Add attributes that all animals have
    boolean breathes;
    String colour;

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        // initialise instance variables
        breathes = true;  //Set these attributes to describe every animal.
        hasSkin = true;
        colour = "grey";
    }

   
    public abstract void move(int distance);  //abstract move method that will be applied to every class
    public abstract String getName();   //abstract method to get each objects name, neede to getName out of an array.
}
