# Stack Operations Using Linked List

## Overview
This project implements stack operations using a linked list data structure. The application allows users to add elements, remove the top element, view the top element, display all elements, and exit the program.

## Features
- **Add Elements**: Users can add new elements to the stack.
- **Remove Top Element**: Users can remove the most recent element from the stack.
- **View Top Element**: Users can view the most recent element without removing it from the stack.
- **Display All Elements**: Users can display all the elements currently in the stack.
- **Exit**: Users can exit the application.

## Classes

### Main
The `Main` class provides the entry point for the application. It includes a menu-driven interface for users to interact with the stack operations.

#### Main Methods
- `main(String[] args)`: The entry point of the application. It provides a menu for users to interact with the stack operations.

### StackLinkedList
The `StackLinkedList` class implements stack operations using a linked list. It allows adding new elements, removing the top element, viewing the top element, and displaying all elements.

#### StackLinkedList Methods
- `StackLinkedList()`: Constructs a new `StackLinkedList`.
- `void push(String action)`: Adds a new element to the stack.
- `String pop()`: Removes and returns the most recent element from the stack.
- `String peek()`: Views the most recent element in the stack without removing it.
- `void display()`: Displays all elements in the stack.

## Usage
1. **Run the application**: Execute the `Main` class to start the application.
2. **Interact with the menu**: Use the menu options to add, remove, view, and display elements.

## Example
```plaintext
Stack Operations:
1. Add elements 
2. Remove top element 
3. Display the top element
4. Display all elements
5. Exit
Enter your choice: 1
Enter the action to push: Added a new item.
The action 'Added a new item.' was added correctly.

Stack Operations:
1. Add elements 
2. Remove top element 
3. Display the top element
4. Display all elements
5. Exit
Enter your choice: 3
The last action was: Added a new item.