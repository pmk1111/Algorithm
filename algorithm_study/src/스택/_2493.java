package 스택;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class _2493 {
    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<Integer>();
        int cnt = Integer.parseInt(br.readLine());
        int[] arr = new int[cnt];

        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < cnt; i++) {
            while (!stack.isEmpty()) {
                if (arr[stack.peek()] > arr[i]) {
                    bw.write((stack.peek() + 1) + " ");
                    break;
                }
                stack.pop();
            }

            if (stack.isEmpty()) {
                bw.write("0 ");
            }

            stack.push(i);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
