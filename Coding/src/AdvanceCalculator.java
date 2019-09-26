import java.util.Scanner;

public class AdvanceCalculator {

	public static void main(String[] args) {
		/*
		 * We are using data type double so that user can enter integer as well as
		 * floating point value
		 */
		int n;
		double output;
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
		System.out.println("Enter an operator (+, -, *, /): ");
		char operator = obj.next().charAt(0);
		obj.close();
		/*using switch function to operate according to the user choice*/
		
		switch (operator) {
		
		case '+':
			output=0;
			for(int i=0;i<n;i++)
            {
                output+=a[i];  /*output=output+a[i]*/
            }  
			break;
			
		case '*':
			output=1;
			for(int i=0;i<n;i++)
            {
                output*=a[i];
            }  
			break;

		case '-':
			output=0;
			a[0]=-a[0];
			for(int i=0;i<n;i++)
            {
                output-=a[i];
            }  
			break;

		case '/':
			output=a[0];
			for(int i=1;i<n;i++)
            {
                output/=a[i];  
            }
			break;
			
		case '%':
			output=a[0];
			for(int i=1;i<n;i++)
            {
                output%=a[i];  
            }
			break;

		/*
		 * If user enters any other operator or char apart from +, -, * and /, then
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