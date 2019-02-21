/*
(10%) Use pseudo-code to describe an algorithm for computing the number of descendents of each node of a binary tree.
 The algorithm should be based on the Euler tour traversal.
 */

/*
Algorithm eulerTourBinary(T, p, num):
    for each node p in binary tree T do
        define int count_pre = 0
        perform the "pre visit" action for position p
        count_pre++
        define int count_post = 0
        perform the "post visit" action for position p
        count_post++
        num = Math.abs(count_pre - count_post) + 1
        num is the number of descendants of p
 */
