
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehousePrice = new HashMap<String, Integer>();
    private Map<String, Integer> warehouseStock = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        //index 0 will store price and index 1 will store stock
        warehousePrice.put(product, price);
        warehouseStock.put(product, stock);
    }

    public int price(String product) {
        if (warehousePrice.containsKey(product)){
            return warehousePrice.get(product);
        } else {
            return -99;
        }  
    }
    
    public int stock(String product) {
        if (warehouseStock.containsKey(product)){
            return warehouseStock.get(product);
        } else {
            return 0;
        }  
    }
    
    public void setStock(String product, int newStock) {
        if (warehouseStock.containsKey(product)){
            warehouseStock.put(product, newStock);
        }
    }
    
    public boolean take(String product) {
        if (warehouseStock.containsKey(product) && stock(product) > 0){
            warehouseStock.put(product, warehouseStock.get(product) - 1);
            return true;
        } else {
            return false;
        }  
    }
    
    public Set<String> products(){
        return warehousePrice.keySet();
    }
    
}
