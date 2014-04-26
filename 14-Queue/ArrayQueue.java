public class ArrayQueue {
    
    private String[] L;
    private int head, tail;

    public ArrayQueue(){
	L = new String[10];
	head = 0;
	tail = 0;
    }
    
    public void enqueue(String s){
	if (tail > L.size){

	}
	L[tail] = s;
	if (head != tail) tail++;
       
    }

    public String toString(){
	String out = "";
	for (String s: L){
	    if (s != null) out += s + " --> ";
	} 
	return out;
    }
}