import java.util.*;

public class Driver {
    public static void main(String[]args){
	TreeMap m1 = new TreeMap();
	long start = System.currentTimeMillis();
	m1.put(11, 100);
	m1.put(33, 200);
	m1.put(55, 430);
	for (int x = 0; x < 100000; x++){
	    m1.put(x * 2, x - 1);
	}
	long elapsed = System.currentTimeMillis() - start;
	System.out.println("TreeMap: " + elapsed);

	TreeSet s1 = new TreeSet();
	s1.add(5030);
	s1.add(1020);
	s1.add(30);
	//System.out.println(m1);
	System.out.println(s1);

	long start2 = System.currentTimeMillis();
	HashMap m2 = new HashMap();
	m2.put(3, 4030);
	m2.put(5, 2012);
	m2.put(1, 30);
	for (int x = 0; x < 100000; x++){
	    m2.put(x * 2, x - 1);
	}
	long elapsed2 = System.currentTimeMillis() - start2;
	System.out.println("HashMap: " + elapsed2);
	//System.out.println(m2);
	HashSet s2 = new HashSet();
	s2.add(5030);
	s2.add(1020);
	s2.add(30);
	System.out.println(s2);
	
    }
}