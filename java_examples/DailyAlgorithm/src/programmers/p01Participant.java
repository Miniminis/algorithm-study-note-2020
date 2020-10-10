package programmers;

import java.util.Arrays;

public class p01Participant {
	public static String solution(String[] participant, String[] completion) {
		/* 두 배열은 항상 1만큼 길이가 차이나기 때문에 
		 * 두 배열을 오름차순으로 정렬한 후 
		 * 각 인덱스의 요소를 비교해주면 된다. 
		 * */
		
		Arrays.sort(participant);
        Arrays.sort(completion);
        
        System.out.println(participant);
        String temp = "";
        String answer = "";
        
        for(int i=0; i<completion.length; i++) {
            if(!completion[i].equals(participant[i])) {
                temp = participant[i];
                break;
            }
        }
        
        if(!temp.equals("")) {
        	answer = temp;
        } else {
        	answer = participant[participant.length-1];
        }
        
        return answer;
    }

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		solution(participant, completion);
	}
}
