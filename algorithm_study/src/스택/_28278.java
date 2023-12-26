package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _28278 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	Stack<Integer> stack = new Stack<Integer>();
    	int cnt = Integer.parseInt(br.readLine());
    	
    	for(int i=1;i<=cnt;i++) {
    		String [] cmd = br.readLine().split(" ");
    		
    		switch (cmd[0]) {
				case "1": 
					int x = Integer.parseInt(cmd[1]);
					stack.push(x);
					break;
				case "2":
					if(stack.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(stack.pop() + "\n");
					}
					break;
				case "3":
					sb.append(stack.size() + "\n");
					break;
				case "4":
					if(stack.isEmpty()) {
						sb.append("1\n");
					}else {
						sb.append("0\n");
					}
					break;
				case "5":
					if(stack.isEmpty()) {
						sb.append("-1\n");
					}else {
						sb.append(stack.peek() + "\n");
					}
					break;
			}
    	}
    	System.out.println(sb.toString());
    	br.close();
    }
}
