public class Heap {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    
    public Heap() {
	minHeap = new PriorityQueue<Integer>();
	maxHeap = new PriorityQueue<Integer>();
    }

    public void add(int x){
	minRoot = minHeap.peek();
	maxRoot = maxHeap.peek();
	/*
	if(minHeap.size() - maxHeap.size() == 1){
	    maxHeap.add(
	}
	*/
    }

    public int findMedian(){
	if(minHeap.size() > maxHeap.size()){
	    return (int)
	}
    }
}
