package codeup100;

import java.util.Scanner;

public class p1014 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String twochars = scan.nextLine();
		char[] charArray = twochars.toCharArray();
		System.out.println(charArray[2] + " "+charArray[0]);
	}

}

//2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
//
//참고
//char x, y;
//scanf("%c %c", &x, &y);
//printf("%c %c", y, x); //출력되는 순서를 작성
//와 같은 방법으로 해결할 수 있다.
//
//입력
//2개의 문자가 공백으로 구분되어 입력된다.
//
//
//출력
//두 문자의 순서를 바꿔 출력한다.
//
//
//입력 예시   
//A b
//
//출력 예시
//b A

//방법 1) char[] for 반복문으로 하나씩 꺼내기+임의의변수에 하나씩 += 
//방법 2) char[] String 으로 변환 : String.valueOf(char[]);
//방법 3) String str = new String(char[], 시작index, 끝index);
//방법 4) 한글자 : char.toString();  or Character.toString(char);