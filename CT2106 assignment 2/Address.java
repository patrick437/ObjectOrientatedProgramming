

public class Address
{
    // instance variables - replace the example below with your own
    private String line1;
    private String line2;
    private String line3;
    private String country;
    private String eircode;
    
    //Constructor to read in a address 
    public Address(String l1, String l2, String l3, String country, String eircode)
    {
        // initialise instance variables
        line1 = l1;
        line2 = l2;
        line3 = l3;
        this.country = country;
        this.eircode = eircode;
    }

    //get method in order for other classes to access the address of there customers
    public String getAddress()
    {
        return "line 1:" +line1+ "\nline 2:" +line2+ "\nline 3:" +line3+ "\nCountry:" +country+ "\nEircode:" +eircode; 
    }
}
