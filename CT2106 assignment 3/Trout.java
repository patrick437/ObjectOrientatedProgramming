
/**
 * Write a description of class Trout here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trout extends Fish
{
    // instance variables - replace the example below with your own
    boolean hasSpikes;  //Create variables to describe a Trout
    boolean edible;
    boolean swimsUpriverToLayEggs;
    String name;

    /**
     * Constructor for objects of class Trout
     */
    public Trout(String name)
    {
        // initialise instance variables
        super(); //using super method to get variables to get animal and fish constructor
        hasSpikes = true;  //Setting the variables to describe an Shark
        colour = "brown";  //changing the colour variable to better describe a trout
        edible = true;
        swimsUpriverToLayEggs = true;
        this.name = name;  //Setting the name variable
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void move(int distance){
        System.out.printf("I swim %d upriver to lay eggs", distance);  //overriding the move method to better describe a trout
    }
    
    public String toString(){ //ToString  method to describe all the variables that describe a trout
        String strng3 = "";
        strng3 += "Trout;";
        strng3 += "\n";
        strng3 += "Name: ";
        strng3 += name;
        strng3 += "\n"; 
        strng3 += "Colour: ";
        strng3 += colour;
        strng3 += "\n";
        strng3 += "Spikes: ";
        strng3 += hasSpikes;
        strng3 += "\n";
        strng3 += "Lays eggs: ";
        strng3 += swimsUpriverToLayEggs;
        strng3 += "\n";
        strng3 += "Edible: ";
        strng3 += edible;
        strng3 += "\n";
        strng3 += "Fins: ";
        strng3 += hasFins;
        strng3 += "\n";
        strng3 += "Swims: ";
        strng3 += canSwim;
        strng3 += "\n";
        strng3 += "Gills: ";
        strng3 += hasGills;
        strng3 += "\n";
        strng3 += "Breathes: ";
        strng3 += breathes;
        strng3 += "\n";
        strng3 += "Skin: ";
        strng3 += hasSkin;
        strng3 += "\n";    
        
        return strng3;
    }
    
    
    public boolean equals(Object obj) //Equals method to compare the names of two objects to see if there the same
        {
            if(obj == null) //if object doesnt have any values return false
            {
                return false;
            }
            
            if (obj instanceof Trout) //if the object is of the trout class carry out the if statement
            {
                Trout otherFish = (Trout)obj;
                if(this.getName().equals(otherFish.getName())) //if the two trouts have the same name return true
                {
                    return true;
                }
            }
            
            return false;  //if they dont have same name return false
        }
    
    @Override
    public String getName() //method to get the name of each object
    {
        return name;
    }
}
