/*
(15%) Use pseudo-code to describe the design algorithms for the following operations for a binary tree T. (5% each)
        preorderNext(T, o): return the node visited after node o in a preorder traversal of T.
        inorderNext(T, o): return the node visited after node o in an inorder traversal of T.
        postorderNext(T, o): return the node visited after node o in a postorder traversal of T.
 */

/*
preorderNext(T, o): return the node visited after node o in a preorder traversal of T.
In Pre order, after the root node, the left and then right node is traversed.

preorderNext(T, o):
    if(o.left) {
        return o.left;
    } else {
        return o.right
    }

inorderNext(T, o): return the node visited after node o in an inorder traversal of T.
In In-order, after the root node, the right node is traversed.
inorderNext(T, o):
    return o.right

postorderNext(T, o): return the node visited after node o in a postorder traversal of T.
In Post order, after the root node, the traversal ends.
postorderNext(T, o):
    return null

 */
