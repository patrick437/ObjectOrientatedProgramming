
/**
 * Patrick Noonan
 * 2.2
 */
public class Wheel
{
    //calling in all the instance variables
    private String name;
    private double radius;
    private double circumference;
    
    //constructor i order to create a object in the main method
    public Wheel(String name, double radius)
    {
        this.name = name;
        this.radius = radius;
    }
    
    //method in order to get the radius of the wheel. Used in distance equation
    public double getRadius()
    {
        return radius;
    }
    
    //method to set the radius to a particular value
    public void setRadius( double radius){
        this.radius = radius;
    }
    
    //method to get the name of the wheel object
    public String getName(){
        return name;
    }
    
    //method to set the name of the the wheel object
    public void setName(String name){
        this.name = name;
    }
    
    //method to calculate circumference and also access the value
    public double getCircumference(){
        circumference = getRadius()*Math.PI*2;
        return circumference;
    }
}
