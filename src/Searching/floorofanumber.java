package Searching;

public class floorofanumber {

    //floor means
    // Greatest number <= target

    public static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[0]){
            return -1;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return arr[mid];
            }
        }
        return arr[end];

    }
    public static void main(String[] args) {
        int[] array = {4,5,8,10};
        int target = 1;
        System.out.println(floor(array,target));
    }

}
