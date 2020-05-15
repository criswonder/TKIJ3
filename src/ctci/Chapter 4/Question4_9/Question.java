package Question4_9;
import CtCILibrary.TreeNode;

/**
 * 原文：

 You are given a binary tree in which each node contains a value. Design an algorithm to print all paths which
 sum up to that value. Note that it can be any path in the tree - it does not have to start at the root.

 译文：

 给定一棵二叉树，每个结点包含一个值。打印出所有满足以下条件的路径： 路径上结点的值加起来等于给定的一个值。注意：这些路径不必从根结点开始。
 */
public class Question {
	
	public static void findSum(TreeNode node, int sum, int[] path, int level) {
		if (node == null) {
			return;
		}
		
		/* Insert current node into path */
		path[level] = node.data; 
		
		int t = 0;
		for (int i = level; i >= 0; i--){
			t += path[i];
			if (t == sum) {
				print(path, i, level);
			}
		}
		
		findSum(node.left, sum, path, level + 1);
		findSum(node.right, sum, path, level + 1);
		
		/* Remove current node from path. Not strictly necessary, since we would
		 * ignore this value, but it's good practice.
		 */
		path[level] = Integer.MIN_VALUE; 
	}
	
	public static int depth(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}
	
	public static void findSum(TreeNode node, int sum) {
		int depth = depth(node);
		int[] path = new int[depth];
		findSum(node, sum, path, 0);
	}

	private static void print(int[] path, int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(8);
		root.right.left = new TreeNode(2);
		root.right.right = new TreeNode(6);
		findSum(root, 8);
	}
}

