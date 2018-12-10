package day3;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도를 입력하세요");
		int year = scan.nextInt();
		
		int leapy = year%4;
		int leapy2 = year%100;
		int leapy3 = year%400;
		String leapyear = "";
		
		if(leapy==0 && leapy2!=0 || leapy3==0) {
			leapyear = "윤년";
		}else {
			leapyear = "평년";
		}
		System.out.println(year+":"+leapyear);
	}
	
	
}
