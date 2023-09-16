import java.util.ArrayList;

public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private ArrayList<Items> shoppingCart;
    private double itemPrice;
    private double total;
    private boolean cartOpen;
    private Items item;

    
    public ShoppingCart()
    {
        // initialise instance variables
        shoppingCart = new ArrayList<>();
        cartOpen = true;
    }

    public void addItem(Items item)
    {
        //If the cart is open you are allowed to add items to it
        if(cartOpen == true){
            shoppingCart.add(item);
        }
        //When the cart is closed this message will be printed when items are attempted to be added to it
        else{
            System.out.println("The cart is closed you are not able to add anymore items");
        }
    }
    
    public Items getItem(int index)
    {
        //If the place in the array has a value return that value.
        if(shoppingCart.get(index)!=null)
        {
            return shoppingCart.get(index);
        }
        //If the index doesn't have a value it returns this message
        else
        {
            System.out.println("This item does not appear to be in your shopping cart");
            return null;
        }
    }
    
    //Method to calculate the number of values in a array
    public int numOfItems()
    {
        return shoppingCart.size();
    }
    
    //If the cart isn't locked remove the selected item from the array
    public void removeItem(int index1){
        
        if(cartOpen == true){
            if(shoppingCart.get(index1) != null)
            {
                shoppingCart.remove(index1);
            }
        
            else
            {
                System.out.println("Unable to find product");
            }
        }
        //If the cart is locked it prints this message
        else{
            System.out.println("The cart has been closed you are unable to remove any items");
        }
    }
    
    public void listOfShopping()
    {   //If there is any items in the area it prints them out here using the for loop to print through the array
        if(numOfItems()>0)
        {
            
            for(int i = 0; i<numOfItems(); i++)
            {
                System.out.println("Name:"+getItem(i).getItemName());
            }
        }
        //If the array is empty this message is printed
        else
        {
            System.out.println("This group is currently empty");
        }
        
    }
    
    //This calculates the total in the shopping cart by adding the price of each item using a for loop
    public double getTotal()
    {
        for(int p=0; p<numOfItems(); p++)
        {
            double itemPrice = getItem(p).getItemPrice();
            total += itemPrice;
        }
        
        return total;
    }
    
    //method to clear the shopping cart
    public void clearShoppingCart(){
        shoppingCart.clear();
    }
    
    //method to lock the cart so you will be unable to change it
    public void close(){
        cartOpen = false;
    }
    
}
