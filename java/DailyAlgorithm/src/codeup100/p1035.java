package codeup100;
import java.util.Scanner;
public class p1035 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String hexNum = scan.nextLine();
		int num = Integer.parseInt(hexNum, 16);
		String octNum = Integer.toOctalString(num);
		System.out.print(octNum);
	}
}

//16진수로 입력된 정수 1개를 8진수로 바꾸어 출력해보자.
//%x(영문자 소문자) 나 %X(영문자 대문자)로 입력 받으면
//16진수로 인식시켜 저장시킬 수 있다. %o로 출력하면 8진수로 출력된다.
//
//입력
//16진 정수 1개가 입력된다.
//(단, 16진수는 영문 소문자로 입력된다.)
//
//
//출력
//8진수로 바꾸어 출력한다.
//
//
//입력 예시   
//f
//
//출력 예시
//17