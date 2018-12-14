package day9;
import java.util.Scanner;
public class Sequence {

	public String test(int limit) {

	
		String b = "";
		int sum = 0;
		for(int i=1;i<=limit;i++) {
			if(i!=10) {
				b+=i+"+";
				b+=i+"=";
			}
			break;
		}
		return b+sum;

	}

}

