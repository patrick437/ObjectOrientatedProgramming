import java.util.ArrayList;
public class Order
{
   private ShoppingCart shoppingCart1;
   private ArrayList<Items> order;
   
   //Attempt to transfer the items in the shopping cart array over to the order area
   public Order( ShoppingCart shoppingCart ){
       shoppingCart1 = shoppingCart;
       ArrayList<Items>order = new ArrayList<Items>();
       for(int i = 0; i<shoppingCart1.numOfItems(); i++){
       order.add(shoppingCart1.getItem(i));
    }
   }
    
   //Method to check if the order area succesfully received the items in the shopping cart
   public void printArray(){
       for(int i=0; i<order.size(); i++){
           System.out.print("\t"+order.get(i));
       }
   }
}
