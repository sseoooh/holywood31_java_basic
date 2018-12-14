package day4;

import java.util.Scanner;

public class BMI {
	public String test(double weight, double height) {
		
		
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
		return ave+":"+bmiresult;
		
	}
	
}


