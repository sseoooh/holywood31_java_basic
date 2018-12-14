package day9;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		System.out.println("학생수는 몇명입니까");
		Scanner scanner = new Scanner(System.in);
		int many = scanner.nextInt();
		String[] name = new String[many];
		int[] score = new int[many];
		int iter= 0;
		while(true) {
			System.out.println("[메뉴 0.종료, 1.시작 ]\n"
					+ "학생이름 점수를 입력하세요");
			String select = scanner.next();
			
			if(!select.equals("0") && iter!=many   ) {
					
			name[many] = scanner.next();
			score[many] = scanner.nextInt();
			
			iter++;
			}else {
				System.out.println("종료");
				for(int i=0;i<name.length;i++) {
					System.out.println(name[i]+score[i]);
			}
			}
		
			
		}
	}
}