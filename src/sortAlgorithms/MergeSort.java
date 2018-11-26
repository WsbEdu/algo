package sortAlgorithms;

import java.util.ArrayList;

public class MergeSort extends Sort {
	public ArrayList<Integer> sort(ArrayList<Integer> arrayToSort){
            
                int n = arrayToSort.size();
    
                if(n<2) return arrayToSort;
                //Jeśli tablica ma 0 lub 1 element to zwróć
                
                ArrayList<Integer> left = new ArrayList<Integer>();
                ArrayList<Integer> right = new ArrayList<Integer>();
                
                //dzielimy tablicę na pół
                int mid = n/2;
                //tworzymy tablicę z lewej strony
                for (int i = 0; i < mid; i++) {
                left.add(arrayToSort.get(i));
                }
                //tworzymy tablicę z prawej strony
                for (int i = mid; i < n; i++) {
                right.add(arrayToSort.get(i));
                }
                
                //rekurencyjnie sortujemy te dwie części tablicy
                left = sort(left);
                right = sort(right);                
                
                //łączymy tablice w całość
                merge(left, right, arrayToSort);
                
		return arrayToSort;
	}
        
        private void merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> arrayToSort) {
            int leftIndex = 0;
            int rightIndex = 0;
            int arrayToSortIndex = 0;
            
            //porównujemy elementy lewej z prawą i wstawiamy do tablicy 'głównej', którą zwrócimy jako wynik
            while (leftIndex < left.size() && rightIndex < right.size()) {
                
                if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                    
                    arrayToSort.set(arrayToSortIndex, left.get(leftIndex));
                    leftIndex++;
                } 
                else {
                    
                    arrayToSort.set(arrayToSortIndex, right.get(rightIndex));
                    rightIndex++;
                }
                
                arrayToSortIndex++;
                
            }

            //W przypadku nierównych tablic (nieparzysta ilość elementów tablicy wejściowej)
            //któraś tablica częściowa się skończy jako pierwsza.
            //wówczas używamy tej drugiej do zakończenia działania algorytmu
            
            ArrayList<Integer> rem;
            int restIndex;
            if (leftIndex >= left.size()) {
                rem = right;
                restIndex = rightIndex;
            } else {
                rem = left;
                restIndex = leftIndex;
            }

            //
            for (int i=restIndex; i<rem.size(); i++) {
                arrayToSort.set(arrayToSortIndex, rem.get(i));
                arrayToSortIndex++;
            }
        }
}
   