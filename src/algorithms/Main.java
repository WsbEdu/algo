package algorithms;

import sortAlgorithms.*;
import java.util.ArrayList;
import java.util.Random;
import sortAlgorithms.BubbleSort;
import sortAlgorithms.QuickSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.Sort;

public class Main {
	public static Sort bubbleSort = new BubbleSort();
	public static Sort quickSort = new QuickSort();
	public static Sort mergeSort = new MergeSort();
	
	public static void main(String[] args) {
		ArrayList<Integer> numbersBubble = new ArrayList<>();
		ArrayList<Integer> numbersQuick = new ArrayList<>();
		ArrayList<Integer> numbersMerge = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i <= 10000; i++) {
                        int d = r.nextInt(1000);
			numbersBubble.add(d);			
			numbersQuick.add(d);			
			numbersMerge.add(d);			
		}
		System.out.println(numbersBubble);
                long czasRozpoczecia = System.currentTimeMillis();
		bubbleSort.sort(numbersBubble);		                
                long czasZakonczenia = System.currentTimeMillis();
                long czasTrwania = czasZakonczenia - czasRozpoczecia;
                System.out.println(numbersBubble);
		System.out.println("Bubble sort: " + czasTrwania + "ms");
                
		System.out.println(numbersQuick);
                czasRozpoczecia = System.currentTimeMillis();
		quickSort.sort(numbersQuick);
		czasZakonczenia = System.currentTimeMillis();
                czasTrwania = czasZakonczenia - czasRozpoczecia;
		System.out.println(numbersQuick);
                System.out.println("Quick sort: " +czasTrwania + "ms");;
                
                System.out.println(numbersMerge);
                czasRozpoczecia = System.currentTimeMillis();
		mergeSort.sort(numbersMerge);
                czasZakonczenia = System.currentTimeMillis();
                czasTrwania = czasZakonczenia - czasRozpoczecia;
                System.out.println(numbersMerge);
                System.out.println("Merge sort: " +czasTrwania + "ms");
	}
}
