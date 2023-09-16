import java.util.ArrayList;
/**
 * Write a description of class BusEireann here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusEireann extends BusCompany
{
    //Creating 3 routes that the bus eireann company run
    Routes route404 = new Routes("Eyre Squaree", "Oranmore", "5/11/2021", "9:04", "5/11/2021", "9:35", 404, 52, 52, 2.40);
    Routes route409 = new Routes("Eyre Square", "Parkmore", "7/11/2021", "10:06", "7/11/2021", "10:40", 409, 84, 84, 2.50);
    Routes route402 = new Routes("Eyre Square", "Merlin Park", "9/11/2021", "11:21", "9/11/2021", "11:54", 402, 32, 32, 1.80);
    
    
    public BusEireann()
    {
        
        //Adding the three routes to an array
        //Why does it have to be inside constructor???
        super();
        routes.add(route404);
        routes.add(route409);
        routes.add(route402);
    }
    
    
    
    
}
