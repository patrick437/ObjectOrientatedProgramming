
/*
 * @Patrick Noonan
 * 2.2
 */
public class Testcar
{
    //main method takes in names of wheel, cars and engines and adds them to different objects and prints out fuel level
    public static void main(String[] args){
            Car car = new Car("X7");
            Engine engine = new Engine("DR9", 43);
            car.add(engine);
            Wheel wheel = new Wheel("Wichelin15", 15);
            car.add(wheel);
            engine.setFuel(-50);
            System.out.printf("Current fuel: %.2f\n",engine.getFuelLevel());
            car.drive();
            car.printState();
            engine.setFuel(110);
            System.out.printf("Current fuel: %.2f\n",engine.getFuelLevel());
            car.drive();
            car.printState();
        
    }          
}
