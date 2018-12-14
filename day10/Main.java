package day10;
import day9.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("[메뉴]\n0.종료\n"
					+"1. 계산기\n"
					+"2. BMI\n"
					+"3. 윤년구하기\n"
					+"4. 주민등록번호\n"
					+"5. 등수구하기");
			String select = scan.next();
			
			switch(select) {
			case "0" : System.out.println("종료");
			return;
			
				case "1" :
					Calc calc = new Calc();
					System.out.println("계산기");				
					System.out.println(calc.test(scan.nextInt(), scan.next(), scan.nextInt()));
					break;	
				
				case "2" :
					Bmi bmi = new Bmi();
					System.out.println("키와 몸무게를 입력하세요");
					System.out.println(bmi.test(scan.nextDouble(),scan.nextDouble()));
					break;
					
				case "3" :
					LeapYear leapyear = new LeapYear();
					System.out.println("년도를 입력하세요");
					System.out.println(leapyear.test(scan.nextInt()));
					break;
					
				case "4" :
					GenderChecker gendercherker = new GenderChecker();
					System.out.println("이름과 주민등록번호를 입력하세요");
					System.out.println(gendercherker.test(scan.next(),scan.next()));
					break;
					
				case "5" :
					Grade grade = new Grade();
					grade.test();
					break;
				
				case "6" :
					Gugudan gugudan = new Gugudan();					
					System.out.println("단수를 입력하세요");
					System.out.println(gugudan.test(scan.nextInt()));
					break;
				
				case "7" :
					NameScoreArray2 score = new NameScoreArray2();
					System.out.println("학생수 몇명?");
					int count = scan.nextInt();
					String[] names = new String[count];
					int[] scores =new int[count];
					System.out.println("학생이름, 점수를 입력하세요");
					for(int i=0; i<names.length;i++) {
					names[i] = scan.next();
					scores[i] = scan.nextInt();
					}
					System.out.println(score.test(names,scores));
					break;
			}   
			
			
		}
		
	}
}
