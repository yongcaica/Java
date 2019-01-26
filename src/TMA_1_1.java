/*
TMA 1 covers Unit 1 of the Study Guide. To write a Java program, you should use the Java Platform, Standard Edition, v1.5.0 package or greater version. Your program must be organized and tested using the BlueJ tool.
Before you submit the assignment, make sure all your Java programs can compile in BlueJ, and can be run without any problem. A main() must be included, and the running results (such as printed output results) should be seen from the console window. You should include test examples (e.g., the necessary inputs for running the program) in your documentation, which can be included in the Javadoc program comments or as separate text documents.
*/

/*
(15%) Write a pseudo-code description for a method of finding the smallest and largest numbers in an array of
integers. Compare your pseudo-code to a Java method that would do the same thing.
1, Define a method, the argument is an array, the return are two numbers;
2, Define an array(arr) of integers as argument;
3, Define an array(newArr) of integers with capacity 2 which will be used to store smallest and largest number;
4, Find the smallest number and largest number;
5, Put these two number in the the newArr;
6, Return newArr and print it;
 */

/*
Algorithm findMinAndMax(arr)
    Input: An integer array arr with capacity 2
    Output: An integer array newArr which hold smallest and largest numbers in array arr
    Define integer variable min = arr[0] as the smallest number in array arr
    Define integer variable max = arr[0] as the largest number in array arr
    for each a in arr do
        if a > max then
            max = a
        if a < min then
            min = a
    newArr[0] = max
    newArr[1] = min
    return newArr
 */

//C-1.15) Hint Note that the Java program has a lot more syntax requirements.

/*
class TMA_1_1 {
    public static void main(String[] args) {
        int[] arr = {100, -2, 33, -34, 8};
        for(int a: maxAndMin(arr))
            System.out.println(a);
    }

    private static int[] maxAndMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int[] newArr = new int[2];
        for(int a: arr){
            if(max < a) {
                max = a;
            }
            if(min > a)
                min = a;
        }
        newArr[0] = max;
        newArr[1] = min;
        return newArr;
    }
}
 */
