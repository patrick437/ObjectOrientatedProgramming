

public class Customer
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String surName;
    private String emailAddress;
    private final long customerId;
    private ShoppingCart shoppingCart1;
    
    //Customer constructor which calls in all the variables for the object
    public Customer(String firstName, String SurName, String emailAddress)
    {
        this.firstName = firstName;
        this.surName = surName;
        this.emailAddress = emailAddress;
        customerId = makeCustomerId();
    }
    
    //Making  a random number for the customerID
    public long makeCustomerId(){
        long random = (long)(Math.random()*999999999);
        return random;
    }
    
    //Method so other classes can access the customer ID if required
    public long getId()
    {
        return customerId;
    }
    
    //Get mwthod so other classes will be able to access the customers first name
    public String getFirstName()
    {
        return firstName;
    }
    
    //get method so other classes will be able to access the customers surname
    public String getSurName()
    {
        return surName;
    }
}
