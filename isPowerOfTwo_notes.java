


// A number n is a power of two if it has exactly one 1 in its binary form.

// (n > 0) && ((n & (n - 1)) == 0)

// 🧾 Why it works:

// n (like 8 → 1000) has only one bit set.

// n - 1 flips all bits after the only 1.

// So: n & (n - 1) becomes 0 only if n is a power of 2

    // without using loops or recursion.

class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is positive and a power of 2
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// using loops or recursion:


// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if (n < 1) {
//             return false;
//         } else if (n == 1) {
//             return true;
//         } else {
//             while (n % 2 == 0) {
//                 n = n / 2;
//             }

//             return n == 1;
//         }
//     }
// }
