package codeup100;
import java.util.Scanner;
public class p1031 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String octalNum = Integer.toOctalString(num);
		System.out.print(octalNum);
	}
}

//10진수를 입력받아 8진수(octal)로 출력해보자.
//
//참고
//%d(10진수 형태)로 입력받고,
//%o를 사용해 출력하면 8진수(octal)로 출력된다.
//
//입력
//10진수 1개가 입력된다.
//단, 입력되는 정수는 int 범위이다.
//
//
//출력
//8진수로 출력한다.
//
//
//입력 예시   
//10
//
//출력 예시
//12