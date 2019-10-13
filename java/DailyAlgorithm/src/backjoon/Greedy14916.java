package backjoon;

import java.util.Scanner;
public class Greedy14916 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] coins = {5, 2};
		int change = sc.nextInt();
		int count = 0;
		for(int coin : coins) {
			int num = change / coin;
			count += num;
			change = change - (coin*num);
		}
		System.out.println(count);		
	}
}
