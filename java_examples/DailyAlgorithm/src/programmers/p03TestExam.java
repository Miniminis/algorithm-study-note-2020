package programmers;

import java.util.ArrayList;
import java.util.List;

public class p03TestExam {
	public static void main(String[] args) {
		/* 풀이 
		 * 1. 입력받은 정답 배열 길이만큼 배열 3개 생성 
		 * 2. 1번 수포자 : 1-5 까지 반복문돌리면서 배열 요소 채우기 
		 * 3. 2번 수포자 : 2를 넣는 반복문 1개, 다른 숫자를 넣는 반복문 1개 
		 * 4. 3번 수포자 : 
		 * 4. 각 배열과 정답 배열의 요소들을 비교 --> 같은 요소들의 수 각각 구하기 
		 * 5. 요소의 수가 가장 큰 수포자를 반환 
		 * */
		
		/* 수정풀이 
		 * 1. 학생별로 찍기 패턴을 담은 배열 stu1, 2, 3 선언 
		 * 2. 정답 수 체크를 위한 cnt 배열 선언 
		 * 3. 정답배열 요소들과 비교/ 정답인 학생이 중복될 수 있으므로 개별 if 문 처리  
		 * - 1학생 정답 경우 : 
		 * - 2학생 정답 경우 : 
		 * - 3학생 정답 경우 : 
		 * 4. 정답수 배열에서 제일 큰 점수 찾기 
		 * 5. 중복 승자 존재 가능성이 있으므로 정답 list 생성 
		 * --> cnt 배열과 == 4번에가 찾은 제일 큰 점수 비교하여 list.add() 
		 * 6. answer 배열에 결과 넣어서 출력 
		 * */
		int[] answers = {1,2,3,4,5};
		System.out.println(solution(answers));
	}
	
	public static int[] solution(int[] answers) {
        
		int[] stu1 = {1, 2, 3, 4, 5};
		int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		//정답 수 체크
		int[] cnt = new int[3];
		
		//정답비교 
		for(int i=0; i<answers.length; i++) {
			if(answers[i] == stu1[i%stu1.length]) {
				cnt[0]++;
			}
			if(answers[i] == stu2[i%stu2.length]) {
				cnt[1]++;
			}
			if(answers[i] == stu3[i%stu3.length]) {
				cnt[2]++;
			}
		}
		
		//최고 점수 찾기 
		int max = cnt[0];
		for(int i=0; i<cnt.length; i++) {
			if(max<cnt[i]) {
				max = cnt[i];
			}
		}
		
		//최고점수와 같은 학생 찾기 
		List<Integer> winnersList = new ArrayList<Integer>();
		
		for(int i=0; i<cnt.length; i++) {
			if(max == cnt[i]) {
				winnersList.add(i+1);
			}
		}
		
		//정답 출력
		//반환할 답안 
		int[] answer = new int[winnersList.size()];
        
		for(int i=0; i<winnersList.size(); i++) {
			answer[i] = winnersList.get(i);
		}
		
        return answer;
    }
}
