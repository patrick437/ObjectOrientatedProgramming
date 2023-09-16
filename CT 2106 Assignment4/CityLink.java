
/**
 * Write a description of class CityLink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CityLink extends BusCompany
{
    public CityLink(){
        //Adding different routes to the routes array
        super();
        routes.add(route41);
        routes.add(route52);
        routes.add(route34);
    }
    
    //creating three different route objects
    Routes route41 = new Routes("Galway", "Dublin", "10/11/2021", "10:21", "10/11/2021", "12:40", 41,41, 34, 5);
    Routes route52 = new Routes("Galway", "Cork", "12/11/2021", "2:40", "12/11/2021", "5:20", 52,52, 28, 6);
    Routes route34 = new Routes("Belfast", "Maynooth", "22/10/2021", "11:52", "22/10/2021", "3:22",52, 52, 46, 8);
}
