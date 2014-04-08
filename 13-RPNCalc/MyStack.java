public class MyStack {

	private String[] s;
    private int size;

    public MyStack(){
	s = new String[10];
	size = 0;
    }

    public void push(String x){
    if (size >= s.length) {
    	String[] tmp = new String[s.length * 2];
    	for (int a = 0; a < s.length; a++){
    		tmp[a] = s[a];
    	}
    	s = tmp;
    }
	s[size] = x;
	size++;
	
    }
    
    public void push(int i){
    	String s = "" + i;
		push(s);	
    }
    
    public String pop() {
	String out;
	out = s[size-1];
	s[size-1] = "";
	size--;
	return out;
    }

    public String peek() {
	return s[size-1];
    }

    public boolean isEmpty() {
	return size == 0;
    }

    public int getSize() {
	return size;
    }
    
    public String toString(){
	String tmp = "";
	for (String x:s){
		if (x != null) tmp += x + " ";
	}
	return tmp;
    }
}
