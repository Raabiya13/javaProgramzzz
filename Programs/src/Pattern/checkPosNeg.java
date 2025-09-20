package Pattern;

import java.util.Scanner;

public class checkPosNeg {
	
	public static void checkNum(int num) {
		if(num>0) {
			System.out.println("The given number is "+num+" positive.........");
		}
		else if(num<0){
			System.out.println("The given number is "+num+" negative.........");
		}
		else {
			System.out.println("The given number is "+num+" zero...........");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number to check : ");
		int num=sc.nextInt();
		
		
		checkNum(num);
	}

}
