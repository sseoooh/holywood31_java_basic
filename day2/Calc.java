package day2;
import java.util.Scanner;
public class Calc {
	public String test(int number, String opcode, int number2) {
		
		
		
		
		int result = 0;
		
		switch(opcode) {
		case "+" : result = number + number2; break;
		case "-" : result = number - number2; break; 
		case "*" : result = number * number2; break; 
		case "/" : result = number / number2; break; 
		case "%" : result = number % number2; break; 
		}
	return	 number + opcode + number2+"="+ result;
	}
	}
	
	
	

