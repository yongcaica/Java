import java.util.Scanner;

public class C_1_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a: ");
        int a = sc.nextInt();
        System.out.println("please input b: ");
        int b = sc.nextInt();
        System.out.println("please input c: ");
        int c = sc.nextInt();

        if(a+b == c)
            System.out.println("a adds b is equal to c");
        else
            System.out.println("a adds b is NOT equal to c");
    }
}
