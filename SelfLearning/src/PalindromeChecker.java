public class PalindromeChecker {


    static boolean isPalindrome(String original)
    {
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }

    static void main(String[] args) {
        String str="dad";
        System.out.println(isPalindrome(str));
    }
}
