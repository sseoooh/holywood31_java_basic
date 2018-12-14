package day9;


public class NameScoreArray2 {

	public String test(String[] names, int[] scores ) {
		
				String res="";
				for(int i=0; i<names.length;i++) {
					
					res+= names[i]+":"+scores[i];
				}
				return res;
	}

}
