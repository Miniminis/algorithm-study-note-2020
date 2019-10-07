package codeup100;
import java.util.Scanner;
public class p1036 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		char charWord = word.charAt(0);
		System.out.print((int)charWord);
	}
}

//영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력해보자.
//
//입력
//영문자 1개가 입력된다.
//
//
//출력
//아스키코드 값을 10진수로 출력한다.
//
//
//입력 예시   
//A
//
//출력 예시
//65