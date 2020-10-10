package codeup100;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p1019 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String date = scan.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(date, ".");
		
		int[] dates = new int[3];
		int i=0;
		while (tokenizer.hasMoreTokens()) {
			dates[i] = Integer.parseInt(tokenizer.nextToken());
			i+=1;
		}
		//System.out.print(dates.toString());
		String year = String.format("%04d", dates[0]);
		String month = String.format("%02d", dates[1]);
		String day = String.format("%02d", dates[2]);
		
		System.out.print(year+"."+month+"."+day);
	}

}

//년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
//
//입력
//연, 월, 일이 ".(닷)"으로 구분되어 입력된다.
//
//
//출력
//입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
//(%02d를 사용하면 2칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.)
//
//
//입력 예시   
//2013.8.5
//
//출력 예시
//2013.08.05