import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner myObject= new Scanner(System.in);
		
		char operators[]={'+','-','*','/'};
		
		 boolean isValid = true;
		 
		System.out.println("Enter the first number");
		double firstNumber= myObject.nextDouble();
		System.out.println("Enter the operator");
		char operator=myObject.next().charAt(0);
		System.out.println("Enter the second number");
		double secondNumber=myObject.nextDouble();
		double answer=0;
		if(operator == '+') {
			answer=firstNumber+secondNumber;
			
		}
		else if(operator == '-') {
			answer=firstNumber-secondNumber;
		}
		else if(operator == '*') {
			answer=firstNumber*secondNumber;
		}
		else if(operator == '/') {
			answer=firstNumber/secondNumber;
			if (secondNumber != 0) {
                answer = firstNumber / secondNumber;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                isValid = false;
            }
		}
		else {
			System.out.println("Invalid operator");
			
			
			}
		
		System.out.printf("%.2f"+operator+"%.2f"+"=%.2f",firstNumber,secondNumber,answer);
		
		
		myObject.close();
	}
	
	
	
	
}



//USING SWITCH CASE


import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner myObject= new Scanner(System.in);
		
		char operators[]={'+','-','*','/'};

		
		
		 
		 double firstNumber=0;
		 double secondNumber=0;
		 System.out.println("Enter the first number");
		 firstNumber=myObject.nextDouble();
		 System.out.println("Enter the operator");
		 char operator=myObject.next().charAt(0);
		 System.out.println("Enter the second number");
		 secondNumber=myObject.nextDouble();
		switch (operator) {
		case '+':
			
			System.out.printf("%.2f + %.2f = %.2f",firstNumber,secondNumber,firstNumber+secondNumber);
			break;
		
		case '-':
			System.out.printf("%.2f - %.2f = %.2f",firstNumber,secondNumber,firstNumber-secondNumber);
			break;
		case '*':
			System.out.printf("%.2f * %.2f = %.2f",firstNumber,secondNumber,firstNumber*secondNumber);
			break;
		case '/':
			if(secondNumber==0) {
				System.out.printf("Cannot divide by zero");
			}
			else {
			System.out.printf("%.2f / %.2f = %.2f",firstNumber,secondNumber,firstNumber/secondNumber);
			}
			break;
		default:
			System.out.println("Invalid operator");
			
		}
		myObject.close();
	}
	
	
	
	
}







