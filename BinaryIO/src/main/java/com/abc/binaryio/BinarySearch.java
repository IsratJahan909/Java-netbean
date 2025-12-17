
package com.abc.binaryio;


class Contact {
    String name;
    String phoneNumber;

    // Constructor
    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
// Node class to represent each node in the tree
class Node {
    Contact contact;
    Node left, right;

    // Constructor to initialize node with a contact
    Node(Contact contact) {
        this.contact = contact;
        this.left = this.right = null;
    }
}


// BST class containing the nodes and operations (insert, search, delete, etc.)
class BST {
    private Node root; // Root of the tree

    // Constructor to initialize BST
    public BST() {
        root = null;
    }

    // Insert a contact into the BST
    void insert(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        root = insertRec(root, newContact);
    }

    // Helper method to insert recursively
    private Node insertRec(Node root, Contact newContact) {
        // If the tree is empty, create a new node
        if (root == null) {
            root = new Node(newContact);
            return root;
        }

        // Otherwise, recur down the tree
        if (newContact.name.compareTo(root.contact.name) < 0) {
            root.left = insertRec(root.left, newContact);
        } else if (newContact.name.compareTo(root.contact.name) > 0) {
            root.right = insertRec(root.right, newContact);
        }

        return root;
    }

    // Search for a contact by name
    Contact search(String name) {
        return searchRec(root, name);
    }

    // Helper method to search recursively
    private Contact searchRec(Node root, String name) {
        // Base case: root is null or the contact is found
        if (root == null || root.contact.name.equals(name)) {
            return root != null ? root.contact : null;
        }

        // Decide whether to go left or right
        if (name.compareTo(root.contact.name) < 0) {
            return searchRec(root.left, name);
        } else {
            return searchRec(root.right, name);
        }
    }

    // In-order traversal to print contacts in sorted order
    void inorder() {
        inorderRec(root);
    }

    // Helper method for in-order traversal
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println("Name: " + root.contact.name + ", Phone: " + root.contact.phoneNumber);
            inorderRec(root.right);
        }
    }

    // Delete a contact by name
    void delete(String name) {
        root = deleteRec(root, name);
    }

    // Helper method to delete a contact recursively
    private Node deleteRec(Node root, String name) {
        // Base case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Traverse the tree
        if (name.compareTo(root.contact.name) < 0) {
            root.left = deleteRec(root.left, name);
        } else if (name.compareTo(root.contact.name) > 0) {
            root.right = deleteRec(root.right, name);
        } else {
            // Node to be deleted is found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor
            root.contact = minValue(root.right);
            root.right = deleteRec(root.right, root.contact.name);
        }

        return root;
    }

    // Get the minimum value node (used for deletion)
    private Contact minValue(Node root) {
        Contact minValue = root.contact;
        while (root.left != null) {
            minValue = root.left.contact;
            root = root.left;
        }
        return minValue;
    }
}

// Main class to test the Contact Book
public class BinarySearch  {

    public static void main(String[] args) {
        // Create a BST instance
        BST bst = new BST();

        // Insert contacts
        bst.insert("Alice", "123-456-7890");
        bst.insert("Bob", "234-567-8901");
        bst.insert("Charlie", "345-678-9012");
        bst.insert("David", "456-789-0123");
        bst.insert("Eve", "567-890-1234");

        // Display all contacts (In-order traversal gives sorted names)
        System.out.println("Contacts in alphabetical order:");
        bst.inorder();

        // Search for a contact
        String searchName = "Charlie";
        Contact result = bst.search(searchName);
        if (result != null) {
            System.out.println("\nFound contact: " + result.name + " - " + result.phoneNumber);
        } else {
            System.out.println("\nContact not found: " + searchName);
        }

        // Delete a contact
        String deleteName = "Bob";
        System.out.println("\nDeleting contact: " + deleteName);
        bst.delete(deleteName);

        // Display contacts again after deletion
        System.out.println("\nContacts after deletion:");
        bst.inorder();
}
}