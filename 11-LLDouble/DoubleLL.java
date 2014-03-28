public class DoubleLL<E> {
    private class Node<E> {
	E data;
	Node<E> next, prev;
	public Node (E d){
	    this.data = d;
	}
	public String toString() {
	    return "" + data;
	}
	public void setData(E d) { data = d ;}
	public E getData() { return data;}
	public void setNext(Node<E> n) { next = n;}
	public Node<E> getNext() { return next; }
	public void setPrev(Node<E> p){ prev = p;}
	public Node<E> getPrev() { return prev;}
	
    }

    private Node<E> current;
    
    public void insert(E d){
	Node <E> n = new Node <E> (d);
	Node <E> tmp;
	if (current == null) {
	    current = n;
	    current.next = current;
	    current.prev = current;
	} else {
	    n.next = current;
	    if(current.prev != null){
		tmp = current.prev;
		n.setPrev(tmp);
		tmp.setNext(n);
	    } 
	    current.prev = n;
	    current = n;
	}
    }
    public E delete (){
	
    }
    public int find (E d){
	Node<E> tmp = current;
	Node<E> first = current;
	int x = 0;
	while (tmp.getData() != d){
	    
	    tmp = tmp.getNext();
	    if (tmp.getData() == first.getData())
		return -1;
	    x++;
	}
	return x;
    }
    public E getCurrent(){
	return current.getData();
    }
    public void forward(){
	if (current.getNext() != null)
	    current = current.getNext();
    }
    public void back() {
	if (current.getPrev() != null)
	    current = current.getPrev();
    }
    public String toString(){
	Node<E> first = current;
	if (current == null)
	    return "";
	//while (current.getPrev() != first)
	//    current = current.getPrev();
	Node<E> tmp = current.getNext();
	String s = "";
	while (tmp != first) {
	    s = s + tmp.getData() + "";
	    tmp = tmp.getNext();
	}
	s = s + first.getData() + " ";
	current = first;
	return s;
    }

    public static void main (String[]args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);
	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);
	System.out.println(L.getCurrent());
	System.out.println(L.find("three"));
    }
}
	
