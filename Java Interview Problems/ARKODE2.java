// ARKODE 2 - Palindrome Number

public class ARKODE2 {
    public static void main(String[] args) {
        int num = 1231;
        if (isPalindrome(num))
            System.out.println(num + " is a palindrome number.");
        else
            System.out.println(num + " is not a palindrome number.");
    }
    static boolean isPalindrome(int num) {
        int orgNum = num;
        int revNum = 0;
        while(num != 0) {
            int digit = num % 10;
            revNum = (revNum * 10) + digit;
            num /= 10;
        }
        return (orgNum == revNum);
    }
}
