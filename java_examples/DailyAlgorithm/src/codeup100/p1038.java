package codeup100;
import java.util.Scanner;
import java.util.StringTokenizer;
public class p1038 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String twonums = scan.nextLine();
		StringTokenizer tk = new StringTokenizer(twonums, " ");
		String[] nums = new String[2];
		int i = 0;
		while(tk.hasMoreTokens()) {
			nums[i] = tk.nextToken();
			i+=1;
		}
		long a = Long.parseLong(nums[0]);
		long b = Long.parseLong(nums[1]);
		System.out.print(a+b);
	}

}

//정수 2개를 입력받아 합을 출력하는 프로그램을 작성해보자.
//(단, 입력되는 정수는 -1073741824 ~ 1073741824 이다.)
//
//입력
//2개의 정수가 공백으로 구분되어 입력된다.
//** 주의 : 계산의 결과가 int 범위를 넘어가는지를 잘 생각해 보아야 한다.
//
//
//출력
//두 정수의 합을 출력한다.
//
//
//입력 예시   
//123 -123
//
//출력 예시
//0