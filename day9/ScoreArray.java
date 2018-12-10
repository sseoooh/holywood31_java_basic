package day8;
import java.util.Scanner;
public class ScoreArray {
	public void test1() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 3입력");
		int[] scores = new int[3];			 //new 레퍼런스
		String res ="";
		for(int i=0; i<scores.length;i++) {
			scores[i] = scan.nextInt(); 	//여기서의 scores는 변수X element
				
			if(i < scores.length-1) {
				res = res + scores[i]+",";
			}else {
				res = res + scores[i];
			}
		}		
		/*int a = scan.nextInt(); 
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int[] aaa = {a,b,c};*/
		
		System.out.println(res);
	}
				


	
	public static void main(String[] args) {
		ScoreArray a = new ScoreArray();
		a.test1();
			
		}
			
}	
		
			
			

		
	

	

