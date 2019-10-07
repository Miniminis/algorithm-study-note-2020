package codeup100;
import java.util.Scanner;
import java.util.StringTokenizer;
public class p1026 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		StringTokenizer tk = new StringTokenizer(time, ":");
		String[] times = new String[3];
		int i = 0;
		while(tk.hasMoreTokens()) {
			times[i] = tk.nextToken();
			if(times[i].equals("00")) {
				times[i] = "0";
			}
			i+= 1;
		}
		System.out.println(times[1]);
	}
}
//입력되는 시:분:초에서 분만 출력해보자.
//
//참고
//int h, m, s;
//scanf("%d:%d:%d", &h, &m, &s);
//
//를 실행하면 콜론을 사이에 둔 형식으로 입력되어, h, m, s에 각각 정수값만 저장된다.
//
//
//입력
//시 분 초가
//시:분:초 형식으로 입력된다.
//
//
//출력
//분만 출력한다.
//
//
//입력 예시   
//17:23:57
//
//출력 예시
//23