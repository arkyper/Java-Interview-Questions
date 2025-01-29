//ARKODE 1 - Palindrome String

public class ARKODE1 {
    public static void main(String[] args) {
        String str = "SRKRS";
        if(isPalin(str))
            System.out.println("String is Palindrome");
        else
            System.out.println("String is not Palindrome");
    }
    static boolean isPalin(String str) {
        int n = str.length();
        int left = 0;
        int right = n-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right))
                return false;
        }
        return true;
    }
}