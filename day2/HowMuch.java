package day2;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마에요?");
		int hm = scan.nextInt();
		System.out.println(hm+"원입니다");
		System.out.println("몇개드릴까요?");
		int many = scan.nextInt();
		int hmresult = 0;
		
		if(hm<=1000) {
			hmresult = hm*80/100;
		}else if(hm<=500){
			hmresult = hm*90/100;
		}else {
			hmresult = hm;
		}
		System.out.printf("총금액은%d입니다",hmresult*many);
	}
}


