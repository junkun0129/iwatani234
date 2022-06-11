import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Input the cents: ");
		
		int number = s.nextInt();
		int cents = number % 100;
		int dollars = number / 100;
		
		System.out.printf("The value is %1d dollars and %2d cents", dollars, cents);
		
		
	}
}
