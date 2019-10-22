package hashtest;

import java.util.HashSet;

public class Set02 {

	public static void main(String[] args) {

		HashSet<Animal> hs = new HashSet<Animal>();
		
		hs.add(new Animal("고양이", "육지"));
		hs.add(new Animal("고양이", "육지"));
		hs.add(new Animal("고양이", "육지"));

		System.out.println(hs.size());

	}
}

/*
 * 해시 알고리즘(hash algorithm)이란 해시 함수(hash function)를 사용하여 데이터를 해시 테이블(hash table)에
 * 저장하고, 다시 그것을 검색하는 알고리즘입니다.
 * 
 * 자바에서 해시 알고리즘을 이용한 자료 구조는 위의 그림과 같이 배열과 연결 리스트로 구현됩니다. 저장할 데이터의 키값을 해시 함수에 넣어
 * 반환되는 값으로 배열의 인덱스를 구합니다. 그리고서 해당 인덱스에 저장된 연결 리스트에 데이터를 저장하게 됩니다.
 * 
 * 예를 들어, 정수형 데이터를 길이가 10인 배열에 저장한다고 한다면 1,000,002를 검색하는 방법은 다음과 같을 수 있습니다.
 * 1,000,002를 10으로 나눈 나머지가 2이므로 배열의 세 번째 요소에 연결된 연결 리스트에서 검색을 시작합니다. 매우 간략화한
 * 예제이지만 이렇게 해시 알고리즘을 이용하면 매우 빠르게 검색 작업을 수행할 수 있습니다.
 */
