class Fancy {
    private static final int MOD = 1000000007;
    List<Long> arr = new ArrayList<>();
    long mul = 1;
    long add = 0;

    public Fancy() {
    
    }
    
    public void append(int val) {
        long normalized = (val - add + MOD) % MOD;
        normalized = normalized * modInverse(mul)%MOD;
        arr.add(normalized);
    }
    
    public void addAll(int inc) {
        add = (add+inc)%MOD;
    }
    
    public void multAll(int m) {
        mul = (mul*m)%MOD;
        add = (add*m)%MOD;
    }
    
    public int getIndex(int idx) {
        if(idx>=arr.size()) return -1;

        long val = arr.get(idx);
        val = (val * mul +add)%MOD;
        return (int) val;
    }

    private long modInverse(long x){
        return pow(x,MOD-2);
    }

    private long pow(long a,long b){
        long res = 1;
        while(b>0){
            if((b&1)==1){
                res = (res *a)%MOD;
            }
            a = (a*a)%MOD;
            b >>=1;
        }
        return res;
    }
}

/**
 * Your Fancy object will be instantiated and called as such:
 * Fancy obj = new Fancy();
 * obj.append(val);
 * obj.addAll(inc);
 * obj.multAll(m);
 * int param_4 = obj.getIndex(idx);
 */