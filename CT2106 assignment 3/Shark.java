
/**
 * Write a description of class Shark here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shark extends Fish
{
    // instance variables - replace the example below with your own
    String name;  //Create variables to describe a shark
    boolean canBite;
    boolean isDangerous;

    /**
     * Constructor for objects of class Shark
     */
    public Shark(String name)
    {
        // initialise instance variables
        super();   //using super method to get variables to get animal and fish constructor
        this.name = name;  //Setting the name variable
        canBite = true;  //Setting the variables to describe an Shark
        isDangerous = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   
    public String toString(){  //ToString  method to describe all the variables that describe a shark
        String strng4 = "";
        strng4 += "Shark;";
        strng4 += "\n";
        strng4 += "Name: ";
        strng4 += name;
        strng4 += "\n";
        strng4 += "Bites: ";
        strng4 += canBite;
        strng4 += "\n";
        strng4 += "Dangerous: ";
        strng4 += isDangerous;
        strng4 += "Fins: ";
        strng4 += hasFins;
        strng4 += "\n";
        strng4 += "Swims: ";
        strng4 += canSwim;
        strng4 += "\n";
        strng4 += "Gills: ";
        strng4 += hasGills;
        strng4 += "\n";
        strng4 += "Breathes: ";
        strng4 += breathes;
        strng4 += "\n";
        strng4 += "Skin: ";
        strng4 += hasSkin;
        strng4 += "\n";  
        
        return strng4;
    }
    
    //@Override
    public boolean equals(Object obj) //Equals method to compare the names of two objects to see if there the same
    {
        if(obj == null) //if object doesnt have any values return false
        {
            return false;
        }
        
        if (obj instanceof Shark) //if the object is a shark class carry out the if statement
        {
            Shark otherFish = (Shark)obj;
            if(this.getName().equals(otherFish.getName()))  //if the two sharks have the same name return true
            {
                return true;
            }
        }
        
        return false; //if they dont have same name return false
    }
    
    @Override
    public String getName() //method to get the name of each object
    {
        return name;
    }
}
