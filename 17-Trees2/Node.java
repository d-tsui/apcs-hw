public class Node {
    private int data;
    private Node left, right;

    public Node (int x){
	data = x;
	left = null;
	right = null;
    }
    
    public void setData(int x){
	data = x;
    }
    public int getData(){
	return data;
    }
    public void setLeft(Node n){
	left = n;
    }
    public void setRight(Node n){
	right = n;
    }
    public Node getLeft(){
	return left;
    }
    public Node getRight(){
	return right;
    }
    public String toString(){
	return "(" + data +" L " + left + " R " + right + ")";
    }
}
    