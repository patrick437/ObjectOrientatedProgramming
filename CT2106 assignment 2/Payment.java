

public class Payment
{
    // instance variables - replace the example below with your own
    private Customer customer1;
    private Address address1;
    private String creditCardType;
    private long creditCardNo;
    private double price;

    //Constructor for the payment class according to the assignment description
    public Payment(Customer customer1, Address address1, String creditCardType, long creditCardNo, double price)
    {
        // initialise instance variables
        this.customer1= customer1;
        this.address1 = address1;
        this.creditCardType = creditCardType;
        this.creditCardNo = creditCardNo;
        this.price = price;
    }

    
    //Attempt to validate that the card card number size and name and validate the info if it is correct
    public boolean validInfo(){
        if( 999999999999999L < creditCardNo && creditCardNo < 10000000000000000L){
            if(creditCardType == "MasterCard" || creditCardType == "Visa"){
            return true;
            }
        }
        return false;
    }
    
}
