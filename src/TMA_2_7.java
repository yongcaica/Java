/*
(10%) What is the worst-case time for putting n entries in an initially empty hash table, with collisions resolved by chaining? What is the best-case?
 */

/*
If the sequences are not sorted, then the worst case time is O(n) where if all the entries end up on the same chain and you have to step through each entry to get to the end of the line
If the sequences are stored in sorted order, then the worst case time is O(n2).
Best case would be O(1), same as a normal hash
 */
