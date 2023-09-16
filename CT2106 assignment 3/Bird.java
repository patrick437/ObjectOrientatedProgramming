
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Bird extends Animal
{
    // instance variables - replace the example below with your own
    boolean hasFeathers;  //creating attributes that describe a bird
    boolean hasWings;
    boolean flies; 
    

    /**
     * Constructor for objects of class Bird
     */
    public Bird()
    {
        // initialise instance variables
        super();  //Have to use super method to have all the variables from the animal constructor
        colour = "black";     //resetting the colour variable to better describe a bird
        hasFeathers = true;  //Setting these variables to the values that describe a bird.
        hasWings = true;
        flies = true;    
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sing(){
        System.out.printf("Shalalalaal");  //creating a sing method which describes the sound a bir makes
    }
    
    @Override
    public void move(int distance){
        System.out.printf("I fly %d", distance);  //Overriding the abstract move method to describe how a bird moves
    }
    
    
    
    
   
}
