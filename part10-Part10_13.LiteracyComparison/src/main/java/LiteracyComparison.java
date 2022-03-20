
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> literacy = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> literacy.add(row));
            //File input format: Adult literacy rate, population 15+ years, male (%),Angola,2014,82.15105
            
            literacy.stream()
                    .map(row -> row.split(","))
                    .filter(part -> part.length >= 6)
                    .sorted((p1, p2) -> {
                        return p1[5].compareTo(p2[5]);
                    }).forEach(p -> 
                            System.out.println(p[3].trim() + " (" + p[4].trim() + "), "
                            + p[2].trim().split(" ")[0] + ", " + p[5].trim()));
                    //Niger (2015), female, 11.01572
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    



