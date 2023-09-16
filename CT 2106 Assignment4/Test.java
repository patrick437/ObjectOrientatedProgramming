
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    
    
    public static void main(String[] args)
    {
        Test test = new Test(); //craeting test object
        
        test.test1();  //calling the actual test method
        
        
    }
    
    public void test1()
    {
    
        BusEireann busEireann = new BusEireann();  //Creating an object for each of the three bus companies
        GoBus goBus = new GoBus();
        CityLink cityLink = new CityLink();
        
        Routes routeForBooking = busEireann.selectRoute(404); //creating a Route variable which is equal to a particular route which will be used for booking
           
        System.out.print(goBus.printAllTrips());  //printing out the three separate arrays for each bus company
        System.out.print(cityLink.printAllTrips());
        System.out.print(busEireann.printAllTrips());
        
        Booking booking = new Booking(routeForBooking, 14); //Creating a booking object
        booking.makeBooking(booking);  //booking a trip by using the method and calling in the booking object
        
        System.out.print(busEireann.printAllTrips()); //reprinting the route that ws booked to see if the capacity has been effected
        
    }
}
