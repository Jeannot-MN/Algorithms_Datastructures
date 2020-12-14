package arrays;

import static arrays.ArrayApplication.swap;

/*
    The selection sort algorithm sorts an array by repeatedly finding the largest element (considering ascending order)
    from unsorted part and putting it at the end of the unsorted array partition.
     The algorithm maintains two subarrays in a given array.

    upi: unsorted partition index
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int upi = array.length - 1; upi > 0; upi--) {
            int largest_index = 0;
            for (int i = 0; i <= upi; i++) {
                if (array[i] > array[largest_index]){
                    largest_index = i;
                }
            }
            swap(largest_index, upi, array);
        }

        // Print the sorted array
        for (int i : array) {
            System.out.println(i);
        }
    }
}
