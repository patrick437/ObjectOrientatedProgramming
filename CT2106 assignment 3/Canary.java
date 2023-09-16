
/**
 * Write a description of class Canary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Canary extends Bird
{
    // instance variables - replace the example below with your own
    String name;

    
    public Canary(String name)
    {
        super();  //using super method to get variables to get animal and bird constructor
        this.name = name;  //Setting the name variable
        colour = "yellow"; //Changing colour variable to better describe a canary
    }

    
    
    @Override
    public void sing(){
        System.out.printf("Tweet Tweet Tweet");  //overriding sing method to better describe what sound a bird makes
    }
    
    public String toString(){ //ToString  method to describe all the variables that describe a canary
        String strng1 = "";
        strng1 += "   ////////////////////\n";
        strng1 += "Canary;\n";
        strng1 += "Name: " ;
        strng1 += name;
        strng1 += "/n" ;
        strng1 += "Colour: ";
        strng1 += colour;
        strng1 += "\n";
        strng1 += "Feathers: ";
        strng1 += hasFeathers;
        strng1 += "\n";
        strng1 += "Wings: ";
        strng1 +=  hasWings; 
        strng1 += "\n";
        strng1 +=  "Flies: ";
        strng1 += flies;
        strng1 += "\n";
        strng1 += "Breathes: ";
        strng1 += breathes;
        strng1 += "\n";
        strng1 += "Skin: ";
        strng1 += hasSkin;
        strng1 += "\n";              
        return strng1;
    }
    
    @Override
    public boolean equals(Object obj)//Equals method to compare the names of two objects to see if there the same 
    {
        if(obj == null) //if object doesnt have any values return false
        {
            return false;
        }
        
        if (obj instanceof Canary) //if the object is a canary class carry out the if statement
        {
            Canary otherBird = (Canary)obj;
            if(this.getName().equals(otherBird.getName())) //if the two canaries have the same name return true
            {
                return true;
            }
        }
        
        return false; //if they dont have same name return false
    }
    
    @Override
    public String getName(){ //method to get the name of each object
        return this.name;
    }
}
