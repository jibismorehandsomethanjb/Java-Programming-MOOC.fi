
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
    private Scanner scanner = new Scanner(System.in);
    private Grade rawPoints = new Grade();
    private Grade passingPoints = new Grade();
    private Grade pointsToGrade = new Grade();
    
    public UserInterface() {}
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = scanner.nextInt();
            
            if (points == -1) {
                break;
            }
            
            if (points >=0 && points <= 100) {
                int grade = pointsToGrade(points);
                rawPoints.add(points);
                pointsToGrade.add(grade);
                if (points >= 50) {
                    passingPoints.add(points);
                }
            } else {
                continue;
            }
        }
        printAverage();
        printAveragePass();
        printPassPercent();
        printGradeCount();
        scanner.close();
    }

    public int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        } else {
            return 5;
        }
    }
    
    public void printAverage() {
        System.out.println("Point average (all): " + rawPoints.average());
    }
    
    public void printAveragePass() {
        String result;
        if (passingPoints.size() == 0) {
            result = "-";
        } else {
            result = "" + passingPoints.average();
        }
        System.out.println("Point average (passing): " +  result);
    }
    
    public void printPassPercent() {
        System.out.println("Pass percentage: " + (100.0 * passingPoints.size() / rawPoints.size()));
    }
    
    public void printGradeCount() {
        System.out.println("Grade distribution:");
        int grade = 5;
        while (grade >= 0) {
            int gradeCount = pointsToGrade.count(grade);
            System.out.println(grade + ": " + stars(gradeCount));
            grade--;
        }
    }
    public String stars(int number) {
        String stars = "";
        for (int i = 1; i <= number; i++) {
            stars += "*";
        }
        return stars;
    }
}
