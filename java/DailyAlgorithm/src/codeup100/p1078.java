package codeup100;
import java.util.Scanner;
public class p1078 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int evenNum = input/2;
		int result = 0;
		for(int i=0; i<=evenNum; i++) {
			result += 2*i;
		}
		System.out.print(result);
	}
}

//정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
//입력
//정수 1개가 입력된다.
//(0 ~ 100)
//
//
//출력
//1부터 입력된 수까지 짝수의 합을 출력한다.
//
//
//입력 예시   
//5
//
//출력 예시
//6