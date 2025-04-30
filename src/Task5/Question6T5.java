package Task5;

import java.util.Scanner;

public class Question6T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month: ");
		int month = sc.nextInt();
		System.out.println("Room rent per day: ");
		float rentPerDay = sc.nextFloat();
		System.out.println("Enter the number of days: ");
		int days = sc.nextInt();
		
		float totalTariff;
        boolean isPeakSeason = false;
        
        switch (month) {
        case 4:
        case 5:
        case 6:
        case 11:
        case 12:
            isPeakSeason = true;
            break;
        default:
            isPeakSeason = false;
    }
        if (isPeakSeason) {
        	rentPerDay += rentPerDay * 0.20f;    	
        }
        totalTariff = rentPerDay * days;
        System.out.printf("%.2f\n", totalTariff);

	}

}
