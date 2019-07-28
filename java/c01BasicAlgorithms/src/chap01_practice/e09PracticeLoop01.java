package chap01_practice;

import java.util.Scanner;

public class e09PracticeLoop01 {
	public static void main(String[] args) {
		
		//7. 1부터 7까지의 총 합을 구하는 프로그램 
		totalSum();
		
		//8. 가우스 덧셈 이용하여 1~n까지의 정수의 합을 구하는 프로그램
		gaussCal();
		
		//9. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 매서드 
		//- static int sumof(int a, int b) 
		Scanner scan = new Scanner(System.in);
		System.out.println("2. 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구합니다. 두 정수 a와 b를 입력해주세요.");
		int a = scan.nextInt();
		int b= scan.nextInt();
		
		System.out.println("2. 두 정수 a와 b사이에 있는 모든 정수의 합은: "+sumof(a, b));
		
	}
	
	static void totalSum() {
		int sum = 0;
		for(int i=1; i<=7; i++) {
			sum += i;
		}
		
		int j=0;
		while(j<=7) {
			sum += j;
			j++;
		}
		
		System.out.println("0. for문 연산 결과: "+sum);
		System.out.println("0. while문 연산 결과: "+sum);
	}
	
	static void gaussCal() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 가우스 연산법을 이용하여 n까지의 합을 구합니다. 숫자 n을 입력해주세요.");
		int n = scan.nextInt();
		
		int sum = 0;
		if(n%2==0) {
			sum = (1+n)*(n/2);
		} else {
			sum = (n)*((n-1)/2)+n; 
		}
		
		System.out.println("1. 가우스 연산법의 결과 정수 n까지의 총 합은 : "+sum);
	}

	static int sumof(int a, int b) {
		int sum = 0;
		
		int i = 0;
		int n= 0;
		
		if(a>b) {
			i=b;
			n=a;
			while(i<=n) {
				sum += i;
				i++;
			}	
		} else if(a<b) {
			i=a;
			n=b;
			while(i<=n) {
				sum += i;
				i++;
			}
		} else {
			sum = (a+b)/2;
		} 
		
		return sum;
	}
}
