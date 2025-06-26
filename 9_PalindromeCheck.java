// Class named Solution
class Solution {

    // Method to check if a given integer is a palindrome
    public boolean isPalindrome(int x) {

        // Negative numbers are not palindrome (e.g., -121 != 121-)
        if (x < 0) {
            return false;
        }

        // Store the original number in a temporary variable
        int n = x;

        // Variable to store the reversed number
        int revNum = 0;

        // Loop to reverse the digits of the number
        while (n > 0) {
            int d = n % 10;         // Get the last digit
            revNum = revNum * 10 + d; // Append it to the reversed number
            n = n / 10;             // Remove the last digit from the number
        }

        // Compare reversed number with the original number
        if (revNum == x) {
            return true;  // It's a palindrome
        } else {
            return false; // Not a palindrome
        }
    }
}
