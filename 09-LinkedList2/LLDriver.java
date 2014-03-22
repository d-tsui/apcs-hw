public class LLDriver {
    public static void main (String[]args){
	MyLinkedList L = new MyLinkedList();
	
	L.add("A");
	L.add("B");
	L.add("C");
	L.add("D");
	L.add(2,"E");

	System.out.println(L);
	System.out.println(L.get(0));
	System.out.println(L.get(1));
	System.out.println(L.get(2));
	
	L.set(0, "F");
	System.out.println(L);
	L.remove(0);
	System.out.println(L);
	System.out.println(L.find("Z"));
	System.out.println(L.length());
    }
}