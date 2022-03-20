
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> list;
    
    public Employees() {
        list = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        list.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(p -> list.add(p));
    }
    public void print() {
        Iterator<Person> iterator = list.iterator();

	while (iterator.hasNext()) {
            System.out.println(iterator.next());
	}
    }
    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();

	while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
			
            if (nextPerson.getEducation().equals(education)) {
		System.out.println(nextPerson);
            }
	}
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();

	while (iterator.hasNext()) {
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();
            }
	}
    }
}
