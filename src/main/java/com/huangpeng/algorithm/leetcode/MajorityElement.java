package com.huangpeng.algorithm.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Program: algorithm
 * @Description: 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素
 * @author: peng.huang
 * @create: 2021-10-22 15:05:57
 **/
public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,3,3,3,3,3,3,3,2,2,2,2,2,4,4,4,4,4};
        List<Integer> result = majorityElement(nums);
        System.out.println("result: " + JSON.toJSONString(result));
    }

    private static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>(8);
        int size = nums.length / 3;
        Arrays.stream(nums).forEach(data -> map.merge(data, 1, Integer::sum));
        return map.entrySet().stream().filter(data -> data.getValue() > size).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
