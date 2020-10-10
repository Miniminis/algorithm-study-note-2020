package programmers;

public class p06MiddleString {

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(solution(s));

	}
	
    public static String solution(String s) {
    	String answer = "";
    	String[] strArr = new String[s.length()];
    	
    	for(int i=0; i<strArr.length; i++) {
    		strArr[i] = Character.toString(s.charAt(i));
    	}
    	
    	if(s.length() % 2==0) {
    		answer = strArr[(s.length() / 2)-1] + strArr[s.length() / 2];
    	} else {
    		answer = strArr[s.length() / 2];
    	}
    	
    	return answer;
    }
}
