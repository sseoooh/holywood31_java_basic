package day9;



public class LeapYear {

	public String test(int year) {
		
		
		
		int leapy = year%4;
		int leapy2 = year%100;
		int leapy3 = year%400;
		String leapyear = "";
		
		if(leapy==0 && leapy2!=0 || leapy3==0) {
			leapyear = "윤년";
		}else {
			leapyear = "평년";
		}
		return year+":"+leapyear;
}
}
