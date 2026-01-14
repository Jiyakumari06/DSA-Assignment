📘 Data Structures & Algorithms – Assignment README
📌 Introduction
This document provides a clear, formal, and well-structured description of all required Data Structures and Algorithms tasks. It explains the purpose, working principles, operations performed, edge cases handled, and time complexity analysis for each question. 

🔹 Question 1: Doubly Linked List (DLL)
🔸 Definition

A Doubly Linked List (DLL) is a linear data structure in which each node contains three parts:

Data

A reference to the previous node

A reference to the next node

This structure allows traversal of the list in both forward and backward directions.

🔸 Operations Performed

Insertion at the Beginning
Elements 10 and 20 are inserted at the start of the list. Each new node becomes the new head, and pointer links are updated accordingly.

Insertion at the End
Elements 30, 40, 5, and 50 are inserted at the end of the list. Each node is added after the current tail.

Traversal

Forward Traversal: Nodes are visited from head to tail using next pointers.

Backward Traversal: Nodes are visited from tail to head using previous pointers.

Deletion Operations

Deletion of the first node (head)

Deletion of the last node (tail)

Deletion of a node by value (20)

Deletion of the node appearing before a given value (30)

Deletion of the node appearing after a given value (20)

Finding Minimum and Maximum Values
The list is traversed completely to determine the smallest and largest values stored in the nodes.

⚠ Edge Cases Considered

Empty list condition

List containing only one node

Deleting head or tail node

Requested value not present in the list

⏱ Time Complexity Analysis
Operation	Time Complexity
Insertion at beginning/end	O(1)
Deletion at beginning/end	O(1)
Deletion by value/before/after	O(n)
Finding minimum/maximum	O(n)
🔹 Question 2: Queue Implementation
🔸 Queue Definition

A Queue is a linear data structure that follows the FIFO (First In, First Out) principle. Elements are inserted at the rear and removed from the front.

🔹 Part A: Queue Using Array (Dynamic Resizing)
🔸 Description

In an array-based queue, elements are stored sequentially. The queue has a fixed initial size, but when the array becomes full, dynamic resizing is performed by creating a larger array and copying existing elements.

Initial array size: 3

Inserted elements: 10, 20, 30, 40

🔸 Dynamic Resizing Explanation

When the array reaches its capacity, the size is doubled to accommodate additional elements. This ensures uninterrupted enqueue operations.

🔸 Supported Operations

Enqueue (insert element)

Dequeue (remove element)

Peek (view front element)

Display queue contents

Find minimum and maximum values

🔹 Part B: Queue Using Linked List
🔸 Description

A linked list–based queue uses dynamically allocated nodes. It does not have a fixed size limitation and avoids overflow issues present in array-based queues.

🔸 Supported Operations

Enqueue at rear

Dequeue from front

Peek front element

Find minimum and maximum values

📊 Comparison: Array Queue vs Linked List Queue
Aspect	Array Queue	Linked List Queue
Insertion Time	O(1) (Amortized)	O(1)
Deletion Time	O(1)	O(1)
Memory Allocation	Fixed / Resizable	Dynamic
Overflow Risk	Possible	Not possible
🔹 Question 3: Searching Algorithms
🔸 Given Sorted Array

{3, 8, 12, 20, 25, 30}

🔸 Searching Techniques Applied

Iterative Binary Search to find 20

Recursive Binary Search to find 25

Recursive Linear Search to find 12

Recursive approach to find minimum and maximum values

❓ Why Binary Search Requires Sorted Data?

Binary search works by repeatedly dividing the search space into halves. This approach is only valid when the data is sorted, allowing correct elimination of half the elements in each step.

⏱ Complexity Analysis
Algorithm	Time Complexity	Space Complexity
Binary Search	O(log n)	O(1)
Recursive Binary Search	O(log n)	O(log n)
Recursive Linear Search	O(n)	O(n)
🔹 Question 4: Recursion Problems
🔸 Problems Solved Using Recursion

Factorial of 5

Fibonacci number at position 6

Sum of elements in array {2, 4, 6, 8}

Check whether array {3, 5, 7, 9} is sorted

Find minimum and maximum elements of an array

🔸 Recursion Explanation

Base Case: The condition that stops further recursive calls.

Recursive Case: The part where the function calls itself with a smaller input.

🔹 Question 5: Sorting Algorithms
🔸 Given Array

{5, 1, 4, 2, 8}

🔸 Sorting Techniques Discussed

Merge Sort

Quick Sort

📊 Comparison: Merge Sort vs Quick Sort
Aspect	Merge Sort	Quick Sort
Best Time Complexity	O(n log n)	O(n log n)
Worst Time Complexity	O(n log n)	O(n²)
Space Complexity	O(n)	O(log n)
Stability	Stable	Not Stable
🔹 Question 6: Binary Search Tree (BST)
🔸 Definition

A Binary Search Tree (BST) is a hierarchical data structure where:

Left subtree contains smaller values

Right subtree contains larger values

🔸 Inserted Elements

50, 30, 70, 20, 40, 60, 80

🔸 Traversals

Inorder Traversal: Left → Root → Right (Produces sorted order)

Preorder Traversal: Root → Left → Right

Postorder Traversal: Left → Right → Root

🔸 Operations Performed

Search for element 60

Delete node 80

Find minimum and maximum values

Count total number of nodes

Count number of leaf nodes

Determine height of the tree

🌲 Tree Properties Explanation

Minimum Value: Found at the leftmost node

Maximum Value: Found at the rightmost node

Tree Height: Length of the longest path from root to a leaf
