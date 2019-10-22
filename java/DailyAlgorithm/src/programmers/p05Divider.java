package programmers;

import java.util.*;

public class p05Divider {

	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		System.out.println(Arrays.toString(solution(arr, divisor)));
	}
	
	 public static int[] solution(int[] arr, int divisor) {
	      ArrayList<Integer> answer = new ArrayList<Integer>();
	      
	      for(int i : arr) {
	          if(i % divisor == 0) {
	              answer.add(i);
	          }
	      }
	      
	      if(answer.size()<=0) {
	          answer.add(-1);
	      } 
	      
	      Collections.sort(answer);
	      return answer.stream().mapToInt(i -> i).toArray();
	  }

}
