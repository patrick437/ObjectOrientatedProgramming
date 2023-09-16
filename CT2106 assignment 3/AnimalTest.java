
/**
 * Write a description of class AnimalTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnimalTest
{
    // instance variables - replace the example below with your own
    
    
    public static void main(String[] args)  //main method
    {
        AnimalTest test = new AnimalTest();
        test.test1();  //calling two test variables one which prints the toStrings and the other carries out equals method
        test.test2();
    }

    /**
     * Constructor for objects of class AnimalTest
     */
    public AnimalTest()
    {
        // initialise instance variables
                
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void test1()
    {
        Animal[] animals = new Animal[4];
        animals[0] = new Canary("Bluey");  //Places all the objects into an array
        animals[1] = new Ostrich("Ted");
        animals[2] = new Shark("Jaws");
        animals[3] = new Trout("Salmon");
        
        for(int i=0; i<animals.length; i++) //prints the array out autoamtically printing out the toString methods
        {
            System.out.print("\n"+ animals[i]+ "this is elemenet number " + i +"\n\n  //////////////////\n");
        }
    }
    
    public void test2()
    {
        Animal[] animals = new Animal[4];  //Placing obhects into an array again
        animals[0] = new Canary("Bluey");
        animals[1] = new Ostrich("Ted");
        animals[2] = new Shark("Jaws");
        animals[3] = new Trout("Salmon");
        
         for(int i=0; i<4; i++)  //Using a nested for loop to compare every object with each other
        {
            for( int y=0; y<animals.length; y++)
            {
             if(animals[i].equals(animals[y]))
             { //if they are the same print this statemnet
                 System.out.println( "\n" +animals[i].getName()+ " is the same as " +animals[y].getName()+  "\n\n     %%%%%%%%%%%%%");
             }
             
             else
             {  //if they are not the same print this staemnt 
                 System.out.println("\n" +animals[i].getName()+ " is not the same as "+animals[y].getName()+ "\n\n     %%%%%%%%%%%%%");
             }
            }
        }
    }
}
