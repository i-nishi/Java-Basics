package si;
import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principle Amount: ");
		int PI = sc.nextInt();
		System.out.print("Enter the Rate of Interest: ");
		float rate = sc.nextFloat();
		System.out.print("Enter the Time Duration: ");
		int time = sc.nextInt();
		
		float SI = PI * rate * time / 100;
				
		System.out.println("Simple Interest: " + SI);
		sc.close();
		
	}
	

}
