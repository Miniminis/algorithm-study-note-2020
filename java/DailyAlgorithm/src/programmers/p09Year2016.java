package programmers;

public class p09Year2016 {

	public static void main(String[] args) {
		
		System.out.println((solution(5, 24)));
		
		/* 단서 
		 * 1. 2016년 1월 1일은 금요일이다. 
		 * 2. 요일 : 배열로 표현 가능 
		 * 3. 2016년은 윤년 : 2월 29일 존재 ==> 366일
		 * 
		 * 풀이
		 * 1. 요일 : 배열로 만들기 
		 * 2. 날짜 입력 받으면 366일 기준으로 몇일인지를 알아내야함 
		 * - 날짜 계산 : {달 별 일수}
		 * 3. 요일배열[그 수 % 7]   
		 * */

	}
	
	public static String solution(int a, int b) {
		
		int day = b;
		
		String[] date = {"THU","FRI","SAT", "SUN","MON","TUE","WED"};
		int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
 		for(int i=0; i<a-1; i++) {
 			day += days[i];
		}
 		System.out.println(day);
	    return date[day % 7]; 	      	      
	  }
}
