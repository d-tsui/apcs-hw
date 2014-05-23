import java.io.*;
import java.util.*;

public class MyQueue {
    private Node head,tail;
    private int len;

    public MyQueue(){
	head = null;
	tail = null;
	len = 0;
    }

    public void enqueue(String s){
	Node n = new Node (s);
	if (len == 0){
	    head = n;
	    tail = n;
	} else {
	    tail.setNext(n);
	    tail = n;
	}	
	len ++;
    }
   
    public String dequeue(){
	String s = head.getData();
	if (head == null){
	    return null;
	}
	head = head.getNext();
	len--;
	if(head == null){
	    tail = null;
	}
	return s;
    }
    
    public boolean isEmpty(){
	return head == null;
    }
    
    public String front(){
	return head.getData();
    }
    
    public int length(){
	return len;
    }

    public String toString(){
	String s = "";
	Node tmp = head;
	while (tmp != null){
	    s = s + tmp.getData() + " --> ";
	    tmp = tmp.getNext();
	}
	return s;
    }
   
}