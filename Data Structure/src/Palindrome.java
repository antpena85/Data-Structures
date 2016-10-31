public class Palindrome {
    public static boolean isPalindrome(String word) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        
        String reverse = new StringBuilder(word).reverse().toString();
        
        if (reverse.equalsIgnoreCase(word))
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deveteved"));
    }
}