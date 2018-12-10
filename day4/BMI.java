package day4;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게를 입력하세요");
		double weight = scan.nextDouble();
		System.out.println("키를 입력하세요");
		double height = scan.nextDouble();
		
		double ave = weight/((height*height/10000));
		String bmiresult = "";
		
		if(ave>=40) {
			bmiresult = "고도비만";
		}else if(ave>=35){
			bmiresult = "중등도비만";
		}else if(ave>=30) {
			bmiresult = "경도비만";
		}else if(ave>=25) {
			bmiresult = "과체중";
		}else if(ave>=18.5) {
			bmiresult = "정상";
		}else if(ave<=18.4) {
			bmiresult = "저체중";
		}
		System.out.println(ave+":"+bmiresult);
	}
	
}


