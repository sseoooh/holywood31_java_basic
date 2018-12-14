package day9;
import java.util.Scanner;
public class ScoreArray {

	public void test() {
		// 점수 3개를 입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수 3 입력");
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
	
		String res = "";
		for(int i=0;i<arr.length;i++) {
			if(i < arr.length-1) {
				res += arr[i]+",";
			}else {
				res += arr[i];
			}
			
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		ScoreArray s = new ScoreArray();
		s.test();
	}
}


