public class C_1_14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for(int a: reverse(arr))
            System.out.println(a);
    }

    private static int[] reverse(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            newArr[i] = arr[arr.length - i - 1];
        return newArr;
    }
}

/*
Algorithm reverse(int[] arr)
Create newArr with capacity arr.length
for int i=0 to arr.length-1 incr by 1
    newArr[i] = arr[arr.length-i-1]
return newArr

 */
