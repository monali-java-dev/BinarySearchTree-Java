package com.bst;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();

        // Insert nodes
        bst.root = bst.insert(bst.root, 50);
        bst.root = bst.insert(bst.root, 30);
        bst.root = bst.insert(bst.root, 70);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 40);
        bst.root = bst.insert(bst.root, 60);
        bst.root = bst.insert(bst.root, 80);

        // Traversals
        System.out.print("Inorder: ");
        bst.inorder(bst.root);

        System.out.print("\nPreorder: ");
        bst.preorder(bst.root);

        System.out.print("\nPostorder: ");
        bst.postorder(bst.root);

        // Search
        System.out.println("\nSearch 40: " + bst.search(bst.root, 40));

        // Delete
        bst.root = bst.delete(bst.root, 20);
        System.out.print("After Deletion (Inorder): ");
        bst.inorder(bst.root);
    }
}