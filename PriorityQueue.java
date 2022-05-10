import java.util.ArrayList;

import org.w3c.dom.Element;

// This is a starting point, but feel free to alter the
// underlying implementation if you wish.
public class PriorityQueue<T> {
	
	public ArrayList<Element<T>> elements; 
	
	public PriorityQueue() {
		elements = new ArrayList<Element<T>>();
	}
	
	public void add(T value, int key) {
		elements.add(new Element<T>(value, key));
	}
	
	//See midterm MIS
	public T getMin() {
		int pos; 	
		int minKey = elements.get(0).getKey();
		T minVal = elements.get(0).getValue();

		for (int i = 1; i < elements.size(); i++) {
			if (elements.get(i).getKey() < minKey) {
				minVal = elements.get(i).getValue();
				minKey = elements.get(i).getKey();
				pos = i;
			}
			
		}
		
		elements.remove(pos);

		return minVal;
	}
	
	//See midterm MIS
	public T mystery(int z) {

		T val;

		for (int i = 0; i < elements.size(); i++) {

			if (f(elements.get(i).getKey()) == z) {

				val = elements.get(i).getValue();
				elements.remove(i);
			}
			
		}
		return val;
	}

	public int f(int n) {
		int total = 0;

		for (int i = 0; i < elements.size(); i++) {

			if (elements.get(i).getKey() < n) {
				total++;
			}
			
		}
		return total;
	}
	
}
