
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }
    
    public void clearMenu() {
        ArrayList<String> clearList = new ArrayList<>();
        meals = clearList;
    }
    
    public void printMeals() {
        for (String list : meals) {
            System.out.println(list);
        }
    }
    
}
