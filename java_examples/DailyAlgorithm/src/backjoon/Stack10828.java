package backjoon;

import java.util.Scanner;

public class Stack10828 {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] arr = new int[num]; //스택 데이터 담을 배열 
		int idx = -1;
		
		while(num > 0) {	
			
			String command = sc.next();
						
			switch(command) {
				case "pop" : 
					if(idx<0) {
						System.out.println(-1);
						break;
					}
					System.out.println(arr[idx]);
					idx--; //idx 를 옮겨주어 다음 요소가 해당 요소를 뒤집어쓰도록 함 
					break;
				case "size" :
					if(idx<0) {
						System.out.println(0);
						break;
					}
					System.out.println(idx+1);
					break;
				case "empty" :
					if(idx<0) {
						System.out.println(1);
						break;
					}
					System.out.println(0);
					break;
				case "top" : 
					if(idx<0) {
						System.out.println(-1);
						break;
					}
					System.out.println(arr[idx]);
					break;
				case "push" : 
					idx++;
					arr[idx] = sc.nextInt();
					break;
			}
			num--;
		}
	}
}
