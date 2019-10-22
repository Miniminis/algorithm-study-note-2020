package test;

import java.util.LinkedList;
import java.util.Stack;

public class QueueTest {
	/* 큐 메모리 구조는 선형 메모리 공간에 데이터를 저장하면서 선입선출(FIFO)의 시멘틱을 따르는 자료 구조입니다.
	       즉, 가장 먼저 저장된(push) 데이터가 가장 먼저 인출(pop)되는 구조입니다.
	 */

	public static void main(String[] args) {
		queueTest();
	}
	
	public static void queueTest() {
		
		LinkedList<String> qu = new LinkedList<String>(); // 큐의 생성
		//Deque<String> qu = new ArrayDeque<String>();

		// add() 메소드를 이용한 요소의 저장
		qu.add("넷");
		qu.add("둘");
		qu.add("셋");
		qu.add("하나");

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(qu.peek()); //넷
		System.out.println(qu);	//[넷, 둘, 셋, 하나]

		// poll() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(qu.poll());	//넷 
		System.out.println(qu);	//둘, 셋, 하나

		// remove() 메소드를 이용한 요소의 제거
		qu.remove("하나");
		System.out.println(qu);	//둘, 셋
		
	}

}
