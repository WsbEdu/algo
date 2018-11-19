package sortAlgorithms;

import java.util.ArrayList;

public class BubbleSort extends Sort {
	public ArrayList<Integer> sort(ArrayList<Integer> arrayToSort){
		int n = arrayToSort.size();
		int it = 0;
		while (it < n-1) {
			for(int j = 0; j < n-1; j++) {
				if(arrayToSort.get(j) > arrayToSort.get(j+1)) {
					swap(arrayToSort, j, j+1);
				}
			}
			it++;
		}
		return arrayToSort;
	}

	private void swap(ArrayList<Integer> arrayToSort, int j, int i) {
		int temp = arrayToSort.get(j);
		arrayToSort.set(j,  arrayToSort.get(j+1));
		arrayToSort.set(j+1,  temp);		
	}
}
