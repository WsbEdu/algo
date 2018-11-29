package sortAlgorithms;

import java.util.ArrayList;

public class QuickSort extends Sort{
        @Override
	public ArrayList<Integer> sort(ArrayList<Integer> arrayToSort){
            
		int ile_liczb = arrayToSort.size();
                
		quicksort(arrayToSort,0, ile_liczb-1);
                
                return arrayToSort;
	}
        
        private static void quicksort(ArrayList<Integer> tablica, int a, int b) {

		int i,j,v,temp;

		i=a;
		j=b;
		v=tablica.get((a+b)/2);
		do {
			while (tablica.get(i)<v)
				i++;
			while (v<tablica.get(j))
				j--;
			if (i<=j) {
				temp=tablica.get(i);
                                tablica.set(i,  tablica.get(j));
                                tablica.set(j,  temp);
				i++;
				j--;
			}
		}
		while (i<=j);
		if (a<j)
			quicksort(tablica,a,j);
		if (i<b)
			quicksort(tablica,i,b);
	}
}
