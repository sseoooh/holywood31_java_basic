package day9;
import java.util.Scanner;
public class GenderChecker {
	public String test(String name, String number) {

		
		String result = "";
		char cov = number.charAt(7);
		
		switch(cov) {
		case '1' : result = "남자"; break;
		case '3' : result = "남자"; break;
		case '2' : result = "여자"; break;
		case '4' : result = "여자"; break;
		case '5' : result = "외국인"; break;
		case '6' : result = "외국인"; break;
		default : result = "다시입력하세요"; break;
		}
		return name+"님은"+result+"입니다";
	}
}
