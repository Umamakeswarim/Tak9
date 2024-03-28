package Task9JavaProgram;
import java.util.Scanner;

public class HotelTariffCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the room rent per day: ");
        double roomRent = scanner.nextDouble();
        
        System.out.print("Enter the number of days stayed in the hotel: ");
        int daysStayed = scanner.nextInt();
        
        double totalTariff;
        
        switch (month) {
            case 4, 5, 6, 11, 12:
                totalTariff = roomRent * daysStayed * 1.20; // 20% higher during peak seasons
                break;
            default:
                totalTariff = roomRent * daysStayed;
                break;
        }
        
        System.out.printf("Hotel Tariff: %.2f%n", totalTariff);
        
        scanner.close();
    }
}

