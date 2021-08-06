
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sahaw
 */
public class Room {
    private ArrayList<Person> personList;
    
    public Room() {
        personList = new ArrayList<>();
    }
    
    public void add(Person person) {
        personList.add(person);
    }
    
    public boolean isEmpty() { 
        return personList.isEmpty();
    }
            
    public ArrayList<Person> getPersons() {
        return personList;
    }
    
    public Person shortest() {
        if (personList.isEmpty()) {
            return null;
        }
        Person lowestPerson = personList.get(0);
        for (Person person : personList) {
            if (lowestPerson.getHeight() > person.getHeight()) {
                lowestPerson = person;
            }
        }    
        return lowestPerson;
    }
    
    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }
        Person target = this.personList.get(0);
        for (Person person : personList) {
            if (target.getHeight() > person.getHeight()) {
                target = person;
            }
        }
        personList.remove(target);
        return target;
    }
}
