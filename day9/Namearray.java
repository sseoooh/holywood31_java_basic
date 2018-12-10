package day8;

public class Namearray {

	public void test() {
		
		String[] names = new String[3];
		names[0] = "홍길동";
		names[1] = "이성계";
		names[2] = "유재석";
		
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
			Namearray a = new Namearray();
			a.test();
			
		}
}
		
		







	






	



