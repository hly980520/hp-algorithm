package com.huangpeng.algorithm.leetcode;

import com.alibaba.fastjson.JSON;
import com.huangpeng.algorithm.entity.TreeNode;

/**
 * @Program: algorithm
 * @Description: 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL
 * @author: peng.huang
 * @create: 2021-10-22 15:35:05
 **/
public class SearchBST {

    public static void main(String[] args) {
        int k = 2;
        TreeNode root = new TreeNode(4,new TreeNode(7),new TreeNode(2,new TreeNode(3),new TreeNode(1)));
        System.out.println("root: " + JSON.toJSONString(root));
        root = searchBST(root, k);
        System.out.println("result: " + JSON.toJSONString(root));
    }

    private static TreeNode searchBST(TreeNode root,int k) {
        if (root == null || root.val == k) {
            return root;
        }
        return root.val > k ? searchBST(root.right,k) : searchBST(root.left,k);
    }
}
