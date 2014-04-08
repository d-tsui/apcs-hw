import java.io.*;
import java.util.*;

public class RPNCalc{
	private MyStack stack;

	public void input(){
		Scanner sc = new Scanner(System.in);
     	String s = sc.nextLine();
     	int result;
     	if (s.equals("+")){
     		result = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
     		stack.push(result);
     		System.out.println("S: " + stack);
     	} else if (s.equals("-")){
     		result = Integer.parseInt(stack.pop()) - Integer.parseInt(stack.pop());
     		stack.push(result);
     		System.out.println("S: " + stack);
     	} else if (s.equals("*")){
     		result = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());
     		stack.push(result);
     		System.out.println("S: " + stack);
     	} else if (s.equals("/")){
     		result = Integer.parseInt(stack.pop()) / Integer.parseInt(stack.pop());
     		stack.push(result);
     		System.out.println("S: " + stack);
     	} else if (s.equals("clear")){
     		while (stack.getSize() != 0){
     			stack.pop();
     		}
     		System.out.println("S: " + stack);
     	} else {
     		stack.push(Integer.parseInt(s));
     		System.out.println("S: " + stack);
     	}
	}

	public static void main(String[]args){
		RPNCalc n = new RPNCalc();
		n.stack = new MyStack();
		int i = 0;
		while(i == 0){
			n.input();
		}
	}
    
}