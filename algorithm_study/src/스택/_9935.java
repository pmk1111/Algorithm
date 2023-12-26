package 스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9935 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String str = br.readLine();
    	String bomb = br.readLine();
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	for(int i=0;i<str.length();i++) {
    		stack.push(str.charAt(i));
    		
    		if(stack.size() >= bomb.length()) {
    			boolean explosionDetect = true;
    			
    			for(int j=0;j<bomb.length();j++) {
    				if(stack.get(stack.size() - bomb.length() + j) != bomb.charAt(j)) {
    					explosionDetect = false;
    					break;
    				}
    			}
    			
    			if(explosionDetect) {
    				for(int j=0;j<bomb.length();j++) {
    					stack.pop();
    				}
    			}
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(char c:stack) {
    		sb.append(c);
    	}
    	
    	String result = (sb.length() == 0) ? "FRULA" : sb.toString();
    	
    	System.out.println(result);
    }
    
}
