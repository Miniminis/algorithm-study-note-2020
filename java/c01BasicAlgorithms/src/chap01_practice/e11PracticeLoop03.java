package chap01_practice;

import java.util.Scanner;

public class e11PracticeLoop03 {
	public static void main(String[] args) {
		//12. 곱셈표 출력 : 9*9
		System.out.println("======================="); 
		multi99();
		  /*|1 2 3 4 5 6 7 8 9 
		  --+-------------------------
		  1 | 1 2 3 4 5 6 7 8 9 
		  2 | 2 4 6 8 10 12 14 16 18 
		  3 | 3 6 9 12 15 18 21 24 27 
		  4 | 4 8 12 16 20 24 28 32 36 
		  5 | 5 10 15 20 25 30 35 40 45 
		  6 | 6 12 18 24 30 36 42 48 54 
		  7 | 7 14 21 28 35 42 49 56 63 
		  8 | 8 16 24 32 40 48 56 64 72 
		  9 | 9 18 27 36 45 54 63 72 81 */
		
		//13. 덧셈표 출력: 9
		System.out.println("=======================");
		plus99();
		
		//14. 길이가 n인 정사각형 
		System.out.println("=======================");
		nSqure();
		
		//15. 직각 이등변 삼각형 
		//- static void triangleLB(int n)
		System.out.println("=======================");
		triangleLB(10);
		
		//- static void triangleLU(int n)
		System.out.println("=======================");
		triangleLU(10);
		
		//- static void triangleRU(int n)
		System.out.println("=======================");
		triangleRU(10);
		
		//- static void triangleRB(int n)
		System.out.println("=======================");
		triangleRB(10);
		
		//16. n단의 피라미드를 출력 - static void spira(int n)
		System.out.println("=======================");
		spira(4);
		
		   /*
		     *
	        ***
	       *****
	      *******
	      */

		//17. n단의 숫자 피라미드 출력 : static void npira(int n) 
		System.out.println("=======================");
		npira(4);
		  /*1
		   222
		  33333
		 4444444*/
		
	}
	
	//12. 곱셈표 출력 : 9*9
	static void multi99() {
		System.out.print("  |");
		for(int i=1; i<=9; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("");
		System.out.println("--+-------------------------");

		for(int i=1; i<=9; i++) {
			System.out.print(i+" | ");
			for(int j=1; j<=9; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println("");
		}
		
	}
	//13. 덧셈표 출력: 9
	static void plus99() {
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
	
	//14. 길이가 n인 정사각형 
	static void nSqure() {
		Scanner scan = new Scanner(System.in);
		System.out.println("길이가 n인 정사각형 출력합니다. 숫자 n을 입력해주삼");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//15. 직각 이등변 삼각형 
	//- static void triangleLB(int n)
	static void triangleLB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//- static void triangleLU(int n)
	static void triangleLU(int n) {
		for(int i=n; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//- static void triangleRU(int n)
	static void triangleRU(int n) {		//어차피 j변수는 열을 구성하기 위함이기 때문에 
		for(int i=1; i<=n; i++) {		//처음부터 끝까지 빈칸은 공백, 내용은 *로 프린트 
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//- static void triangleRB(int n)
	static void triangleRB(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=n-i+1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//16. n단의 피라미드를 출력 - static void spira(int n)
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=n-i+1; j<=n+i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//행은 i, 열은 j
	//피라미드 *이 찍히는 지점의 규칙을 먼저 생각 : n-i+1;
	//열을 기준으로 *이 어떤 지점까지 찍히는 지  패던 생각: 시작점+각 행 당 *의 개수 -1 --> (n-i+1) + (2i-1) -1: n+i-1
	//i: 1 ~ n까지;
	//j 공백: 1 ~ n-i;
	//j * : n-i+1 ~ n+i-1;
	
	//17. n단의 숫자 피라미드 출력 : static void npira(int n)
	static void npira(int n) {
		for(int i=1; i<=n;  i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=n-i+1; j<=n+i-1; j++) {
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
