import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		
		int number = s.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int answer = number * i;
			System.out.printf("%d x %d = %d%n", number, i, answer);
			
		}
	
		
	}
	

}
