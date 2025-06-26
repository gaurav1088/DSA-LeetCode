class Solution {
    public int climbStairs(int n) {

        // Base Case 1: Only 1 step → 1 way to climb
        if(n == 1){
            return 1;
        } 
        // Base Case 2: 2 steps → 2 ways (1+1 or 2)
        else if(n == 2){
            return 2;
        } 
        else {
            // Initialize ways to reach step 1 and 2
            int first = 1;   // ways to reach step 1
            int second = 2;  // ways to reach step 2
            int third = 0;   // placeholder for current step's ways

            // Start from step 3 and calculate up to n
            for(int i = 3; i <= n; i++){
                // Current ways = sum of ways from previous two steps
                third = first + second;

                // Shift the window forward:
                first = second;     // step (i - 2) becomes (i - 1)
                second = third;     // step (i - 1) becomes i
            }

            // Final result stored in 'second' (ways to reach step n)
            return second;
        }
    }
}
