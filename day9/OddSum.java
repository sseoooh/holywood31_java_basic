package day9;
import java.util.Scanner;
public class OddSum {
	// Odd 홀수
		// Even 짝수
		// 1 부터 입력받은 숫자까지의 합인데, 그 중에서 홀수의 합
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("10까지의 짝수의 합");
		int count = scan.nextInt();
		String result = "";
		int sum = 0;
		for(int i=1; i<=count; i++) {
			if(i%2==0) {
				result = result+i+"+";
				sum = sum+i;
			
		}else if(i%2!=0){
				result = result+i+"+";
				sum = sum+i;
		}
			
			
		
	}
		System.out.println(result+sum);
	}
}

