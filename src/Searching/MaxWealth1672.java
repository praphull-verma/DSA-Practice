package Searching;

//https://leetcode.com/problems/richest-customer-wealth

public class MaxWealth1672 {

    public static int maximumWealth(int[][] accounts) {

        int[] row_sum = new int[accounts.length];
        int max = 0;
        for (int person = 0; person < accounts.length; person++) {
            for (int account = 0; account < accounts[person].length; account++) {

                row_sum[person] += accounts[person][account];

            }
            if(max<row_sum[person]){
                max = row_sum[person];
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int[][] accounts;
        accounts = new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts));
    }
}
