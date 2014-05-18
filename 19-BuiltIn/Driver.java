import java.util.*;

public class Driver {
    public static void main(String[]args){
  	final int TEST_SIZE = 10000;
    
	TreeMap m1 = new TreeMap();
	long start = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m1.put(x * 2, x - 1);
	}
	long elapsed = System.currentTimeMillis() - start;
	System.out.print("TreeMap (Add): " + elapsed);

	start = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m1.get(x * 2);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.print(" (Get): " + elapsed);
	
	start = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m1.remove(x * 2);
	}
	elapsed = System.currentTimeMillis() - start;
	System.out.println(" (Remove): " + elapsed);


	TreeSet s1 = new TreeSet();
	s1.add(5030);
	s1.add(1020);
	s1.add(30);
	//System.out.println(m1);
	System.out.println("TreeSet: " + s1);

	
	HashMap m2 = new HashMap(TEST_SIZE * 2); // start hashmap
	long start2 = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m2.put(x * 2, x - 1);
	}
	long elapsed2 = System.currentTimeMillis() - start2;
	System.out.print("HashMap (Add): " + elapsed2);
	
	start2 = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m2.get(x * 2);
	}
	elapsed2 = System.currentTimeMillis() - start2;
	System.out.print(" (Get): " + elapsed2);
	
	start2 = System.currentTimeMillis();
	for (int x = 0; x < TEST_SIZE; x++){
	    m2.remove(x * 2);
	}
	elapsed2 = System.currentTimeMillis() - start2;
	System.out.println(" (Remove): " + elapsed2);
	//END HASHMAP TIME
	
	//System.out.println(m2);
	HashSet s2 = new HashSet();
	s2.add(5030);
	s2.add(1020);
	s2.add(30);
	System.out.println("HashSet: " + s2);
	
	Heap h = new Heap();
	h.add(50);
	h.add(40);
	h.add(60);
	h.add(70);
	h.add(55);
	h.add(35);
	System.out.println("Median: " + h.findMedian());
	System.out.println(h);
    }
}