public class UseCase3PalindromeChecker {

    public static void main(String[] args) {

        String input = "level";
        String reversed = "";

        // reverse string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // compare strings
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome");
        } else {
            System.out.println(input + " is not a palindrome");
        }
    }
}