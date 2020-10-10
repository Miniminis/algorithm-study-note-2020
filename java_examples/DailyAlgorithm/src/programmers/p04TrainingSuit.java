package programmers;

import java.util.ArrayList;
import java.util.List;

public class p04TrainingSuit {

	public static void main(String[] args) {
		/* 풀이 
		 * 1. 우선 체육이 가능한 사람들 answer = 전체 인원 - lost.length 
		 * - 체육복을 빌리는 사람이 많아질수록 answer 가 추가될 것임. 
		 * 2. 각 배열을 리스트로 변형 
		 * 3. 잃어버린 학생들과 여분이 있는 학생들을 비교하여 같은 학생 번호가 있는지 확인 
		 * - 조건 확인 : 여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
		 * 4. 잃어버린 학생과 여분학생-1 or 여분학생+1 비교 : reserve배열에서 삭제처리, answer++ 
		 * 5. 최종적으로 answer 반환
		 * */
		int n = 5;
		int[] lost = {2, 4};
		int[] reserve = {1, 3, 5};
		solution(n, lost, reserve);

	}
	
    public static int solution(int n, int[] lost, int[] reserve) {
    	//일단 체육할 수 있는 학생수
    	int answer = n - lost.length;
    	
    	List<Integer> lostlist = new ArrayList<Integer>();
    	for(int i : lost) { lostlist.add(i); };
    	
    	List<Integer> reslist = new ArrayList<Integer>();
    	for(int j : reserve) { reslist.add(j); };
    	
    	//여분 가져온 학생들 중 체육복 잃어버린 학생들 고려대상에서 지우기 + answer++
    	for(int i=0; i<lostlist.size(); i++) {
    		for(int j=0; j<reslist.size(); j++) {
    			if(lostlist.get(i) == reslist.get(j)) {
    				lostlist.remove(i);
    				reslist.remove(j);
    				i--; 
    				answer++;
    				break;
    			}
    		}
    	}
    	
    	//체육복을 빌릴 수 있는 학생들 조회 시작 
    	for(int i=0; i<lostlist.size(); i++) {
    		for(int j=0; j<reslist.size(); j++) {
    			if((lostlist.get(i) == reslist.get(j)+1) || (lostlist.get(i) == reslist.get(j)-1)) {
    				reslist.remove(j);
    				answer++;
    				break;
    			}
    		}
    	}
    	return answer;   
    }
}
