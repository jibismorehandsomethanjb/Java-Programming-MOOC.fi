
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class UserInterface {
    Container first;
    Container second;
    Scanner scanner = new Scanner(System.in);
    
    public UserInterface(Container first, Container second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        String container1 = "First: " + first.getValue() + "/" + first.getLimit();
        String container2 = "Second: " + second.getValue() + "/" + second.getLimit();
        return container1 + "\n" + container2;
    }
    
    public void start() {
        while (true) {
            System.out.println(this.toString());
            String command = scanner.nextLine();
            
            if (command.equals("quit")) {
                break;
            }
            
            String[] cmd = command.split(" ");
            int amount = Integer.valueOf(cmd[1]);
            
            if (cmd[0].equals("add")) {
                first.add(amount);
            }
            
            if (cmd[0].equals("move")) {
                if (amount > first.getValue()) {
                    int firstvalue = first.getValue();
                    first.remove(firstvalue);
                    second.add(firstvalue);
                } else {
                    first.remove(amount);
                    second.add(amount);
                }
            }
            
            if (cmd[0].equals("remove")) {
                second.remove(amount);
            }
            
        }
    }
}
