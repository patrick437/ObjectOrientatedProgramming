
/**
 * Write a description of class Ostrich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ostrich extends Bird
{
    // instance variables - replace the example below with your own
    boolean isTall;   //Creating variables that describe an Ostrich
    boolean thinLongLegs;
    String name;
    /**
     * Constructor for objects of class Ostrich
     */
    public Ostrich(String name)
    {
        // initialise instance variables
        super();  //using super method to get variables to get animal and bird constructor
        this.name = name;  //Setting the name variable
        isTall = true;  //Setting the variables to describe an ostrich
        flies = false;
        thinLongLegs = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    @Override
    public void move(int distance){
        System.out.printf("I run %d",distance);  //Overiding move method as ostrich can't fly
    }
    
    public String toString(){  //ToString  method to describe all the variables that describe a ostrich
        String strng2 = "";
        strng2 += "Ostrich;";
        strng2 += "\n";
        strng2 += "Name: ";
        strng2 += name;
        strng2 += "\n";
        strng2 += "Tall: ";
        strng2 += isTall;
        strng2 += "\n";
        strng2 += "Has thin long legs: ";
        strng2 += thinLongLegs;
        strng2 += "\n";
        strng2 += "Feathers: ";
        strng2 += hasFeathers;
        strng2 += "\n";
        strng2 += "Wings: ";
        strng2 +=  hasWings; 
        strng2+= "\n";
        strng2 +=  "Flies: ";
        strng2 += flies;
        strng2 += "\n";
        strng2 += "Breathes: ";
        strng2 += breathes;
        strng2 += "\n";
        strng2 += "Skin: ";
        strng2 += hasSkin;
        strng2 += "\n";  
        
        return strng2;
        
    }

    @Override
    public boolean equals(Object obj)//Equals method to compare the names of two objects to see if there the same
    {
        if(obj == null) //if object doesnt have any values return false
        {
            return false;
        }
        
        if (obj instanceof Ostrich)  //if the object is a ostrich class carry out the if statement
        {
            Ostrich otherBird = (Ostrich)obj;
            if(this.getName().equals(otherBird.getName()))  //if the two ostriches have the same name return true
            {
                return true;
            }
        }
        
        return false; //if they dont have same name return false
    }
    
    @Override
    public String getName()  //method to get the name of each object
    {
        return name;
    }
    
}
