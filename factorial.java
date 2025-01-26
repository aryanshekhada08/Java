import java.util.Scanner;

public class factorial {
    public static void main(String [] args ){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("hello world");
        
        int n = Scanner.nextInt();
        System.out.println(n);

        long Fact= 1;
        for (int i = 1; i <=n; i++) {
              Fact*=i;
              System.out.println("fact of "+ i +" is :" + Fact);
        }
    }
}