package day4;

import java.util.Scanner;

public class GenderChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String num = scan.next();
		char cov = num.charAt(7);
		String ssnresult = "";
		
		switch(cov) {
		case '1' : ssnresult="남자"; break;
		case '3' : ssnresult="남자"; break;
		case '2' : ssnresult="여자"; break;
		case '4' : ssnresult="여자"; break;
		case '5' : ssnresult="외국인"; break;
		case '6' : ssnresult="외국인"; break;
		default : ssnresult="다시입력하세요"; break;
		}
		System.out.printf("%s",ssnresult);
	}
}

