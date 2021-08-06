
import java.util.ArrayList;
import java.util.Random;
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
public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        String joke = "";
        if (jokes.isEmpty()) {
            joke = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            joke = jokes.get(index);
        }
        return joke;
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

}
