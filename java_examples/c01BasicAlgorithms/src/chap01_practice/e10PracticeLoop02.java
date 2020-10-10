package chap01_practice;

import java.util.Scanner;

public class e10PracticeLoop02 {

	public static void main(String[] args) {
		//10. 두 변수 a, b에 정수를 입력하고 b-a의 결과값을 출력하는 프로그램 
		subtractResult();
		
		//11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램
		plusInt();

	}
	
	static void subtractResult() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("b-a의 결과값을 출력합니다. 두 정수 a, b를 차례로 입력해주세요. ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		while(b<a) {
			System.out.println("a보다 큰 값을 입력해주세요! ");
			b = scan.nextInt();
		} 

		int result = b-a;
		System.out.println("b-a의 결과: "+result);		
		
	}
	
	static void plusInt() {
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("양의 정수 하나를 입력해주세요. ");
			num = scan.nextInt();
		} while(num <=0);
		
		int cnt = 0;
		while(num>0) {
			num = num/10;
			cnt++;
		}
		
		System.out.println("그 수는 "+cnt+"자리입니다.");
		
	}

}
