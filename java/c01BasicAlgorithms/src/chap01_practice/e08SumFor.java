package chap01_practice;

import java.util.Scanner;

public class e08SumFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("n번쨰까지의 총합을 구합니다. 숫자 n을 입력해주세요.");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 0;
		for(i=1; i<=n; i++) {
			sum = sum+i;
		}
		
		System.out.println("입력한 수"+n+"까지의 총 값은 : "+sum);
		System.out.println("현재 i의 값은 : "+i);
	}

}
