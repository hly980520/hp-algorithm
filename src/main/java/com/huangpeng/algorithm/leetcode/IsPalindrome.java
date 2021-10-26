package com.huangpeng.algorithm.leetcode;

/**
 * @Program: algorithm
 * @Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写
 * @author: peng.huang
 * @create: 2021-10-22 17:34:42
 **/
public class IsPalindrome {

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("result: " + isPalindrome(input));
    }

    private static Boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        StringBuilder reverse = new StringBuilder(sb).reverse();
        return reverse.toString().equals(sb.toString());
    }

    private static Boolean isPalindromeByDoublePointer(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return Boolean.FALSE;
            }
            left++;
            right--;
        }
        return Boolean.TRUE;
    }
}
