package test;

import java.util.Stack;

public class StackTest {
	/* Stack<E> 클래스
	Stack 클래스는 List 컬렉션 클래스의 Vector 클래스를 상속받아, 전형적인 스택 메모리 구조의 클래스를 제공합니다.
	스택 메모리 구조는 선형 메모리 공간에 데이터를 저장하면서 후입선출(LIFO)의 시멘틱을 따르는 자료 구조입니다.
	즉, 가장 나중에 저장된(push) 데이터가 가장 먼저 인출(pop)되는 구조입니다.*/

	public static void main(String[] args) {
		stackTest();
	}
	
	public static void stackTest() {
		// 보다 빠르고 복잡한 stack 구현 : Deque<Integer> st = new ArrayDeque<Integer>();
		
		Stack<Integer> st = new Stack<Integer>(); // 스택의 생성
		//Deque<Integer> st = new ArrayDeque<Integer>();

		// push() 메소드를 이용한 요소의 저장
		st.push(4);
		st.push(2);
		st.push(3);
		st.push(1);
		//순서 : 4-3-2-1

		// peek() 메소드를 이용한 요소의 반환
		System.out.println(st.peek());	//1
		System.out.println(st); //[4, 2, 3, 1]

		// pop() 메소드를 이용한 요소의 반환 및 제거
		System.out.println(st.pop()); //1
		System.out.println(st); //[4, 2, 3]

		// search() 메소드를 이용한 요소의 위치 검색
		System.out.println(st.search(4));	//요소 4의 인덱스 : 3
		System.out.println(st.search(3));	//요소 3의 인덱스 : 1 (0부터 시작 아님!)
		
	}

}
