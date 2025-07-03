package Searching;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;

    }



    public static void main(String[] args) {
        int[] array = {4,5,8,10};
        int target = 10;
        System.out.println(binarySearch(array,target));
    }
}
