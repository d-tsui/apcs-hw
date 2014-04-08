import java.util.*;
public class MyLinkedList<E> implements Iterable {
    private Node head;
    private Node tail;

    public Iterator<E> iterator(){
	Iterator<E> it = new MyLLIterator<E>(head);
    }

    public MyLinkedList(){
	head = new Node("0");
	tail = head;
    }

    public void add(String s){
	Node tmp = new Node(s);
	Node current = head;
	while(current.getNext() != null){
		current = current.getNext();
	}
	
	current.setNext(tmp);
	tail = tmp;
    }

    public void add (int i, String s){
	Node tmp = new Node (s);
	Node old = head;
	for (;i > 1; i--){
	    old = old.getNext();
	}
    tmp.setNext(old.getNext());
    if (old.getNext() == null){
    	tail = tmp;
    }
    old.setNext(tmp);
    }

    public String get(int i){
	Node tmp = head;
	for (;i > 0; i--){
	    tmp = tmp.getNext();
	}
        return tmp.toString();
    }
    
    public String set (int i, String s){
	Node tmp = new Node (s);
	Node old = head;
	String out;
	if (i == 0) {
    	out = head.getData();
    	old = head.getNext();
    	head = tmp;
    	head.setNext(old);
    	return out;
    }
	for (;i > 1; i--){
	    old = old.getNext();
	}
	out = old.getData();
    tmp.setNext(old.getNext());
    old.setNext(tmp);
    return out;
    }
    
    public String remove (int i) {
    String out;
    if (i == 0) {
    	out = head.getData();
    	head = head.getNext();
    	return out;
    }
	Node old = head;
	for (;i > 1; i--){
	    old = old.getNext();
	}
	out = old.getData();
    old.setNext(old.getNext().getNext());
    if (old.getNext() == null){
    	tail = old;
    }
    return out;    
	}

	public int find(String s){
		Node c = head;
		int x = 0;
		while (c.getNext() != null){
			if (c.getData().equals(s)) return x;
			c = c.getNext();
			x++;
		}
		return -1;
	}

	public int length() {
				Node c = head;
		int x = 0;
		while (c.getNext() != null){
			c = c.getNext();
			x++;
		}
		return x + 1;
	}
	
    public String toString(){
	String s;
	s = "" + head;
	return s;
    }
}