package codeup100;
import java.util.Scanner;
public class p1024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		char[] words = word.toCharArray();
		for(int i=0; i<words.length; i++) {
			System.out.println("'"+words[i]+"'");
		}
	}
}

//단어를 1개 입력받는다.
//
//입력받은 단어(영어)의 각 문자를
//
//한줄에 한 문자씩 분리해 출력한다
//
//단어(영어) 하나를 입력받는다.
//(단, 단어의 길이는 20자 이하이다.)
//
//
//출력
//단어의 문자(영어)를 하나씩 나누어 한 줄에 한 개씩
//' '로 묶어서 출력한다.
//
//
//입력 예시   
//Boy
//
//출력 예시
//'B'
//'o'
//'y'
