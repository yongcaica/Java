/*
(10%) Use pseudo-code to describe a non-recursive method for performing an inorder traversal of a binary tree in
linear time.
 */

/*
Algorithm inorder(p)
    1) Create an empty stack S
    2) Initialize current node as root
    3) Push the current node to S and set current = current -> left until current is NULL
    4) If current is NULL and stack is not empty then
        Pop the top item from stack
        Print the popped item, set current = popped_item -> right
        Go to step 3
    5) If current is NULL and stack is empty then we are done

 */


/*
Using Stack is the obvious way to traverse tree without recursion. Below is an algorithm for traversing binary tree using stack. See this for step wise step execution of the algorithm.

https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion/

            1
          /   \
        2      3
      /  \
    4     5

Step 1 Creates an empty stack: S = NULL

Step 2 sets current as address of root: current -> 1

Step 3 Pushes the current node and set current = current->left until current is NULL
     current -> 1
     push 1: Stack S -> 1
     current -> 2
     push 2: Stack S -> 2, 1
     current -> 4
     push 4: Stack S -> 4, 2, 1
     current = NULL

Step 4 pops from S
     a) Pop 4: Stack S -> 2, 1
     b) print "4"
     c) current = NULL / (right of 4) and go to step 3
Since current is NULL step 3 doesn't do anything.

Step 4 pops again.
     a) Pop 2: Stack S -> 1
     b) print "2"
     c) current -> 5(right of 2 ) and go to step 3

Step 3 pushes 5 to stack and makes current NULL
Stack S -> 5, 1
current = NULL

Step 4 pops from S
a) Pop 5: Stack S -> 1
b) print "5"
c) current = NULL /(right of 5 )/ and go to step 3
Since current is NULL step 3 doesn't do anything

Step 4 pops again.
a) Pop 1: Stack S -> NULL
b) print "1"
c) current -> 3 /(right of 5 )/

Step 3 pushes 3 to stack and makes current NULL
Stack S -> 3
current = NULL

Step 4 pops from S
a) Pop 3: Stack S -> NULL
b) print "3"
c) current = NULL (right of 3 )

Traversal is done now as stack S is empty and current is NULL.
 */