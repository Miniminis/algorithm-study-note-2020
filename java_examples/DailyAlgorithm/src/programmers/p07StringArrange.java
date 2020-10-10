package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class p07StringArrange {

	public static void main(String[] args) {
		String[] s = {"sun", "bed", "car"};
		System.out.println(Arrays.toString(solution(s, 2)));
	}
	
	public static String[] solution(String[] strings, int n) {
		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				
				if(s1.charAt(n) > s2.charAt(n) ) {
					return 1;
				} else if(s1.charAt(n) == s2.charAt(n) ) {
					return s1.compareTo(s2);
				} else if(s1.charAt(n)<s2.charAt(n) ) {
					return -1;
				} else {
					return 0;
				}
			}
		});
		return strings;
	}	      
}

//comparable : 기본 정렬 
//기본값.compareTo(비교값)
//comparator : 사용자 정의 정렬시 

//Arrays.sort(arr)
//Arrays.sort(arr, Collections.reverseOrder());