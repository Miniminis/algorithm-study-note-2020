package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeMap;

public class TreeMapTest {
	/* TreeMap 클래스는 키와 값을 한 쌍으로 하는 데이터를 이진 검색 트리(binary search tree)의 형태로 저장합니다.
	이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠릅니다.
	JDK 1.2부터 제공된 TreeMap 클래스는 NavigableMap 인터페이스를 기존의 이진 검색 트리의 성능을 향상시킨 
	레드-블랙 트리(Red-Black tree)로 구현합니다.
	TreeMap 클래스는 Map 인터페이스를 구현하므로, 중복된 키로는 값을 저장할 수 없습니다.
	하지만 같은 값을 다른 키로 저장하는 것은 가능합니다.*/

	public static void main(String[] args) {
		treeMapTest();
	}
	
	public static void treeMapTest() {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		// put() 메소드를 이용한 요소의 저장
		tm.put(30, "삼십");
		tm.put(10, "십");
		tm.put(40, "사십");
		tm.put(20, "이십");

		// Enhanced for 문과 get() 메소드를 이용한 요소의 출력
		System.out.println("맵에 저장된 키들의 집합 : " + tm.keySet());

		for (Integer key : tm.keySet()) {
		    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}

		// remove() 메소드를 이용한 요소의 제거
		tm.remove(40);

		// iterator() 메소드와 get() 메소드를 이용한 요소의 출력
		Iterator<Integer> keys = tm.keySet().iterator();

		while (keys.hasNext()) {
		    Integer key = keys.next();
		    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}

		// replace() 메소드를 이용한 요소의 수정
		tm.replace(20, "twenty");

		for (Integer key : tm.keySet()) {
		    System.out.println(String.format("키 : %s, 값 : %s", key, tm.get(key)));
		}

		// size() 메소드를 이용한 요소의 총 개수
		System.out.println("맵의 크기 : " + tm.size());
	}
}