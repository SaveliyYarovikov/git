package algorithms;

import java.time.LocalDateTime;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20);
        }
        LocalDateTime start = LocalDateTime.now();

        System.out.println(start.getSecond());
        System.out.println("waiting");
    }
    public static void bubbleSort (int [] arr){
        boolean notSorted = true;
        int temp = 0;
        int updated = 0;
        while (notSorted){
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]){
                    temp = arr [i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    updated = 1;
                }
            }
            if (updated == 0){
                notSorted = false;
            }else {
                updated = 0;
            }
        }
    }
}
