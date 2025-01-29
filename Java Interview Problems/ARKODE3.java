// ARKODE 3 - Reverse a string

public class ARKODE3 {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + reversed);
    }
    static String reverseString(String str) {
        String revStr = "";
        for (char ch  : str.toCharArray()) {
            revStr = ch + revStr;
        }
        return revStr;        
    }
}
