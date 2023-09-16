
/**
 * Write a description of class GoBus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoBus extends BusCompany
 {
     public GoBus() 
     {
         //adding routes to the routes array
         super();
         routes.add(route9);
         routes.add(route4);
         routes.add(route2);
     }
     
     
     //creating a multiple routes objects for the goBus company
     Routes route9 = new Routes("Galway", "Paris", "12/6/2021", "2:04", "13/6/2021", "11:32", 9, 9, 38, 45);
     Routes route4 = new Routes("Galway", "Glasgow", "10/4/2021", "11:42", "12/4/2021", "12:40", 4, 4, 40,60);
     Routes route2 = new Routes("Dublin", "Madrd", "13/4/2021", "8:22", "15/4/2021", "7:30", 2, 2, 22, 35);
 }

