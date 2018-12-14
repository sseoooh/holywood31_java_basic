package day9;
import java.util.Scanner;
public class bbb {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("몇명입력하시겠습니까");
	int many = scanner.nextInt();
	String[] bb = new String[many];
	System.out.println(many+"명 입력하셨습니다");
	for(int i=0;i<bb.length;i++) {
		bb[i] = scanner.next();
		
	}
	for(int i=0;i<bb.length;i++) {
		System.out.println(bb[i]);
		
	}
	
	
	
	}
}
