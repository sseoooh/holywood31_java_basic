package day9;
import java.util.Scanner;
public class Calc {


		public String test(int a, String op, int b) {			
			
			int res =0;	
			
			switch (op) {
			
			case"+": res = a + b;break;
			case"-": res = a - b;break;
			case"*": res = a * b;break;
			case"/": res = a / b;break;
			case"%": res = a % b;break;
			
			
			
			
			}
			return a+op+b+"="+res;
		}
		
	}

