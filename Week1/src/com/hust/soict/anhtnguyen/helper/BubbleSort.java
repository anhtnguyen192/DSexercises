package com.hust.soict.anhtnguyen.helper;

public class BubbleSort implements NumberSorter {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int arrLength = arr.length;
        int temp;
        boolean is_sorted;

        for (int i = 0; i < arrLength; i++) {

            is_sorted = true;

            for (int j = 1; j < (arrLength - i); j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    is_sorted = false;
                }

            }

            // is sorted? then break it, avoid useless loop.
            if (is_sorted) break;

            
        }
	}

}
