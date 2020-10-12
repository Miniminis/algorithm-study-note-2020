package c02aplusb;

/*
* https://www.acmicpc.net/problem/1000
* https://www.acmicpc.net/source/share/a63ff228d9c64303a98b2cb26fe118e1
*
* 1. 두 정수 입력
* 2. 두 수의 합 출력
* */

/*방법1*/
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a+b);
//        sc.close();
//    }
//}

/*방법2*/
import java.io.*;
import java.util.StringTokenizer;

public class Main1 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(a+b+"\n");
            bw.flush();
            br.close();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}