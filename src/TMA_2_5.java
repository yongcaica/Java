/*
(10%) Illustrate the execution of the heap-sort algorithm on the following input sequence: (2, 5, 16, 4, 10, 23, 39, 18, 26, 15).
 */

/*
1. We redefine the heap operations to be a maximum-oriented heap, with each
position key being at least as large as its children. This can be done by recoding the algorithm, or by providing a new comparator that reverses the
outcome of each comparison. At any time during the execution of the algorithm, we use the left portion of S, up to a certain index i − 1, to store
the entries of the heap, and the right portion of S, from index i to n − 1, to
store the elements of the sequence. Thus, the first i elements of S (at indices
0,... ,i − 1) provide the array-list representation of the heap.

2. In the first phase of the algorithm, we start with an empty heap and move the
boundary between the heap and the sequence from left to right, one step at a
time. In step i, for i = 1,...,n, we expand the heap by adding the element at
index i − 1.

3. In the second phase of the algorithm, we start with an empty sequence and
move the boundary between the heap and the sequence from right to left, one
step at a time. At step i, for i = 1,... ,n, we remove a maximal element from
the heap and store it at index n − i.
 */