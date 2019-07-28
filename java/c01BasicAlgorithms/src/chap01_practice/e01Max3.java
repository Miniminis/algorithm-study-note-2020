package chap01_practice;

import java.util.Scanner;

public class e01Max3 {

	public static void main(String[] args) {
		
		//세 개의 정수 중 최댓값을 구하는 문제 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 개의 정수 중, 최댓값을 구합니다.");
		System.out.println("첫번째 정수를 입력해주세요"); 
		int a = scan.nextInt();
		System.out.println("두번째 정수를 입력해주세요"); 
		int b = scan.nextInt();
		System.out.println("세번째 정수를 입력해주세요"); 
		int c = scan.nextInt();

		
		int max = a;
		if(b>max) {
			max = b;
		}
		if(c>max) {
			max = c;
		}
		
		System.out.println("세 개의 정수 중 최댓값은 "+max+" 입니다.");
	}

}
