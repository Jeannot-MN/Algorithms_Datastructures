package arrays;

import static arrays.ArrayApplication.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int upi = array.length - 1; upi > 0; upi--) {
            int largest_index = 0;
            for (int i = 0; i <= upi; i++) {
                if (array[i] > array[largest_index])
                    largest_index = i;
            }
            swap(largest_index, upi, array);
        }

        // Print the sorted array
        for (int i : array) {
            System.out.println(i);
        }
    }
}
