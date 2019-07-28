package chap01_practice;

public class e03Max4 {
	public static void main (String[] args) {
		System.out.println("max4 매서드를 실행합니다.");
		max4(1, 2, 3, 4);
		max4(5, 5, 5, 5);
		max4(1000, 100, 10, 10);
		max4(10, 1548, 6048, 15);
		
	}
	
	static void max4(int a, int b, int c, int d) {
		int max = a; 
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		if(d>max) {
			max=d;
		}
		
		System.out.println("최댓값은 "+max+"입니다!");
	}

}
