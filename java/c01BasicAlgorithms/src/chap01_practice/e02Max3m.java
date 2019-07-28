package chap01_practice;

public class e02Max3m {
	
	//매서드를 이용하여 사용자 입력 없이 한번에 최댓값 확인하기 
	static int MaxNum(int a, int b, int c) {
		int max = a;
		
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("최댓값을 출력합니다. ");
		System.out.println(MaxNum(10, 50, 2));
		System.out.println(MaxNum(5, 6, 4));
		System.out.println(MaxNum(1, 5, 9));
		System.out.println(MaxNum(10, 100, 1000));
		System.out.println(MaxNum(500, 500, 500));

	}

}
