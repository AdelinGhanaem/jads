package com.hackerrank;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/29/16.
 */
public class LowestCommonAncestor {


    /**
     * 4
     * /    \
     * 2      7
     * / \    /
     * 1   3  6
     *
     * @param args
     */

    public static void main(String[] args) {


        System.out.println(lca(Node.tree(), 1, 3));


    }


    static Node lca(Node root, int v1, int v2) {
        if (root == null)
            return null;

        if (root.data == v1 || root.data == v2)
            return root;


        Node leftLca = lca(root.left, v1, v2);
        Node rightLca = lca(root.right, v1, v2);

        if (leftLca != null && rightLca != null)
            return root;


        return (leftLca != null) ? leftLca : rightLca;


    }
}

