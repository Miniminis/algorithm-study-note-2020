package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	/* 리스트 특징 
	 * 1. 요소의 저장 순서가 유지됩니다.
	   2. 같은 요소의 중복 저장을 허용합니다. 
	 * */

	public static void main(String[] args) {
		linkedListTest();
	}
	
	public static void linkedListTest() {
		
		LinkedList<String> list = new LinkedList<String>();
		
		//리스트에 요소 삽입 
		list.add("apple");
		list.add("banana");
		list.add("elephant");
		list.add("sky");
		list.add("computer");
		
		//요소 출력 
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + "  ");
		}
		System.out.println();
		
		//요소 제거 
		list.remove(2);
		
		//요소 출력 2
		for(String i : list) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		//오름차순으로 sorting : abc 순서
		Collections.sort(list);
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + "  ");	//sorting 후 출력 
		}
		System.out.println();
		
		//특정 인덱스 요소 변경
		list.set(2, "152");
		
		for(String i : list) {
			System.out.print(i + "       ");
		}
		
		System.out.println();
		
		System.out.println("리스트의 크기 "+ list.size());
	}

}
