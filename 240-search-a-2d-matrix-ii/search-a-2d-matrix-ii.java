class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols-1;
        while(row<rows && col>=0){
            int value = matrix[row][col];
            if(value == target){
                return true;
            } else if(value < target){
                row = row + 1;
            } else {
                col = col -1;
            }
        } 
        return false;
    }
}