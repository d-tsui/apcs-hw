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

    public Node parentSearch (int x) {
	Node current = root;
	Node parent = current;
	while (current != null && current.getData() != x) {
	    parent = current;
	    if (x < current.getData()) current = current.getLeft();
	    else current = current.getRight();
	}
	//System.out.println(" returned Node " + current.getData());
	return parent;
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
    
    public Boolean isLeaf(Node n){
    	return n.getLeft() == null && n.getRight() == null;
    }
    
    public Boolean hasOneChild (Node n){
    	return (n.getLeft() == null || n.getRight() == null) && !isLeaf(n);
    }
    
    public Node findMaxLeftHalf (Node n){
    	Node max = n.getLeft();
    	while (max.getRight() != null){
    		max = max.getRight();
    	}
    	return max;
    }
    
    public Node delete (int x){
    	Node n = search(x);
    	if (n == root) {
    		if(isLeaf(n)) {
    			root = null;
    			return n;
    		} else {
    			Node max = findMaxLeftHalf(n);
				Node pmax = parentSearch(max.getData());
				pmax.setRight(null);
				max.setLeft(root.getLeft());
				max.setRight(root.getRight());
				root = max;
				return n;	
			}
    	}
    	Node p = parentSearch(x);
		if (isLeaf(n)){
			if (x < p.getData()) p.setLeft(null);
			else p.setRight(null);
			return n;
		} else if (hasOneChild(n)){
			Node temp = n.getLeft();
			if (temp == null) temp = n.getRight();
			if (x < p.getData()) p.setLeft(temp);
			else p.setRight(temp);
			return n;
		} else { //hasTwoChildren // CODE IS FAULTY
			Node max = findMaxLeftHalf(n);
			Node pmax = parentSearch(max.getData());
			pmax.setRight(max.getRight());
			if (x < p.getData()) p.setLeft(max);
			else p.setRight(max);
			return n;			
		}
    }
    
    public String toString(){
	return "" + root;
    }
}