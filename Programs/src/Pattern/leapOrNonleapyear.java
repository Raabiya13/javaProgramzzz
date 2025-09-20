package Pattern;

import java.util.Scanner;

public class leapOrNonleapyear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year to check: ");
		long year = sc.nextLong();
		
		if((year%400==0) || (year %4==0 && year %100!=0)) {
			System.out.println("The Give year "+year+" is Leap yaer");
		}
		else {
			System.out.println("The Give year "+year+" is Non-Leap yaer");
		}
	}
}
