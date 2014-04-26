public class BST {
    private Node root;

    public BST() {
        root = null;
    }

	public BST (int x){
		root = new Node(x);
	}
	
	public void insert (int x) {
		if (root == null) {
			root = new Node(x);
			return;
		}
		
		Node temp = search(x);
		if (x < temp.getData()) temp.setLeft(new Node(x));
		else if (x > temp.getData()) temp.setRight(new Node(x));
	}
	
	public Node search (int x) {
		Node current = root;
		Boolean done = false;
		//System.out.print("Search for " + x);
		while (!done){
			if (x == current.getData()) done = true;
			else if (x < current.getData()) {
				if (current.getLeft() != null) current = current.getLeft();
				else done = true;
			} else if (x > current.getData()) {
				if (current.getRight() != null) current = current.getRight();
				else done = true;
			}
		}
		//System.out.println(" returned Node " + current.getData());
		return current;
	}

	public Node search2(int x){
		return search2(root, x);
	}

	public Node search2(Node c, int x){
		System.out.print(c.getData() + " -> ");
		if (x < c.getData()) {
			if (c.getLeft() != null) return search2(c.getLeft(), x);
			else return c;
		} else if (x > c.getData()) {
			if (c.getRight() != null) return search2(c.getRight(), x);
			else return c;
		}
		return c;
	}

	public String toString(){
		return "" + root;
	}
}