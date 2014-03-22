public class Driver{
    public static void main (String[]args){
	Node n1;
	n1 = new Node("Tommy");
	System.out.println(n1);
	Node n2 = new Node("Sammy");
	System.out.println(n2);
	n1.setNext(n2);
	System.out.println(n1.getNext());
	n2.setNext( new Node("Clyde"));
	System.out.println(n1.getNext().getNext());
    }
}