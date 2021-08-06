
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        try {
            ArrayList<Person> records = readRecordsFromFile(file);
            System.out.println("Persons: " + records.size());
            System.out.println("Persons:");
            for (Person person : records) {
                System.out.println(person);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try {
            Scanner scanFile = new Scanner(Paths.get(file));
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                String[] personInfo = row.split(",");
                
                String personName = personInfo[0];
                int personYear = Integer.valueOf(personInfo[1]);
                persons.add(new Person(personName, personYear));
            }
            // Write here the code for reading from file
            // and printing the read records
        } catch (IOException ex) {
            Logger.getLogger(StoringRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        return persons;
    }
}
