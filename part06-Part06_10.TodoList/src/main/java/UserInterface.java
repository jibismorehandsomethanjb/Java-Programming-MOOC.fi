
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
    private Scanner scanner;
    private TodoList todolist;
    
    public UserInterface(TodoList todolist, Scanner scanner) {
        this.scanner = scanner;
        this.todolist = todolist;
    }
    
    public void start() {
        
        String command = "";
        while (true) {
            System.out.println("Command:");
            command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                todolist.add(task);
            }
            if (command.equals("list")) {
                todolist.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int remove = scanner.nextInt();
                todolist.remove(remove);
            }
        }
        scanner.close();
    }
}
