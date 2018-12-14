package day9;

import java.util.Scanner;

public class Exercise100 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("몇명의 인원을 입력하시게슷ㅂ니");
	int num = scan.nextInt();
	String[] name = new String[num];
	int[] score = new int[num];
	
	for(int i=0;i<num;i++) {
		System.out.println("이름 점수입력하셈");
		name[i] = scan.next();
		score[i] = scan.nextInt();
		
	}
	for(int i=0;i<num;i++) {
		System.out.println(i+1+"번째 학생의 이름은" +name[i]+"이고 점수는"+score[i]+"입니다");
	}


}
	}



