package day9;
import java.util.Scanner;
public class Grade {
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름과 점수를 입력하세요");
		String name = scan.next();
		String name2 = scan.next();
		String name3 = scan.next();
		int score = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		String result = "";
		
		if(score>score2 && score>score3 && score2>score3) {
			result = "1등"+name+"2등"+name2+"3등"+name3;
		}else if(score>score2 && score>score3 && score3>score2) {
			result = "1등"+name+"2등"+name3+"3등"+name2;
		}else if(score2>score && score2>score3 && score>score3) {
			result = "1등"+name2+"2등"+name+"3등"+name3;
		}else if(score2>score && score2>score3 && score3>score) {
			result = "1등"+name2+"2등"+name3+"3등"+name;
		}else if(score3>score && score3>score2 && score>score2) {
			result = "1등"+name3+"2등"+name+"3등"+name2;
		}else if(score3>score && score3>score2 && score2>score) {
			
		}
		System.out.println(result);
	}
}
