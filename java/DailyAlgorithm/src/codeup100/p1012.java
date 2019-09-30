package codeup100;

import java.util.Scanner;

public class p1012 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		
		String x6 = String.format("%.6f", x);
		
		System.out.print(x6);
		scan.close();
	}
}
