package c02aplusb;

/*
* https://www.acmicpc.net/problem/10950
* https://www.acmicpc.net/source/share/ed44a4f395a945bc9bb2c88d1b4e5fb2
* */

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i<cnt; i++) {
            String[] strs = br.readLine().split(" ");
            int a = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);


            if(a>0 && b<10) {
                bw.write(a+b+"\n");
            } else {
                bw.write("a가 0보다 작거나, b가 10보다 큽니다!");
            }

            bw.flush();
        }
        bw.close();
        br.close();
    }
}
