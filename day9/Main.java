package day9;
import day4.BMI;
import day2.Calc;
import java.util.Scanner;

import day9.*;


public class Main {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("[메뉴]/n"
				+ "0.정지\n"
				+ "1.계산기\n"
				+ "2.BMI\n"
				+ "3.ForDemo\n");
		String select = scan.next();
		
		
		while(true) {
			
			switch (select) {
			
			case "0" :
				System.out.println("정지");
				return;
			
			case "1" : 
				Calc calc = new Calc();
				System.out.println("계산기 숫자, 연산자, 숫자입력");
				System.out.println(calc.test(scan.nextInt(),scan.next(),scan.nextInt()));
				break;
			
			case "2" :
				BMI bmi = new BMI();
				System.out.println("몸무게를 입력하세요");
				
				System.out.println("키를 입력하세요");
								
				System.out.println(bmi.test(scan.nextDouble(), scan.nextDouble()));
				break;
			
			case "3" :
				Sequence ac = new Sequence();
				
				System.out.println("1부터 덧셈할 마지막 숫자 입력");
				System.out.println(ac.test(scan.nextInt()));
				break;
				
			
			}			
			
			
			
		} 
	}
}


