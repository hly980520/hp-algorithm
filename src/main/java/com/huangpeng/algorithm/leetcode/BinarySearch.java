package com.huangpeng.algorithm.leetcode;

/**
 * @Program: algorithm
 * @Description: 二分查找
 * @author: peng.huang
 * @create: 2021-10-22 16:31:04
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = binarySearch(nums, target);
        System.out.println("result: " + result);
    }

    private static int binarySearch(int[] nums,int target) {
        int beginIndex = 0;
        int endIndex = nums.length - 1;

       while (beginIndex <= endIndex) {
           int middleIndex = endIndex + (beginIndex - endIndex) / 2;
           int search = nums[middleIndex];

           if (search > target) {
               endIndex = middleIndex - 1;
               continue;
           }

           if (search < target) {
               beginIndex = middleIndex + 1;
               continue;
           }

           return middleIndex;
       }
        return -1;
    }

}
