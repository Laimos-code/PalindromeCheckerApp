public class UseCase4PalindromeChecker {

    public static void main(String[] args) {

        // Declare input string
        String input = "radar";

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two pointers
        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        // Compare characters
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}