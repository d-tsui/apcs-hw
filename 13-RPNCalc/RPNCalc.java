import java.io.*;
import java.util.*;

public class RPNCalc{
    private MyStack stack;

    public void input(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Input: ");
     	String s = sc.nextLine();
     	double result; 
     	if (s.equals("+")){ 
	    double x = Double.parseDouble(stack.pop());
	    if (!stack.isEmpty()) {
		double y = Double.parseDouble(stack.pop());
		result = x + y;
	    } else {
		result = x;
	    }
	    stack.push(result);

     	} else if (s.equals("-")){
	    double x = Double.parseDouble(stack.pop());
	    if (!stack.isEmpty()) {
		double y = Double.parseDouble(stack.pop());
		result = y - x;
	    } else {
		result = x;
	    }
	    stack.push(result);

     	} else if (s.equals("*")){
	    double x = Double.parseDouble(stack.pop());
	    if (!stack.isEmpty()){
		double y = Double.parseDouble(stack.pop());
		result = x * y;
	    } else {
		result = x;
	    }
	    stack.push(result);

     	} else if (s.equals("/")){
	    double x = Double.parseDouble(stack.pop());
	    if (!stack.isEmpty()){
		double y = Double.parseDouble(stack.pop());	    
		result = y / x;
	    } else {
		result = x;
	    }
	    stack.push(result);

     	} else if (s.equals("clear")){
	    while (stack.getSize() != 0){
		stack.pop();
	    }

     	} else {
	    stack.push(Double.parseDouble(s));

     	}

	System.out.println("Current: " + stack);
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