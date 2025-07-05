class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n + 1];
        lengths[0] = 1; // Initial length is 1 ("a")

        // Step 1: Precompute lengths after each operation
        for (int i = 0; i < n; i++) {
            lengths[i + 1] = lengths[i] * 2;
            // Clamp to max length to avoid overflow
            if (lengths[i + 1] > k) {
                lengths[i + 1] = k + 1;
            }
        }

        // Step 2: Reverse simulation
        int shift = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k <= lengths[i]) {
                // In the first half; no change
                continue;
            } else {
                // In the second half
                k -= lengths[i];
                if (operations[i] == 1) {
                    shift++;
                }
            }
        }

        // Step 3: Apply shift to base character 'a'
        char result = (char) ('a' + shift % 26);
        return result;
    }
}