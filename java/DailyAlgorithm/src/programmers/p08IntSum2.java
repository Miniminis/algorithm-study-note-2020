package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class p08IntSum2 {

	public static void main(String[] args) {
		
		System.out.println((solution(3, 5)));
	}
	
	public static long solution(int a, int b) {
	      long max = Math.max(a, b);
	      long min = Math.min(a, b);
	      
	      return (max-min+1)*(max+min) / 2;
	  } 
}
