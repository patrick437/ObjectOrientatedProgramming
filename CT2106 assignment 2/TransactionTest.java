
public class TransactionTest
{
    
    
    public static void main(String[] args)
    {
        TransactionTest test = new TransactionTest();
        test.transaction1();
    }
    
    public void transaction1(){
        //Making a customer object and shopping cart object
        Customer customer1 = new Customer("Patrick", "Noonan", "patrickgnoonan@gmail.com");
        ShoppingCart shoppingCart1 = new ShoppingCart();
        //Creating items to place in the shopping cart
        Items spaghetti = new Items("spaghetti", 14.6); 
        Items chocolateMilk = new Items("chocolateMilk", 8.5);
        Items avocado = new Items("avocado", 4.2);
        
        //Adding all these items to the shopping cart
        shoppingCart1.addItem(avocado);
        shoppingCart1.addItem(chocolateMilk);
        shoppingCart1.addItem(spaghetti);
        shoppingCart1.close();
        
        //Entering an address to the address object
        Address address1 = new Address("Corrib Village", "Dangan", "Co.Galway", "Ireland", "H91TY8C");
        
        //Creating a payment object
        Payment payment = new Payment(customer1, address1, "MaterCard", 1010234838273849L, shoppingCart1.getTotal());
        
        //Creating a order object 
        Order order1 = new Order(shoppingCart1);
        order1.printArray();
        //shoppingCart1.listOfShopping();
        
        //Creating an email object
        Email email = new Email(customer1);
        //Calling the email method to email custimer whether the payment has been received
        email.sendEmail();
    }
    
    public void transaction2(){
        
    }
    
    public void transaction3(){
        
    }
}
