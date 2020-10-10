package chap01_practice;

public class e05Min4 {
	public static void main(String[] args) {
		System.out.println("네 개의 정수 중 최솟값은 다음과 같습니다."); 
		System.out.println(min4(5, 5, 5, 5));
		System.out.println(min4(10, 45, 64, 2));
		System.out.println(min4(15, 19, 50, 4880));
		System.out.println(min4(895, 12, 8, 9000));
		
	}
	static int min4(int a, int b, int c, int d) {
		int min = a; 
		if(b<min) {
			min = b;
		}
		if(c<min) {
			min = c;
		} 
		if(d<min) {
			min = d;
		}
		
		return min;
	}

}
