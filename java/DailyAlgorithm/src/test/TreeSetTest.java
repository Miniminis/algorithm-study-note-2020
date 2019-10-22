package test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	/*
	 * TreeSet 클래스는 데이터가 정렬된 상태로 저장되는 이진 검색 트리(binary search tree)의 형태로 
	 * 요소를 저장합니다. 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠릅니다. JDK 1.2부터 
	 * 제공되는 TreeSet 클래스는 NavigableSet 인터페이스를 기존의 이진 검색 트리의 성능을 향상시킨 
	 * 레드-블랙 트리(Red-Black tree)로 구현합니다. TreeSet 클래스는 Set 인터페이스를 구현하므로, 
	 * 요소를 순서에 상관없이 저장하고 중복된 값은 저장하지 않습니다.
	 * 
	 * 위의 예제처럼 TreeSet 인스턴스에 저장되는 요소들은 모두 정렬된 상태로 저장됩니다.
		또한, 위의 예제에서 사용된 subSet() 메소드는 TreeSet 인스턴스에 저장되는 
		요소가 모두 정렬된 상태이기에 동작이 가능한 해당 트리의 부분 집합만을 보여주는 메소드입니다.
	 */

	public static void main(String[] args) {
		treeSetTest();
	}

	public static void treeSetTest() {
		TreeSet<Integer> ts = new TreeSet<Integer>();

		// add() 메소드를 이용한 요소의 저장
		ts.add(30);
		ts.add(40);
		ts.add(20);
		ts.add(10);

		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		for (int e : ts) {
		    System.out.print(e + " ");
		}
		
		System.out.println();
		
		// remove() 메소드를 이용한 요소의 제거
		ts.remove(40);

		// iterator() 메소드를 이용한 요소의 출력
		Iterator<Integer> iter = ts.iterator();
		while (iter.hasNext()) {
		    System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("이진 검색 트리의 크기 : " + ts.size());

		// subSet() 메소드를 이용한 부분 집합의 출력
		System.out.println(ts.subSet(10, 20));
		System.out.println(ts.subSet(10, true, 20, true));
		
		//1. public NavigableSet<E> subSet(E fromElement, E toElement)
		//2. public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
	}
}

//boolean add(E e)	해당 집합(set)에 전달된 요소를 추가함. (선택적 기능)
//void clear()	해당 집합의 모든 요소를 제거함. (선택적 기능)
//boolean contains(Object o)	해당 집합이 전달된 객체를 포함하고 있는지를 확인함.
//boolean equals(Object o)	해당 집합과 전달된 객체가 같은지를 확인함.
//boolean isEmpty()	해당 집합이 비어있는지를 확인함.
//Iterator<E> iterator()	해당 집합의 반복자(iterator)를 반환함.
//boolean remove(Object o)	해당 집합에서 전달된 객체를 제거함. (선택적 기능)
//int size()	해당 집합의 요소의 총 개수를 반환함.
//Object[] toArray()	해당 집합의 모든 요소를 Object 타입의 배열로 반환함.
