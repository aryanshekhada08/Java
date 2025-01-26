import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        int n = 122+    1;
        if (checkPalindrome(n) == true)
            System.out.print(n + " is a true");
        else
            System.out.print(n + " is a false");
        }
    
        static boolean checkPalindrome(int n) {
            String s = Integer.toString(n);
            int len = s.length();
            for (int i = 0; i < len / 2; i++) {
            // Comparing i th character from starting and len-i th character from end
                if (s.charAt(i) != s.charAt(len - i - 1))
                    return false;
            }
            // If the above loop doesn't return then it is palindrome
            return true;
        }
}