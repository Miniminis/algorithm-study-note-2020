package datastructure;

import java.util.Random;
import java.util.Scanner;

public class p01MaxNum {

	public static void main(String[] args) {
		
		//1. array - maxnum
		//maxnum();
		//2. array - reverse
		//swap();
		//3. sum
		//sumOf();
		//4. copy();
		//copy();
		//5. rcopy();
		rcopy();
		
	}
	
	//Q1. 사람 키와 배열 길이를 입력받아 배열 생성 - 최댓값 구하기 
	public static void maxnum() {
		//반환할 결과값 max 정의 
		int max = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 길이 입력");
		int num = scan.nextInt();
		
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.println("사람 키 입력해주세여");
			height[i] = scan.nextInt();
		}
		
		//완성된 배열 height 의 max 값 구하기 
		max = height[0];
		
		for(int i=1; i<height.length; i++) {
			if(height[i]>max) {
				max = height[i];
			}
		}
		
		//위의 for 문의 결과 최댓값은 max가 됨 
		System.out.println("제일 큰 키는 :"+max);
	}
	
	//Q2. 배열 역순으로 정렬 
	public static void swap() {
		Random rand = new Random();
		int[] a = new int[5];
		
		for(int i=0; i<a.length; i++) {
			a[i] = rand.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("");
		System.out.println("배열의 순서를 바꿉니다. ");
		int t;
		for(int i=0; i<a.length/2; i++) {
			t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
		
	//Q3. 배열 a의 모든 요소 합 
	public static void sumOf() {
		//결과값 sum 
		int sum=0;
		
		Random rand = new Random(120);
		
		int[] b = new int[10];
		for(int i=0; i<b.length; i++) {
			b[i] = rand.nextInt();
		}
		
		//배열 b 출력 
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		for(int i=0; i<b.length; i++) {
			sum = sum + b[i];
		}
		System.out.println("");
		System.out.println("배열 b의 총 합은 : "+sum);
	}
	
	//Q4. 배열 b의 모든 요소를 배열 a에 복사 
	static void copy() {
		int[] b = new int[] {10, 450, 20, 234, 1};
		
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		System.out.println("");
		int[] a = b.clone();
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	//Q5. 배열 b의 모든 요소를 배열 a에 역순으로 복사 
	static void rcopy() {
		int[] b = {1, 100, 23, 543, 2224};
		int[] a = new int[b.length];
		
		for(int i=0; i<b.length; i++) {
			a[b.length-1-i] = b[i];
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}


}
