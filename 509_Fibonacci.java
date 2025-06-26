class Solution {
    public int fib(int n) {
        // Base case: if n is 0, return 0
        if(n == 0) return 0;

        // Base case: if n is 1, return 1
        if(n == 1) return 1;

        // FirstTerm = F(0), SecondTerm = F(1)
        int FirstTerm = 0;
        int SecondTerm = 1;

        // We will loop from 1 to n and keep calculating next Fibonacci number
        for(int i = 1; i <= n; i++) {
            // ThirdTerm = current Fibonacci number = sum of previous two terms
            int ThirdTerm = FirstTerm + SecondTerm;

            // Update FirstTerm to SecondTerm (move one step forward)
            FirstTerm = SecondTerm;

            // Update SecondTerm to ThirdTerm (move one step forward)
            SecondTerm = ThirdTerm;
        }

        // After loop ends, FirstTerm holds the nth Fibonacci number
        return FirstTerm;
    }
}

// Notes 

// The loop starts from i = 1 and goes up to n.

// FirstTerm holds the (n-1)th Fibonacci number.

// SecondTerm holds the nth Fibonacci number.

// After the last iteration, FirstTerm becomes the nth Fibonacci number (because it gets assigned SecondTerm before loop ends).

