package codeup100;
import java.util.Scanner;

public class p1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String twoint = scan.nextLine();
		String[] strs = twoint.split(" ");
		int a = Integer.parseInt(strs[0]);
		int b = Integer.parseInt(strs[1]);
		System.out.println(a+" "+b);
	}
}
//정수(int) 2개를 입력받아 그대로 출력해보자.
//
//참고
//
//int a, b;
//scanf("%d%d", &a, &b);  //엔터/공백으로 입력 데이터가 구분되어 입력
//printf("%d %d", a, b);
//
//와 같은 방법으로 가능하다.
//
//입력
//2개의 정수가 공백으로 구분되어 입력된다.
//
//
//출력
//입력된 두 정수를 공백으로 구분하여 출력한다.
//
//입력 예시   
//1 2
//
//출력 예시
//1 2