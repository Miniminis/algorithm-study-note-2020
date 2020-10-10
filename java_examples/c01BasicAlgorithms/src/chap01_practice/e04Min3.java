package chap01_practice;

public class e04Min3 {

	public static void main(String[] args) {
		min3(1, 2, 3);
		min3(9, 5, 3);
		min3(15, 15, 15);
		min3(123, 125, 121);
	}
	
	static void min3(int a, int b, int c) {
		int min = a;
		
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		}
		
		System.out.println("세 개의 정수 중 최솟값은"+min+"입니다!");
	}

}
