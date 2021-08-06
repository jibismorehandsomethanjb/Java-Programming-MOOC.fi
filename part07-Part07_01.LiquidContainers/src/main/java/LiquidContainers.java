
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        
        Container first = new Container();
        Container second = new Container();
        
        UserInterface ui = new UserInterface(first, second);
        
        ui.start();
        
    }
}
