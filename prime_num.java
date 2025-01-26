import java.util.Scanner;

public class prime_num {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("hello day!");
        int n = Scanner.nextInt();
       boolean isprime = true;
       for (int i = 2; i <Math.sqrt(n) ; i++) {
         if(n %  i == 0 ){
            isprime = false;
            break;
         }
       }
       if(isprime)
       System.out.println(n + " is prime number " );
       else 
       System.out.println(n +" is not a prime nubmer  ");
   }
}