//NOT YET COMPLETE
import java.util.*;
public class QuickSort{
    public Integer[] quicksort(Integer[] L) {
		if(L.length <= 1) return L;
		
		Random r = new Random();
		int pivot = r.nextInt(L.length);
		//System.out.println("Pivot: " + pivot);
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		ArrayList<Integer> plist = new ArrayList<Integer>();
		
		for (int i = 0; i < L.length; i++){
			if (L[i] < L[pivot]){
			    a.add(L[i]);
			} else if (L[i] > L[pivot]) {
			    b.add(L[i]);
			} else {
				plist.add(L[i]);
			}
		}
		
		Integer[] a1 = a.toArray(new Integer[]{});
		Integer[] b1 = b.toArray(new Integer[]{});
		
		a1 = quicksort(a1);
		b1 = quicksort(b1);
		
		int p = L[pivot];
		
		int x = 0;
		for (Integer j:a1){
			L[x] = j;
			x++;
		}
		for (Integer j:plist){
			L[x] = j;
			x++;
		}
		for (Integer j:b1){
			L[x] = j;
			x++;
		}
		return L;
    	
    }
    
    public static void main(String[] args){
		Integer[] a = {5,6,1,2,8,7,4,9,3,10};
		for(int x = 0; x < 10; x++ ){
			System.out.print(a[x] + ", ");
		}
		System.out.print("\n");
		QuickSort q = new QuickSort();
		
		q.quicksort(a);
		for(int x = 0; x < 10; x++ ){
			System.out.print(a[x] + ", ");
		}
		System.out.print("\n");
    }
}