package mypack;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Input what type of calculation you want to do (+ - / *): ");
		
		Scanner obj1 = new Scanner(System.in);
		String operator = obj1.nextLine(); // used to store operator
		
		double firstNum, secondNum, answer; // used to store numbers

		
		if(operator.equals("+")){
			System.out.println("Input first number: ");
			firstNum = obj1.nextDouble();
			
			
			System.out.println("Input second number: ");
			secondNum = obj1.nextDouble();
			
			answer = firstNum + secondNum;
			
			System.out.println("Answer is: " + answer);
		}
		else if(operator.equals("-")){
			System.out.println("Input first number: ");
			firstNum = obj1.nextDouble();
			
			
			System.out.println("Input second number: ");
			secondNum = obj1.nextDouble();
			
			answer = firstNum - secondNum;
			
			System.out.println("Answer is: " + answer);
		}
		else if(operator.equals("/")) {
			System.out.println("Input first number: ");
			firstNum = obj1.nextDouble();
			
			
			System.out.println("Input second number: ");
			secondNum = obj1.nextDouble();
			
			answer = firstNum / secondNum;
			
			System.out.println("Answer is: " + answer);
			
		}
		else if(operator.equals("*")) {
			System.out.println("Input first number: ");
			firstNum = obj1.nextDouble();
			
			
			System.out.println("Input second number: ");
			secondNum = obj1.nextDouble();
			
			answer = firstNum * secondNum;
			
			System.out.println("Answer is: " + answer);
			
		}
		else {
			System.out.println("Please only enter +, -, /, or *.");
		}
		
	}
	
	
}
