package day9;
import java.util.Scanner;
public class NameArray2 {
	public void test() {
		//	String[] name17 = new String[17];
			Scanner scanner = new Scanner(System.in);
			System.out.println("몇명의 학생을 입력하시나요");
			int num = scanner.nextInt();
			String[] name = new String[num];
			int[] score = new int[num];
			for(int i=0;i<num;i++) {
				System.out.println("학생이름과 점수입력");
				name[i]= scanner.next();
				score[i] = scanner.nextInt();
			}
			for(int i=0;i<num;i++) {
				System.out.println(i+1 +"번째  "+name[i]+score[i]);
			}
			
	}
	public static void main(String[] args) {
		NameArray2 d = new NameArray2();
		d.test();
	}
}

