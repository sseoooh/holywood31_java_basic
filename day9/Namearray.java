package day9;

public class NameArray {

	public void test() {
		String[] name = new String[3];
		name[0] = "홍길동";
		name[1] = "장영실";
		name[2] = "유관순";
		String a = "";
		for(int i = 0 ;i<3;i++ ) {
			if(i<2) {
				a += name[i]+",";
			}else {
				a += name[i]+"";
			}
		}
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		NameArray d = new NameArray();
		d.test();
	}
}

