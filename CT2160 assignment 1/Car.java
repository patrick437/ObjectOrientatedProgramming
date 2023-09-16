
/**
 * @Patrick Noonan
 * @2.2
 */
public class Car
{
    //Call in all the variables that need to be called in
    private String name;
    private double distance;
    private double totalDist;
    private Wheel wheel;
    private Engine engine;

    /**
     * Constructor for objects of class Car
     */
    //Create a car constructor so you can make an object in the main method
    public Car(String name)
    {
        this.name = name;
    }

    //method to get the name of the car
    public String getName()
    {
        return name;
    }
    
    //method to det the name of the car 
    public void setName(String name){
        this.name = name;
    }
    
    //method to return the distnce traveled in a journey
    public double getDistance(){
        return distance;
    }
    
    //method to return the total distance traveled by the car
    public double getTotalDist(){
        return totalDist;
    }
    
    //creating a relationship between the car object and engine object(has a relationship)
    public void add(Engine engine){
        this.engine = engine;
    }
    
    public void add(Wheel wheel){
        this.wheel = wheel;
    }
    
    //drive method calculates the distance traveled and the total distance traveled by the car
    public double drive(){
        distance = wheel.getCircumference()* engine.getFuelLevel() * engine.getTpl();
        totalDist += distance;
        return distance;
    }
    
    //Print state returns all the known variables that is associated with the car, engine and wheel.
    //If fuel is  a incorrect value it won't display these values as the values will be incorrect.
    public void printState() {
        if(engine.getFuelLevel()<=0 || engine.getFuelLevel()>100)
        System.out.printf("Fuel level is incorrect please enter valid fuel\n\n");
        
        else{
        System.out.printf("Configuration: car body %s\n", this.name);
        System.out.printf("Engine name: %s\n", engine.getName());
        System.out.printf("Engine turns per litre:%.2f\n", engine.getTpl());
        System.out.printf("Engine's total turn count: %.2f\n", engine.getTotalNumTurns());
        System.out.printf("Wheel name: %s\n", wheel.getName());
        System.out.printf("wheel radius: %.2f\n", wheel.getRadius());
        System.out.printf("Wheel circumference: %.2f\n", wheel.getCircumference());
        System.out.printf("Distance this trip: %.2f\n", getDistance());
        System.out.printf("Total distance travelled: %.2f\n\n", getTotalDist());
        }
    }
}
