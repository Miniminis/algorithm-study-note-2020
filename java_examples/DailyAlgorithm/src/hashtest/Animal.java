package hashtest;

public class Animal {
	String species;
	String habitat;

	Animal(String species, String habitat) {
		this.species = species;
		this.habitat = habitat;
	}

	public int hashCode() {
		return (species + habitat).hashCode();
	}

	public boolean equals(Object obj) {

		if (obj instanceof Animal) {
			Animal temp = (Animal) obj;
			return species.equals(temp.species) && habitat.equals(temp.habitat);

		} else {
			return false;
		}

	}

}

/*
 * 위의 예제에서 요소의 저장 순서를 바꿔도 저장되는 순서에는 영향을 미치지 않는 것을 확인할 수 있습니다. 또한, add() 메소드를
 * 사용하여 해당 HashSet에 이미 존재하는 요소를 추가하려고 하면, 해당 요소를 저장하지 않고 false를 반환하는 것을 볼 수
 * 있습니다.
 * 
 * 이때 해당 HashSet에 이미 존재하는 요소인지를 파악하기 위해서는 내부적으로 다음과 같은 과정을 거치게 됩니다.
 * 
 * 1. 해당 요소에서 hashCode() 메소드를 호출하여 반환된 해시값으로 검색할 범위를 결정합니다. 
 * 2. 해당 범위 내의 요소들을 equals() 메소드로 비교합니다.
 * 
 * 따라서 HashSet에서 add() 메소드를 사용하여 중복 없이 새로운 요소를 추가하기 위해서는 hashCode()와 equals()
 * 메소드를 상황에 맞게 오버라이딩해야 합니다.
 */