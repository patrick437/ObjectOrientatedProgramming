import java.util.ArrayList;
/**
 * Write a description of class BusCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BusCompany
{
    //Creating an array list in which all the different routes will be placed
    ArrayList<Routes> routes = new ArrayList<>();
    
    public BusCompany()
    {
        
    }
    
    public String listOfTrips(int i)//Creating a To string method in order to print out all the trips 
    {
           String str = "";
           str += "Start Location: " + routes.get(i).getStartingLocation() + "\n";
           str += "Destination: " + routes.get(i).getDestination() + "\n";
           str += "Date of departure: " + routes.get(i).getDateDeparture() + "\n";
           str += "Time of departure: " + routes.get(i).getTimeDeparture() + "\n";
           str += "Date of Arrival: " + routes.get(i).getDateArrival() + "\n";
           str += "Time of Arrival: " + routes.get(i).getTimeOfArrival() + "\n";
           str += "Trip ID: " + routes.get(i).getTripID() + "\n";
           str += "Capacity: " + routes.get(i).getCapacity() + "\n";
           str += "Availible Seats: " + routes.get(i).getAvailibleSeats() + "\n";
           str += "Fare: " + routes.get(i).getFare() + "\n";
        return str; //returning the string variable
    }
    
    public String printAllTrips()
    {
        String string = "";
        
        for( int i = 0; i<3; i++)  //for loop that is used to print through all of the strings in the above listOfTrips method
        {
            string += listOfTrips(i) + "\n\n";
        }
        return string;
    }
    
    
    public Routes getRoute(int index)//This method used in a few methods to get a particular route
    {   //not sure if needed as used in listAllTrips but variable already in class
        
        if(routes.get(index) != null)
        {
            routes.get(index).getStartingLocation();
            return routes.get(index);
        }
        else
        {
            System.out.println("This route does not apppear to be on the system");
            return null;
        }
    }
    
    public Routes selectRoute(int tripID) //method which used the tripID to get a selected trip
    {    //mainly created just for the booking class
        for(int i = 0; i<routes.size(); i++)
        {
            if(getRoute(i).getTripID() == tripID)
            {
                return getRoute(i);
            }
        }
        
        return null;
    }
    
    public void addRoute(Routes route)//this is used to add routes to the array rotes
    {
        routes.add(route);
    }  //is this method used???
    
}


