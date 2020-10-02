import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		/*
		 * We are using data type double so that user can enter integer as well as
		 * floating point value
		 */
		int n;
		
		/*Taking the input from user*/
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter how many numbers u want to calcuate ? :");
		n = obj.nextInt();
		
		/*creating an aray and storing the numbers entered by the user*/
		double arr[] = new double[n];
		System.out.println("enter the " + n+ " numbers \n");
		
		for (int i = 0; i < n; i++) {
			arr[i] = obj.nextDouble();
		}
		
		/*asking the user to choose the operation*/
		System.out.println("Enter an operator (+, -, *, /,%): ");
		char operator = obj.next().charAt(0);
		obj.close();
		
		double output=arr[0];
		/*using switch-case statement to operate according to the user choice*/
		
		switch (operator) {
		
		case '+':
			
			for(int i=1;i<n;i++)
		    	{
				output+=arr[i];  /*output=output+arr[i]*/
		    	}  
			break;
			
		case '*':
			
			for(int i=1;i<n;i++)
		    	{
				output*=arr[i];
		    	}  
			break;

		case '-':
			
			for(int i=1;i<n;i++)
            		{	
                		output-=arr[i];
            		}  
			break;

		case '/':
		/* do check if the reult of division throws division by zero error or not*/
		/* try {
			for (int i = 1; i < n; i++) {
			    output=arr[i]/arr[i+1];

			    if (output == Double.POSITIVE_INFINITY || output == Double.NEGATIVE_INFINITY)
				throw new ArithmeticException();
			}
		    } catch (ArithmeticException ae) {
			System.out.println("ArithmeticException occured!");
		 } */
			
			for(int i=0;i<n-1;i++)
            		{
                		output=arr[i]/arr[i+1];  
		
            		}
			break;
			
		case '%':
		
			for(int i=1;i<n-1;i++)
            		{
                		output%=arr[i];  
            		}
			break;

		/*
		 * If user enters any other operator or char apart from +, -, *, % and /, then
		 * display an error message to user
		 * 
		 */
		default:
			System.out.printf("Invalid Input");
			return;
		}

		System.out.println("The value is "+output);
	}
}
