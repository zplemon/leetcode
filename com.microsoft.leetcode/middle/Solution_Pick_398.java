package com.microsoft.leetcode.middle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description TODO
 * @Author Zhangpeng8
 * @Team: ofa-st
 * @Create 2023/7/17 17:07
 */
public class Solution_Pick_398 {
    private int[] nums;
    public Solution_Pick_398(int[] nums) {
        this.nums = nums;
    }

    public int pick(int target) {
        List<Integer> random = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                random.add(i);
            }
        }

        return random.get(new Random().nextInt(random.size()));
    }

    /**
     * https://leetcode.cn/problems/random-pick-index/solutions/21822/xu-shui-chi-chou-yang-wen-ti-by-an-xin-9/
     * @param target
     * @return
     */
    public int pick2(int target) {
        Random r = new Random();
        int n = 0;
        int index = 0;
        for(int i = 0;i < nums.length;i++)
            if(nums[i] == target){
                //我们的目标对象中选取。
                n++;
                //我们以1/n的概率留下该数据
                if(r.nextInt() % n == 0) index = i;
            }
        return index;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 3, 3};
        Solution_Pick_398 solution_pick_398 = new Solution_Pick_398(nums);
        System.out.println(solution_pick_398.pick(3));

        System.out.println(solution_pick_398.pick2(3));
    }
}
