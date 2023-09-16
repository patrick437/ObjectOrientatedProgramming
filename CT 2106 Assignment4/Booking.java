
/**
 * Write a description of class Booking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Booking
{
    //Creating necessary variables in order to make a succesful booking
    private Routes route;
    private int passengers;
    
    public Booking(Routes route, int capacityOfBooking) //calling in a route and the number of passengers on a booking in constructor
    {
        this.route = route;  //setting these values to variables in the class
        passengers = capacityOfBooking;
    }
    
    public void makeBooking(Booking booking)//method to allow the booking object to make a booking on the bus
    {
        if( passengers< route.getAvailibleSeats())//if the number of passengers is less then the availible seats then carry out procedure
        {
            route.resetCapacity(passengers); //Carry out the reset capacity method on the number of passengers variable
        }
        else //If there is too many passengers trying to book then print out following message
        {
            System.out.println("Sorry we dont have enough space for the booking to be succesful\n");
        }
    }
}
