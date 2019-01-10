import java.util.Scanner;
public class R_1_3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("please input m: ");
//        long m = sc.nextLong();
//
//        System.out.print("please input n: ");
//        long n = sc.nextLong();

        boolean flag = isMultiple();
        System.out.println(flag);
    }
    static boolean isMultiple(){
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("please input m: ");
        long m = sc.nextLong();

        System.out.print("please input n: ");
        long n = sc.nextLong();
        if(n%m == 0){
            flag = true;
        }
        return flag;
    }
}
