package programmers;

import java.util.HashMap;

public class p01Participant2 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String player : participant) {
        	hm.put(player, hm.getOrDefault(player, 0) + 1);
        	//<leo, 1>, <kiki, 1>, <eden, 1> 
        	//getOrDefault() : 동명이인 구분 
        	//만약 동명이인이 있다면 <eden, 2> 과 같이 map 에 저장됨 
        	//--> 결국 동명이인 여부와 상관없이 모든 참가자가 맵에 저장되게 됨!
        	
        }
        for (String player : completion) {
        	hm.put(player, hm.get(player) - 1);
        	//만약 completion 배열에 담긴 참가자라면, map의 value 값을 -1 해준다. 
        	//따라서 완주했다면 <eden, 0>처럼 value 값이 0 이 되어야 함 
        }
        
        System.out.println("hm.keySet() 출력"+hm.keySet());
        System.out.println("hm.entrySet() 출력"+hm.entrySet());
        
        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		solution(participant, completion);
	}
}
