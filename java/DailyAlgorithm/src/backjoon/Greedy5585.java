package backjoon;
import java.util.Scanner;

public class Greedy5585 {
	public static void main(String[] args) {
		/* 풀이 : 최소 잔돈 
		 * int answer;
		 * int[] coins ={500, 100, 10, 50, 1}
		 * int change = 1000 - input 
		 * change / coins[0] ...  
		 * */
		
		int[] coins = {500, 100, 50, 10, 5, 1};
		
		Scanner sc = new Scanner(System.in);
		int change = 1000 - sc.nextInt();
		int count = 0;
		
		for(int coin : coins) {
			int num =  change / coin;
			count += num;
			change = change - (coin*num);
		}
		
		System.out.println(count);
	}
}

/* 그리디 알고리즘/탐욕법 
 * 여러 경우 중, 하나를 결정해야할 때, 그 순간에 최적이라고 생각되는 것을 선택해 나가는 방식 
 * 대표 : 거스름돈 
 * */


