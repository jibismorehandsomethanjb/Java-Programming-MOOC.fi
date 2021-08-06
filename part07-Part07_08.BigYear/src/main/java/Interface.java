
import java.util.ArrayList;
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
public class Interface {
    private ArrayList<Bird> bird;
    private Scanner scanner;
    
    public Interface(ArrayList<Bird> bird, Scanner scanner) {
        this.bird = bird;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            System.out.println("?");
            String command = scanner.nextLine();
            
            if (command.equalsIgnoreCase("quit")) {
                break;
            }
            
            if (command.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                bird.add(new Bird(name, latinName));
            }
            
            if (command.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String birdname = scanner.nextLine();
                int birdIndex = findFromName(birdname);
                if (birdIndex == -1) {
                    System.out.println("Not a bird!");
                } else {
                    bird.get(birdIndex).observed();
                }
            }
            
            if (command.equalsIgnoreCase("all")) {
                printAllBirds();
            }
            
            if (command.equalsIgnoreCase("one")) {
                System.out.print("Bird? ");
                String birdname = scanner.nextLine();
                printBird(birdname);
            }
            
        }
        scanner.close();
    }
    
    //find Bird obj in list and return their index
    public int findFromName(String name) {
        for (int i = 0; i < bird.size(); i++) {
            if (bird.get(i).getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    
    public void printAllBirds() {
        for (Bird b : bird) {
            System.out.println(b);
        }
    }
    
    public void printBird(String name) {
        int birdIndex = findFromName(name);
        if(birdIndex == -1) {
            System.out.println("Not on the list");
        } else {
            Bird b = bird.get(birdIndex);
            System.out.println(b);
        }
    }
}