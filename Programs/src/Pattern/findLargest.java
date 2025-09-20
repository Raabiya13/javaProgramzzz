package Pattern;
import java.util.Scanner;

public class findLargest {

	public static void largestAmoung(int a, int b) {
		char res = (a>b)? 'a':'b';
		System.out.println("The graeter value is "+res);
	}
	
	public static void largestAmoung(int a, int b, int c) {
		if(a>b)
			System.out.println("The graeter value is a");
		else if(c>a)
			System.out.print("The graeter value is c");
		else
			System.out.println("The graeter value is b");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b= sc.nextInt();
		System.out.print("Enter c: ");
		int c= sc.nextInt();

		largestAmoung(a,b);
		largestAmoung(a,b,c);
	}
	
	
}