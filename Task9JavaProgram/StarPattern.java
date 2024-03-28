package Task9JavaProgram;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == i || j == (rows - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
