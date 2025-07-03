package general;

public class EvenOrNot {

    public boolean even(int num) {
        int count = 0;


        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int COUNT = 0;

        for(int i = 0; i<nums.length; i++){

            if(even(nums[i])){
                COUNT++;
            }
        }
        return COUNT;

    }
}