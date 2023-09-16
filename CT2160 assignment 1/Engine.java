
/**
 * Patrick Noonan
 * @2.2
 */
public class Engine
{
    //Calling in all the different variables for the class
    private String name;
    private double tpl;
    private double totalNumTurns;
    private double fuelLevel;
    
    //Creating a constructor so you can make a engine object in the main method
    public Engine(String name, float tpl)
    {
        this.name = name;
        this.tpl = tpl;
    }
    
    //method to get the name associated with the object
    public String getName()
    {
        return name;        
    }
    
    //nethod to set/change the name of the object
    public void setName(String name){
        this.name = name;
    }
    
    //method to get TPL variable used in the distance equation and total number of turns equation
    public double getTpl(){
        return tpl;
    }
    
    //method to change turns per litre variable
    public void setTpl(double Tpl)
    {
        tpl = Tpl;
    }
    
    //method to get the fuel level.
    public double getFuelLevel(){
            return fuelLevel;
    }
    
    //method to set the fuel level. If fuel level is entered incorrectly it will set the variable = 0
    public void setFuel(double fuel){
        if(fuel<0 || fuel>100)
        fuelLevel = 0;
        else
        fuelLevel = fuel;
    }
    
    //method to calculate the total number of turns made by the wheel in a journey
    public double getTotalNumTurns(){
        totalNumTurns = getTpl() * getFuelLevel();
        return totalNumTurns;
    }
    
    
}
