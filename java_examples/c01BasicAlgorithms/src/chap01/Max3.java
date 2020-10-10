package chap01;
import java.util.Scanner;
// 3개의 정숫값을 입력하고 최댓값을 구합니다.

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);	//Scanner 클래스 이용하여 사용자로부터 입력받기 

		System.out.println("세 정수의 최댓값을 구합니다.");	//사용자에게 프로그램의 진행 설명 
		System.out.print("a의 값：");	int a = stdIn.nextInt();	//첫번째 정수 입력받기 
		System.out.print("b의 값：");	int b = stdIn.nextInt();	//두번째 정수 입력받기 
		System.out.print("c의 값：");	int c = stdIn.nextInt();	//세번째 정수 입력받기 
		int max = a;	//첫번째 정수를 우선 최댓값으로 설정 
		if (b > max) max = b; //최댓값과 두번째 정수 비교 
		if (c > max) max = c;	//최댓값과 세번째 정수 비교 

		System.out.println("최댓값은 " + max + "입니다."); //최종 최댓값 선정 및 출력 
	}
}