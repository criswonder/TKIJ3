package Question4_3;

import CtCILibrary.TreeNode;
/*
原文：

Given a sorted (increasing order) array, write an algorithm to create a binary tree with minimal height.

译文：

给定一个有序数组(递增)，写程序构建一棵具有最小高度的二叉树。
 */
public class Question {	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// We needed this code for other files, so check out the code in the library
		TreeNode root = TreeNode.createMinimalBST(array);
		System.out.println("Root? " + root.data);
		System.out.println("Created BST? " + root.isBST());
		System.out.println("Height: " + root.height());
	}

}
