public class C_1_15 {
    public static void main(String[] args) {
        int[] arr = {100, -2, 33, -34, 8};
        for(int a: maxAndMin(arr))
            System.out.println(a);
    }

    private static int[] maxAndMin(int[] arr){
        int max = 0;
        int min = 0;
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

/*
Algorithm findingMaxAndMin(int[] arr)
for int a in arr
    if max < a
        max = a
    if min > a
        min = a
newArr[0] = max
newArr[1] = min
return newArr
 */