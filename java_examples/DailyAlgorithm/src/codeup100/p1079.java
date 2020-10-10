package codeup100;
import java.util.Scanner;
import java.util.StringTokenizer;
public class p1079 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strs = scan.nextLine();
		StringTokenizer tk = new StringTokenizer(strs, " ");
		while(tk.hasMoreTokens()) {
			String result = tk.nextToken();
			if(result.equals("q")) {
				System.out.println(result);
				break;
			} else {
				System.out.println(result);
			}
		}
	}
}

//'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.
//
//입력
//문자들이 1개씩 계속해서 입력된다.
//
//
//출력
//'q'가 입력될 때까지 입력된 문자를 줄을 바꿔 한 줄씩 출력한다.
//
//
//입력 예시   
//x b k d l q g a c
//
//출력 예시
//x
//b
//k
//d
//l
//q