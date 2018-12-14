package day9;
import java.util.Scanner;
public class ccc {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String[] name = new String[3];
	int[] score = new int[3];	
	System.out.println("3명의 이름과 점수를 입력하세요");
	
	for(int i=0;i<name.length;i++) {
		name[i] = scanner.next();
		score[i] = scanner.nextInt();
	}
	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]+score[i]);
	}
	
}
}
