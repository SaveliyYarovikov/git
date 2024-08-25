package algorithms;
another
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int result = binarySearch(arr, 5678);

        System.out.println(result);
    }
    public static int binarySearch(int[] arr, int low, int high, int x){
        if (high >= low) {
            int mid = (high + low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, low, mid - 1, x);

            return binarySearch(arr, mid + 1, high, x);
        }
        return -1;
    }
    public static int binarySearch(int[] arr,  int x){
        int low = 0;
        int high = arr.length - 1;

        while (high >= low){

            int mid = (high + low) / 2;

            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
