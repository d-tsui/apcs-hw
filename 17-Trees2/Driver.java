public class Driver {
	public static void main (String[]args){
		BST tree = new BST();
		tree.insert(5);
		tree.insert(1);
		tree.insert(3);
		tree.insert(7);
		tree.insert(6);
		tree.insert(2);
		tree.insert(4);
		tree.insert(9);
		tree.insert(8);
		System.out.println(tree);
		System.out.println(tree.search2(8).getData());
	}
}