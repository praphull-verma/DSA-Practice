public class cellingofanumber {
    //Celling of a number means the smallest no >= target
    // smallest no greater than or equal to target
    // [2,5,6,10,13,15]
    //target = 11
    //Celling = 13

    public static int cellingNumber(int[] arr, int target){

        //smallest no >= target

        int start = 0;
        int end = arr.length - 1;
        if(target>arr[arr.length-1]){
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
        return arr[start];

    }
    public static void main(String[] args) {
        int[] array = {2,5,6,10,13,15};
        int target = 11;
        System.out.println(cellingNumber(array,target));
    }

}
