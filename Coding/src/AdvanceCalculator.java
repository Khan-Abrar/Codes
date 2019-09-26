import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * We are using data type double so that user can enter integer as well as
		 * floating point value
		 */
		int n;
		/*Scanning the input from user*/
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter how many numbers u want to calcuate:");
		n = obj.nextInt();
		/*creating an aray and storing the numbers entered by the user*/
		double a[] = new double[n];
		System.out.println("enter the " + n + " numbers");
		for (int i = 0; i < n; i++) {
			a[i] = obj.nextDouble();
		}
		/*asking the user to choose the operation*/
		System.out.println("Enter an operator (+, -, *, /,%): ");
		char operator = obj.next().charAt(0);
		obj.close();
		double output=a[0];
		/*using switch-case statement to operate according to the user choice*/
		
		switch (operator) {
		
		case '+':
			
			for(int i=1;i<n;i++)
            {
                output+=a[i];  /*output=output+a[i]*/
            }  
			break;
			
		case '*':
			
			for(int i=1;i<n;i++)
            {
                output*=a[i];
            }  
			break;

		case '-':
			
			for(int i=1;i<n;i++)
            {
                output-=a[i];
            }  
			break;

		case '/':
			
			for(int i=0;i<n-1;i++)
            {
                output=a[i]/a[i+1];  
            }
			break;
			
		case '%':
		
			for(int i=1;i<n-1;i++)
            {
                output%=a[i];  
            }
			break;

		/*
		 * If user enters any other operator or char apart from +, -, *, % and /, then
		 * display an error message to user
		 * 
		 */
		default:
			System.out.printf("You have entered wrong operator");
			return;
		}

		System.out.println("The value is "+output);
	}
}
