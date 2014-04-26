public class Driver{
    public static void main(String[]args){
	MyQueue q = new MyQueue();
	q.enqueue("one");
	q.enqueue("two");
	q.enqueue("three");
	System.out.println(q);
	q.dequeue();
	System.out.println(q);
	System.out.println(q.front());
	q.dequeue();
	System.out.println(q.length());
	q.dequeue();
    }
}