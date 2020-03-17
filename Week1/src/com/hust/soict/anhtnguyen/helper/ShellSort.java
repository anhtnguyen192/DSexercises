package com.hust.soict.anhtnguyen.helper;

public class ShellSort implements NumberSorter {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length; 
        for (int gap = n/2; gap > 0; gap /= 2) 
        { 
            for (int i = gap; i < n; i += 1) 
            { 
                int temp = arr[i]; 
                int j; 
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) 
                    arr[j] = arr[j - gap]; 
                arr[j] = temp; 
            } 
        } 
	}

}
