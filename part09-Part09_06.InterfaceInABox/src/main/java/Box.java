
import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> box = new ArrayList<>();
    private double capacity;
    private double currentWeight = 0;
    
    public Box(double maxWeight){
        this.capacity = maxWeight;
    }
    
    public void add(Packable obj) {
        try {
            if (this.currentWeight + obj.weight() <= this.capacity ) {
                box.add(obj);
                currentWeight += obj.weight();
            }
        } catch (Exception e){
            
        }
    }

    @Override
    public double weight() {
//        double currentWeight = 0;
//        try {
//            if (box.isEmpty()) {
//                return 0;
//            } else {
//                for (int i = 0; i < box.size(); i++){
//                    currentWeight += box.get(i).weight();
//                }
//            }
//        } catch (Exception e) {
//        }
        return this.currentWeight;
    }
    
    @Override
    public String toString() {
        if (box.isEmpty()) {
            return "Box is empty";
        } else {
            return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
        }
    }
}
