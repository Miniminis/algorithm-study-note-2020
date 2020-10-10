package codeup100;
import java.util.Scanner;
public class p1034 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String octalNum = scan.nextLine();
		int num = Integer.parseInt(octalNum, 8);
		System.out.print(num);
	}
}

//8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자.
//
//입력
//8진 정수 1개가 입력된다.
//
//
//출력
//10진수로 바꾸어 출력한다.
//
//
//입력 예시   
//13
//
//출력 예시
//11