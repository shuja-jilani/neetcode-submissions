class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = rows * cols; //totalelements
        int l = 0;
        int r = n-1; 
        while(l<=r){
            int mid = l + (r-l)/2; 
            int row = mid / cols; //basic idea h , divide isliye kr rhe h qki agar second row h to km se km ek row me jitne cols h wo paar ho chuke h to divide kiye to answer 1 hi ata yani second row.
            int col = mid % cols; // same kinda logic yaha bhi lagega ki agar wo total cols ka multiple h to index 0 ayga for column, but agar kuch bhi remainder bacha to wohi remainder uska column index banega. 
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                l = mid + 1;
            }
            else{
                r = mid - 1; 
            }
        }
        return false;
    }
}
