package codeup100;
import java.util.Scanner;
public class p1022 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		System.out.print(sentence);
	}
}
//입력
//공백이 포함되어 있는 한 문장이 입력된다.
//단, 입력되는 문장은 여러 개의 단어로 구성되고, 엔터로 끝나며,
//최대 길이는 2000 문자를 넘지 않는다.
//출력
//입력된 문장을 그대로 출력한다.
//
//입력 예시   
//Programming is very fun!!
//
//출력 예시
//Programming is very fun!!