package day2;
import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = scan.next();
		System.out.println("과목점수를 순서대로 입력하세요");
		double kor = scan.nextDouble();
		double eng = scan.nextDouble();
		double mat = scan.nextDouble();
		double sci = scan.nextDouble();
		double soc = scan.nextDouble();
		
		double all = kor + eng + mat + sci + soc;
		double ave = all/5;
		String sresult = ""; 
	
		if(ave>=90) {
			sresult = "A";
		}else if(ave>=80) {
			sresult = "B";
		}else {
			sresult = "F";
		}
		System.out.printf("=======================\n"
				+ "1.%s:+총점 %f점 2.평균%f  \n"
				+ "3.성적  %s학점",name,all,ave,sresult);
		//name+":"+"총점%f점  "+"평균%f  "+"성적  %s학점",all,ave,sresult
	}
}