
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> itemList = new ArrayList<Item>();
    
    public void add(String product, int price){
        boolean inCart = false;
        for (Item item : itemList) {
                if (item.getProductName().equals(product)) {
                    item.increaseQuantity();
                    inCart = true;
            }
        }
        
        if (!inCart) {
            itemList.add(new Item(product, 1, price));
        }
    }
    
    public int price(){
        int total = 0;
        for (Item item : itemList) {
            total += item.price();
        }
        return total;
    }
    
    public void print() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }
    
}
