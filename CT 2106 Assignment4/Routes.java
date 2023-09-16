import java.util.ArrayList;

public class Routes
{
    //Creating the variables that are required for the constructor
    private String startingLocation;
    private String destination;
    private String dateDeparture;
    private String timeDeparture;
    private String dateArrival;
    private String timeArrival;
    private double fare;
    private int capacity;
    private long tripID;
    private int availibleSeats;
    
    public Routes(String startingLocation, String destination, String dateDeparture, String timeDep, String dateArrival, String timeArrival, long tripID,int capacity,int availibleSeats, double fare )
    {
        //Calling in all the variables that were called in in the constructor and setting them to there correct variables
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDep;
        this.dateArrival = dateArrival;
        this.timeArrival = timeArrival;
        this.tripID = tripID;
        this.capacity = capacity;
        this.availibleSeats = availibleSeats;
        this.fare = fare;
    }
    
    //Creating get methods as they will be needed to create the to string method when listing the trips
    public String getStartingLocation()
    {
        return startingLocation;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public String getDateDeparture()
    {
        return dateDeparture;
    }
    
    public String getTimeDeparture()
    {
        return timeDeparture;
    }
    
    public String getDateArrival()
    {
        return timeArrival;
    }
    
    public String getTimeOfArrival()
    {
        return timeArrival;
    }
    
    public long getTripID()
    {
        return tripID;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public double getFare()
    {
        return fare;
    }
    
    public int getAvailibleSeats()
    {
        return availibleSeats;
    }
    
    //Creating a set method for the capacity as everytime we make a booking we will need the capacity to decrease for number of passengers
    public void resetCapacity(int numberOfPassengers)
    {
        availibleSeats -= numberOfPassengers;
    }
    
}
