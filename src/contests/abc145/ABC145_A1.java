package contests.abc145;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC145_A1 {
    public static void main(String args[]) {
        int r = read();
        System.out.println(r * r);
    }

    // 入出力用関数
    private static int read() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.valueOf(reader.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }
}