class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,new StringBuilder(),0,0,n);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder path,int open, int close, int n){
        if(path.length() == 2*n){
            result.add(path.toString());;
            return;
        }

        // add (
        if(open < n ){
            path.append('(');
            backtrack(result,path,open+1,close,n);
            path.deleteCharAt(path.length()-1);
        }
        // add )
        if(close < open){
            path.append(')');
            backtrack(result,path,open,close+1,n);
            path.deleteCharAt(path.length()-1);
        }
    }
}