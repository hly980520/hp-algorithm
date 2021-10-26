package com.huangpeng.algorithm.entity;

import java.io.Serializable;

/**
 * @Program: algorithm
 * @Description: 二叉树 实体类
 * @author: peng.huang
 * @create: 2021-10-22 15:44:24
 **/
public class TreeNode implements Serializable {

    private static final long serialVersionUID = 6587406083006133979L;

    /**根节点**/
    public int val;
    /**左节点**/
    public TreeNode left;
    /**右节点**/
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
