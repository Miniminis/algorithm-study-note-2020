package chap01_practice;

public class e06Med1 {
	
	/* 세 개의 정수 중 중앙값 구하기 : a, b, c 
	1. a>=b 
	- yes : b>=c 
		- yes: med = b 
		- no: c>=a 
			- yes: med = a;
			- no: med = c;
	- no: a>=c
		- yes: med = a;
		- no: b>= c
			- yes: med= c; 
			- no: med = b;
	*/
	
	public static void main(String[] args) {
		
		Med(10, 10, 10);
		Med(10, 10, 20);
		Med(10, 10, 30);
		Med(10, 20, 10);
		Med(10, 20, 20);
		Med(10, 20, 30);
		Med(10, 30, 10);
		Med(10, 30, 20);
		Med(10, 30, 30);
		
	}
	
	static void Med(int a, int b, int c) {
		int med = 0;
		if(a>=b) {//a>=b
			if(b>=c) { //a>=b>=c 
				med = b;
			} else if(a>=c) { //a>=b, c>=b
				med = c;
			} else {
				med = a;
			}
		} else { //a<b
			if(a>=c) {
				med= a;
			} else if(b>=c) {
				med= c;
			} else {
				med = b;
			}
		}
		
		System.out.println("세 개의 정수 a, b, c 중 중앙값 : "+med);
	}	

}
