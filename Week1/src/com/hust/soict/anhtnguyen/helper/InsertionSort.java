package com.hust.soict.anhtnguyen.helper;

public class InsertionSort implements NumberSorter {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		  int n = arr.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	            while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
	            } 
	            arr[j + 1] = key; 
	        } 
	}

}
