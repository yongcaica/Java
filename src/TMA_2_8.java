/*
(15%) Use pseudo-code to describe the design algorithms for the following operations for a binary tree T. (5% each)
        preorderNext(T, o): return the node visited after node o in a preorder traversal of T.
        inorderNext(T, o): return the node visited after node o in an inorder traversal of T.
        postorderNext(T, o): return the node visited after node o in a postorder traversal of T.
 */

/*
In the preorder traversal, get the current node, traverse the left subtree, and traverse the right subtree
Algorithm preorderNext(o):
    if o is not existed then
        return nothing     {nothing means null}
    else if o.left() is existed then
        return o.left()
    else if o.right() is existed then
        return o.right()
    else
        while o.parent() is existed then
            p <- o.parent()
            if p.right() is existed and p.right() is not o then
                return o.right()
            else
                o <- p
        return nothing      {nothing means null}

inorderNext(T, o): return the node visited after node o in an inorder traversal of T.
In the inorder traversal, traverse the left subtree, get the current node, and traverse the right subtree.
Algorithm inorderNext(o):
    if o is not existed then
        return nothing    {nothing means null}
    else if o.right() is existed then
        o <- o.right()
        while o.left() is existed do
            o <- o.left()
        return o
    else
        while o.parent() is existed then
            p <- o.parent()
            if p.left() is o then
                return p
            else
                o <- p
        return nothing      {nothing means null}

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
