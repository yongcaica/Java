import java.util.Scanner;
public class R_1_1 {
    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    static void inputAllBaseTypes() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a value of integer: ");
        int n = input.nextInt();
        System.out.println(n);

        System.out.print("pls input a double: ");
        double d = input.nextDouble();
        System.out.println(d);

        System.out.print("pls input a boolean: ");
        boolean b = input.nextBoolean();
        System.out.print(b);
    }
}
