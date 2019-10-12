package programmers;

import java.util.Arrays;

public class p02KNumber {
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
		/* 풀이
		 * 1. commands 배열 속 각 1차원 배열의 첫번째 요소  : int sIdx;
		 * 2. 두번째 요소 : int eIdx;
		 * 3. 배열을 i~k 까지 끊기 : 
		 * 4. 배열 오름차순으로 정렬 
		 * 5. 세번째요소 int k 번째 index 에 맞는 요소  - answer[] 에 저장
		 * 6. commands 배열의 행 만큼 반복 
		 * 7. 배열 출력 
		 * */
        for(int i=0; i<commands.length; i++) {
        	int sIdex = commands[i][0];
        	int eIdx = commands[i][1];
        	int k = commands[i][2];
        	
            int[] newArrays = Arrays.copyOfRange(array, sIdex-1, eIdx);
            Arrays.sort(newArrays);
            answer[i] = newArrays[k-1];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {
				{2, 5, 3}, 
				{4, 4, 1}, 
				{1, 7, 3}
		};
		solution(array, commands);
		
		//return : [5, 6, 3]
	}
}
