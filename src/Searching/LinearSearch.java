package Searching;

public class LinearSearch {
    //METHOD TO FIND THE MINIMUM NUMBER IN AN ARRAY-
   /* static int FindMinimumInArray(int[] arr){
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < MIN){
                MIN = arr[i];

            }
        }
        return MIN;
    }
*/
    public static void main(String[] args) {
        int[] nums = {4,53,151,515};
        System.out.println(findNumbers(nums));
    }
        public static int findNumbers(int[] nums) {
            int count = 0;
            int even = 0;
            for(int i = 0; i<nums.length;i++){
                while(nums[i]>=0){
                    nums[i] = nums[i] / 10;
                    count++;
                }
                if(count%2==0){
                    even++;
                }
            }
            return even;
        }
    }



