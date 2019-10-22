package programmers;

public class p06MiddleString2 {

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(solution(s));

	}
	
    public static String solution(String s) {
    	return s.substring((s.length()-1) / 2, s.length()/2 + 1);   
    }
}

//s의 길이 : sindex, eindex  
//7 --> 3, 4
//6--> 2, 4
//5 --> 2, 3
//4 --> 1, 3
//3--> 1, 2
//2--> 0, 2
