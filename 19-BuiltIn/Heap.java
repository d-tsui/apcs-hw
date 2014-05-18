import java.util.*;

public class Heap {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    
    public Heap() {
	minHeap = new PriorityQueue<Integer>(20, Collections.reverseOrder());
	maxHeap = new PriorityQueue<Integer>(20);
    }

    public void add(int x){
	if (minHeap.size() == 0) {
		if(maxHeap.size() == 0){
			minHeap.add(x);
			return;
		}
	}
	if (maxHeap.size() == 0) {
		if(x < minHeap.peek()){
			maxHeap.add(minHeap.poll());
			minHeap.add(x);
			return;
		}
	}
	if (x < maxHeap.peek() && x > minHeap.peek()){
		if (maxHeap.size() - minHeap.size() == 1){
			minHeap.add(x);
		} else {
			maxHeap.add(x);
		}
	} else if (x < minHeap.peek()){
		if (minHeap.size() - maxHeap.size() >= 1){
			maxHeap.add(minHeap.poll());
		}
		minHeap.add(x);
	} else if (x > maxHeap.peek()){
		if (maxHeap.size() - minHeap.size() >= 1){
			minHeap.add(maxHeap.poll());
		}
		maxHeap.add(x);
	}
	
    }

    public double findMedian(){
	if (minHeap.size() == maxHeap.size() && minHeap.size() > 0){
	    return (minHeap.peek() + maxHeap.peek()) / 2.0;
	} else if (minHeap.size() > maxHeap.size()) {
		return minHeap.peek();
	} else if (maxHeap.size() > minHeap.size()) {
		return maxHeap.peek();
	}
	return -1;
    }
    
    public double removeMedian(){
	if (minHeap.size() == maxHeap.size() && minHeap.size() > 0){
	    return (minHeap.poll() + maxHeap.poll()) / 2.0;
	} else if (minHeap.size() > maxHeap.size()) {
		return minHeap.poll();
	} else if (maxHeap.size() > minHeap.size()) {
		return maxHeap.poll();
	}
	return -1;    	
    }
    
    public String toString(){
    	String out = "";
    	out+= "MinHeap: " + minHeap;
    	out+= "\nMaxHeap: " + maxHeap;
    	out+= "\nMinRoot: " + minHeap.peek();
    	out+= "\nMaxRoot: " + maxHeap.peek();
    	return out;
    }
}
