package backjoon;

import java.util.Scanner;
public class Greedy11407 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt(); 
		int count = 0;
		int[] coins= new int[n];
		for(int i=0; i<n; i++) {
			coins[i] = sc.nextInt();
		}
		
		for(int j=coins.length-1; j>=0; j--) {
			int num = money / coins[j];
			count += num;
			money = money % coins[j];
		}
		
		System.out.println(count);
	}

}
