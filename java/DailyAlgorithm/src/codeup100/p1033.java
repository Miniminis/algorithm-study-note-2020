package codeup100;
import java.util.Scanner;
public class p1033 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String hexnum = String.format("%X%n", num);
		System.out.print(hexnum);
	}
}

//10진수를 16진수로 출력: 가장 간단한 방법 ㅎㅎ
//System.out.format("%02X%n", 255);  // FF
//System.out.format("%02x%n", 255);  // ff
//System.out.format("%X%n"  , 10);   // A
//출처 : http://mwultong.blogspot.com/2006/09/java-10-16-hex.html

