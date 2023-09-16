

public class Email
{
    // instance variables - replace the example below with your own
    private Customer customer1;
    private ShoppingCart shoppingcart1;
    private Order order1;
    private Payment payment;
    
    //Constructor for email not sure why a customer object was read in there 
    public Email(Customer Customer1)
    {
        this.customer1 = customer1;
    }

    //Method in order to send the email and if the payment info has been validated it sends a positive message if not it sends a negative message
    public void sendEmail()
    {
        
        System.out.printf("Dear %s your order has been received\n", customer1.getFirstName());
        
        if(payment.validInfo() == true){
        System.out.printf("Your order consistes of:");
        shoppingcart1.listOfShopping();
        System.out.println("These products will soon be dispatched to you in the next couple of days");
        System.out.println("Thank you for your business");
        }

        else{
            System.out.printf("Unfortunately, the payment for your order has failed, we ask that you check your detils and try again");
        }
    }
    
}
