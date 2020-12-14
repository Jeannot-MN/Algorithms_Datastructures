package arrays;

public class ArrayApplication {

    public static void main(String[] args){
        System.out.println("Hello World!!!");
    }

    static void swap(int k, int j, int[] arr) {

        if(k == j)
            return ;

        int temp = arr[k];
        arr[k] = arr[j];
        arr[j] = temp;
    }
}
