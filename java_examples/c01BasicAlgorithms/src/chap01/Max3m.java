package chap01;
// 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.

class Max3m {
	// a, b, c의 최댓값을 구하여 반환합니다.
	static int max3(int a, int b, int c) { //아예 처음부터 세 개의 정수를 매개변수로 전달받음 
		int max = a;	// 첫번째 매개변수 a를 임시 최댓값으로 설정 
		if (b > max) 	//현재의 최댓값과 두번째 정수를 비교 
			max = b;	
		if (c > max) 	//현재의 최댓값과 세번째 정수를 비교 
			max = c;

		return max;	//최종 최댓값 반환 
	}

	public static void main(String[] args) {
		//세 값의 대소관계의 결정트리 : 13가지 경우의 수 
		System.out.println("max3(3,2,1) = " + max3(3, 2, 1));		// [A] a＞b＞c
		System.out.println("max3(3,2,2) = " + max3(3, 2, 2));		// [B] a＞b＝c
		System.out.println("max3(3,1,2) = " + max3(3, 1, 2));		// [C] a＞c＞b
		System.out.println("max3(3,2,3) = " + max3(3, 2, 3));		// [D] a＝c＞b
		System.out.println("max3(3,3,2) = " + max3(3, 3, 2));		// [F] a＝b＞c
		System.out.println("max3(3,3,3) = " + max3(3, 3, 3));		// [G] a＝b＝c
		System.out.println("max3(2,2,3) = " + max3(2, 2, 3));		// [H] c＞a＝b
		System.out.println("max3(2,3,1) = " + max3(2, 3, 1));		// [I] b＞a＞c
		System.out.println("max3(2,3,2) = " + max3(2, 3, 2));		// [J] b＞a＝c
		System.out.println("max3(2,3,3) = " + max3(2, 3, 3));		// [L] b＝c＞a
		System.out.println("max3(2,1,3) = " + max3(2, 1, 3));		// [E] c＞a＞b
		System.out.println("max3(1,3,2) = " + max3(1, 3, 2));		// [K] b＞c＞a
		System.out.println("max3(1,2,3) = " + max3(1, 2, 3));		// [M] c＞b＞a
	}
}
