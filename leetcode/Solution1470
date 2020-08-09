// leetcode 1470
// https://leetcode-cn.com/problems/shuffle-the-array/

package Aut9;

import java.util.List;
import java.util.Scanner;

class Solution {
    public static int[] shuffle(int[] nums, int n) {
        int[] rtn = new int[1001];
        int pos = 0;
        for(int i = 0, j = n; i < n; i++, j++){
            rtn[pos++] = nums[i];
            rtn[pos++] = nums[j];
        }
        return rtn;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n * 2];
        for(int i = 0; i < n * 2; i++)
            nums[i] = scanner.nextInt();

        int[] rtn = shuffle(nums, n);
        for(int i = 0; i < n * 2; i++)
            System.out.println(rtn[i]);
    }
}
