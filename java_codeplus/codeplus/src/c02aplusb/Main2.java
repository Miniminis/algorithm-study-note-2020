package c02aplusb;
/*
 * https://www.acmicpc.net/problem/2558
 * */

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a>0 && b<10) {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(a+b+"\n");
            bw.flush();
            bw.close();
            br.close();
        }
    }
}
