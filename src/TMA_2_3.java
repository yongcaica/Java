/*
(10%) Use pseudo-code to describe an algorithm for computing the number of descendents of each node of a binary tree.
 The algorithm should be based on the Euler tour traversal.
 */

/*
Algorithm eulerTourBinary(T, p):
    for each node p in binary tree T do
        define int count_pre = 0
        perform the "pre visit" action for position p
        count_pre++
        define int count_post = 0
        perform the "post visit" action for position p
        count_post++
        num = Math.abs(count_pre - count_post) + 1
        num is the number of descendants of position p
 */


/*
Use pseudo-code to describe an algorithm for computing the number of descendants of each node of a binary tree.

Ans: call this function with v as root node count_Descendents_Euler(T,root)

count_Descendents_Euler(T,v)

//T is a Binary tree

// v is vertex of Binary tree

//cnt is local variable for each node of T

// T.cnt act as global variable

Initialize T.cnt to zero

when saw one more node, namely node v then increment T.cnt by one.

set T.cnt to cnt .

if T.hasLeft (v) then
call count_Descendents_Euler(T,T.left) //explore nodes to the left of v

if T.hasRight (v) then
call count_Descendents_Euler(T,T.right) //explore nodes to the right of v
set number of descendants as v.desN = T.cnt - cnt

end function


 */