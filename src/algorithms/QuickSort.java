package algorithms;
text
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        long start = System.nanoTime();
        int[] sorted = quickSort(arr, 0, arr.length - 1);
        long end = System.nanoTime();
        long result = (end - start) / 1000000000;
        System.out.println("sort ended, timespan = " + result);
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = high + 1;

        for (int j = high; j > low ; j--) {
            if (arr[j] > pivot){
                i--;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i - 1];
        arr[i - 1] = pivot;
        arr[low] = temp;

        return i - 1;
    }
    public static int[] quickSort(int[] arr, int start, int end){
        if (end - start < 1){
            return arr;
        }
        int pivot = partition(arr, start, end);
        quickSort(arr, start, pivot - 1);
        quickSort(arr, pivot + 1, end);
        return arr;
    }

}
