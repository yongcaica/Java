public class R_1_4 {
    public static boolean isEven(int i){
        return (i & 1) == 0;
    }
}

//我们知道计算机中的数字通常用二进制补码表示。
//
//如果为正数，补码与原码相同，直接看最后一位（因为数字1的前面N位均为0，跟它做与运算，前面肯定为0），奇数为1，偶数为0，与1相与，结果不变。

//如果为负数，补码转原码：保持符号位不动，其它各位取反+1，即为负数的绝对值原码全部取反+1。还是看最后1位，先取反，再+1，结果还是和原来相同。
// 进行与运算时还是原来的末位，所以用跟1做与运算还是保持原来的结果。