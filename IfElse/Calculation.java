package si;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose an operation:\n" +
		"+ for Addition\n" +
		"- for Substraction\n" +
		"* for Multiply\n" +
		"/ for Division\n");
				
		String choice = sc.nextLine();
							
		switch (choice) {
					
		case "+": {
			System.out.print("Enter the first number: ");
			float firstNumber = sc.nextFloat();
			
			System.out.print("Enter the second number: ");
			float secondNumber = sc.nextFloat();
			
			float sum = firstNumber + secondNumber;
								
			System.out.println("Result: " + sum);
		}
			break;
		
		case "-": {
			System.out.print("Enter the first number: ");
			float firstNumber = sc.nextFloat();
				
			System.out.print("Enter the second number: ");
			float secondNumber = sc.nextFloat();
				
			float sub = firstNumber - secondNumber;
									
			System.out.println("Result: " + sub);
		}
			break;
		
		case "*": {
			System.out.print("Enter the first number: ");
			float firstNumber = sc.nextFloat();
				
			System.out.print("Enter the second number: ");
			float secondNumber = sc.nextFloat();
				
			float mult = firstNumber * secondNumber;
									
			System.out.println("Result: " + mult);
		}
			break;
		
		case "/": {
			System.out.print("Enter the first number: ");
			float firstNumber = sc.nextFloat();
			
			System.out.print("Enter the second number: ");
			float secondNumber = sc.nextFloat();
				
			float div = firstNumber / secondNumber;
									
			System.out.println("Result: " + div);
		}
			break;
		default: {
 			System.out.println("Please enter a valid choice.");
		}
		break;	
		}
		} 
	}