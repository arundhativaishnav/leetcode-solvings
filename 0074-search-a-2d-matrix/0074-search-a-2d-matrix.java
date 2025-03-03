class Solution {
    public boolean bs(int[][] matrix, int target,int row ,int col){
        int l = 0,r=col;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) r=mid-1;
            else l=mid+1; 
        }
        return false;
    }
    public int bs(int[][] matrix, int target){
        int l = 0,r=matrix.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(matrix[mid][0]<=target&&matrix[mid][matrix[0].length-1]>=target) return mid;
            else if(matrix[mid][0]>target) r=mid-1;
            else l=mid+1; 
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0 ,col = matrix[0].length-1;
        if(target < matrix[row][row] || target > matrix[matrix.length - 1][col]) return false;
        if(target == matrix[row][row] || target == matrix[matrix.length - 1][col]) return true;
        row = bs(matrix,target);
        if(row==-1) return false;
        return bs(matrix,target,row,col);
    }
}
