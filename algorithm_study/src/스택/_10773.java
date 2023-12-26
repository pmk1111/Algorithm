package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10773 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		
		int cnt = 0;
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			int input = Integer.parseInt(br.readLine());
			if(input != 0) {
				stack.push(input);
			} else {
				stack.pop();
			}
		}
		
		for(int i=0;i<stack.size();i++) {
			cnt += stack.get(i);
		}
		System.out.println(cnt);
	}
}
