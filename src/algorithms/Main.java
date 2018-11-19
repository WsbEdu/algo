package algorithms;

import sortAlgorithms.*;
import java.util.ArrayList;
import java.util.Random;
import algorithms.*;
import sortAlgorithms.BubbleSort;
import sortAlgorithms.InsertionSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.Sort;

public class Main {
	public static Sort bubbleSort = new BubbleSort();
	public static Sort insertSort = new InsertionSort();
	public static Sort mergeSort = new MergeSort();
	
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		Random r = new Random();
		for(int i = 0; i <= 100; i++) {
			numbers.add(r.nextInt(1000));			
		}
		System.out.println(numbers);
		bubbleSort.sort(numbers);		
		System.out.println(numbers);
//		insertSort.sort(numbers);
//		mergeSort.sort(numbers);
	}
}
