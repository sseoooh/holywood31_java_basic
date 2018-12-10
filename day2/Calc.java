package day2;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("계산기");
		
		int number = scan.nextInt();
		String opcode = scan.next();
		int number2 = scan.nextInt();
		int result = 0;
		
		switch(opcode) {
		case "+" : result = number + number2; break;
		case "-" : result = number - number2; break; 
		case "*" : result = number * number2; break; 
		case "/" : result = number / number2; break; 
		case "%" : result = number % number2; break; 
		}
		System.out.println(number + opcode + number2+"="+ result);
	}
	}
	
	
	

