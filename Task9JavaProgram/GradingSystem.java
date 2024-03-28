package Task9JavaProgram;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the marks scored by the student: ");
        int marks = scanner.nextInt();
        
        if (marks > 100) {
            System.out.println("Invalid Input");
        } else {
            String grade;
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else if (marks >= 50) {
                grade = "E";
            } else {
                grade = "F";
            }
            System.out.println("Grade: " + grade);
        }
        
        scanner.close();
    }
}