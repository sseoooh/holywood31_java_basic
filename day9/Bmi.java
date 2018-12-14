package day9;
import java.util.Scanner;
public class Bmi {

	public String test(double t, double w) {
		
	
		
	
		double bmi = w/(t*t)*10000;
		String bmi2 = "";
		
		if(bmi>=40) {
			bmi2 = "고도비만";
		} else if(bmi>=35) {
			bmi2 = "중도비만";
		} else if(bmi>=25) {
			bmi2 = "보통";
		} else if(bmi>=20) {
			bmi2 = "마름";
		} else { 	
			bmi2 = "진짜마름";
		
		
		}
		
		return bmi2+bmi;
		
		
		
	}


}
