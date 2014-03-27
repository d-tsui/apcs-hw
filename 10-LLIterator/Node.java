public class Node {
    private String data;
    private Node next;

    public Node (String info){
	data = info;
	next = null;
    }
    
    public void setData(String s){
	data = s;
    }
    public String getData(){
	return data;
    }
    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }
    
    public String toString(){
	//return "Data: " + data + " Next: (" + next + ")";
	return data +", " + next;
    }
}
    