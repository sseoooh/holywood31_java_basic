package day8;

public class Namearray2 {

	public void test() {
		
		String[] names = {"홍길동","이성계","유재석"};
		
		
		String res = "";
		for(int i=0; i<3; i++) {
			if(i<2) {
				res = res+names[i]+",";
			}else {
				res = res+names[i]+"";
			}
		}
				System.out.println(res);
}
		public static void main(String[] args) {
			Namearray2 a = new Namearray2();
			a.test();
			
		}
}
		
		














	






	



