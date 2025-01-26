import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
