class Solution {
    static final int MOD = 1_000_000_007;

    public int numberOfStableArrays(int zero, int one, int limit) {

        long[][] dp0 = new long[zero + 1][one + 1];
        long[][] dp1 = new long[zero + 1][one + 1];

        for (int z = 1; z <= Math.min(limit, zero); z++) {
            dp0[z][0] = 1;
        }

        for (int o = 1; o <= Math.min(limit, one); o++) {
            dp1[0][o] = 1;
        }

        for (int i = 1; i <= zero; i++) {
            for (int j = 1; j <= one; j++) {

                long sum = 0;
                for (int k = 1; k <= limit && k <= i; k++) {
                    sum = (sum + dp1[i-k][j]) % MOD;
                }
                dp0[i][j] = sum;

                sum = 0;
                for (int k = 1; k <= limit && k <= j; k++) {
                    sum = (sum + dp0[i][j-k]) % MOD;
                }
                dp1[i][j] = sum;
            }
        }

        return (int)((dp0[zero][one] + dp1[zero][one]) % MOD);
    }
}