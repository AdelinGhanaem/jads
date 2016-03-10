package com.hackerrank;

import com.adts.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by adelin.ghanayem@gmail.com
 */
public class LevelTreeTraversal {


    public static void main(String[] args) {
        TreeNode treeNode =
                new TreeNode(new TreeNode(new TreeNode(null, null, 1),
                        new TreeNode(null, null, 4), 5)
                        , new TreeNode(new TreeNode(null, null, 6), null, 2),
                        3);


        levelOrder(treeNode);

    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        if (root == null)
            return al;

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next = new LinkedList<TreeNode>();
        current.add(root);

        while (!current.isEmpty()) {
            TreeNode node = current.remove();

            if (node.left != null)
                next.add(node.left);
            if (node.right != null)
                next.add(node.right);

            nodeValues.add(node.val);
            if (current.isEmpty()) {
                current = next;
                next = new LinkedList<TreeNode>();
                al.add(nodeValues);
                nodeValues = new ArrayList();
            }

        }

        for (List<Integer> integers : al) {
            for (int i : integers) {
                System.out.print(i + " ");
            }

        }
        return al;
    }


    void printTree(Node node) {

    }
}
