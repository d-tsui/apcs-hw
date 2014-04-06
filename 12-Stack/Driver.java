public class Driver {

    public static void main(String[] args){
	MyStack stack = new MyStack();
	stack.push("one");
	stack.push("two");
	stack.push("three");
	System.out.println(stack);
	while (!stack.isEmpty()){
	    System.out.println(stack.pop());
	}

	stack.push("hello");
	stack.push("world");
	System.out.println(stack.peek());
	for (int x = 0; x < 15;x++){
		stack.push("A");
	}
	System.out.println(stack);
    }

}
