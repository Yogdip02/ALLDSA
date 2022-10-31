import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,56,89,485,659};
        int target  = 659;
        System.out.println(binarySearch(arr, target));
    }

    //Iterative method
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while(start <= end) {
            int mid = start + ((end - start) /2);
            if(arr[mid] == target) {
                return mid;
            }
            else if(target >= arr[mid]) {
                start = mid +1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}




 


