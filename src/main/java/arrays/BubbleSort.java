package arrays;

import static arrays.ArrayApplication.swap;

/*
    Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent
    elements if they are in wrong order. The algorithm maintains two subarrays in a given array.

    upi: unsorted partition index
*/
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int upi = array.length - 1; upi > 0; upi--) {
            for (int i = 0; i < upi; i++) {
                if (array[i] > array[i + 1]){
                    swap(i, i + 1, array);
                }
            }
        }

        // Print the sorted array
        for (int i : array) {
            System.out.println(i);
        }

        //Stable sorting algorithm similar element are kept in their respective order
    }

}
