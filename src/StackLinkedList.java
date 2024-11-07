/**
 * The StackLinkedList class implements stack operations using a linked list.
 */
public class StackLinkedList {
    /**
     * The Node class represents each element in the stack.
     */
    class Node {
        String data; // Data stored in the node (e.g., an action or text)
        Node next;   // Reference to the next node

        /**
         * Constructs a new Node with the specified data.
         *
         * @param data the data to be stored in the node
         */
        public Node(String data) {
            this.data = data; // Initialize the data
            this.next = null; // Initialize the next node as null
        }
    }

    private Node top; // Top reference to the top element of the stack

    /**
     * Constructs a new StackLinkedList.
     */
    public StackLinkedList() {
        this.top = null; // Initialize the stack as empty
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param action the action to be added to the stack
     */
    public void push(String action) {
        Node newNode = new Node(action); // Create a new Node object with the action
        newNode.next = top; // Set the next of the new node to the current top of the stack
        top = newNode; // Update the top to the new node
        System.out.printf("The action '%s' was added correctly.%n", action); // Print a confirmation message
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public String pop() {
        if (top == null) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return null; // Return null as the stack is empty
        }
        String action = top.data; // Store the data of the top node
        top = top.next; // Update the top pointer to the next node
        System.out.printf("The action '%s' was deleted successfully.%n", action); // Print a confirmation message
        return action; // Return the removed action
    }

    /**
     * Displays the top element of the stack without removing it.
     *
     * @return the top element of the stack, or null if the stack is empty
     */
    public String peek() {
        if (top == null) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return null; // Return null as the stack is empty
        }
        String action = top.data; // Retrieve the data of the top node
        System.out.printf("The last action was: %s%n", action); // Print the top action without removing it
        return action; // Return the top action without modifying the stack
    }

    /**
     * Displays all elements in the stack.
     */
    public void display() {
        if (top == null) {
            System.out.println("Empty stack"); // Message if the stack is empty
            return;
        }
        Node current = top; // Start from the top of the stack
        while (current != null) {
            System.out.println(current.data); // Print the data of the current node
            current = current.next; // Move to the next node
        }
    }
}