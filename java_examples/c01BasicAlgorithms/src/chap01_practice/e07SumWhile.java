package chap01_practice;

import java.util.Scanner;

public class e07SumWhile {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n번째까지 총합을 구합니다. 숫자를 입력해주세요.");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		
		System.out.println("입력한 수"+n+"까지의 합은 : "+sum);
		System.out.println("현재 i의 값 : "+i); //i의 값이 연산 이후에 1증가하므로, n번째까지의 합을 구한다면, i는 n+1의 값을 갖고 출력되게 됨.
	}

}
