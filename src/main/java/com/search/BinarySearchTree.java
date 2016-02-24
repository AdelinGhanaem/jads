package com.search;

/**
 * Created by adelin.ghanayem@cayetanogaming.com on 2/23/16.
 */
public class BinarySearchTree<K extends Comparable<K>, V> implements CustomMap<K, V> {


    private Node<K, V> root;


    @Override
    public void put(K k, V v) {

        if (root == null) {
            root = new Node<>(k, v, null, null);
        } else {
            append(root, new Node<K, V>(k, v, null, null));

        }
    }


    private <K extends Comparable<K>, V> void append(Node<K, V> root, Node<K, V> node) {

        if (root.getKey().compareTo(node.getKey()) > 0) {
            if (root.getLeftNode() != null) {
                append(root.getLeftNode(), node);
            } else {
                root.setLeftNode(node);
            }
        } else if (root.getKey().compareTo(node.getKey()) < 0) {
            if (root.getRightNode() != null) {
                append(root.getRightNode(), node);
            } else {
                root.setRightNode(node);
            }
        } else {
            root.replace(node);
        }

    }

    ;

    @Override
    public V get(K k) {
        return get(k, root);
    }


    private V get(K k, Node<K, V> kvNode) {


        if (k.equals(kvNode.getKey())) {
            return kvNode.getValue();
        } else {
            Node<K, V> left = kvNode.getLeftNode();
            Node<K, V> right = kvNode.getRightNode();
            while (right != null && !right.getKey().equals(k)) {
                right = right.getRightNode();
            }
            if (right == null) {
                while (left != null && !left.getKey().equals(k)) {
                    left = left.getLeftNode();
                }
                if (left != null) {
                    return left.getValue();
                } else {
                    return null;
                }
            }    else{
                return right.getValue();
            }


        }
    }


    private static class Node<K extends Comparable<K>, V> {

        private K key;
        private V value;
        private Node<K, V> leftNode;
        private Node<K, V> rightNode;

        public Node(K key, V value, Node<K, V> leftNode, Node<K, V> rightNode) {
            this.key = key;
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }


        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public Node<K, V> getLeftNode() {
            return leftNode;
        }

        public Node<K, V> getRightNode() {
            return rightNode;
        }

        public void setLeftNode(Node<K, V> leftNode) {
            this.leftNode = leftNode;
        }

        public void setRightNode(Node<K, V> rightNode) {
            this.rightNode = rightNode;
        }

        public void replace(Node<K, V> node) {
            this.value = node.getValue();
        }
    }
}
