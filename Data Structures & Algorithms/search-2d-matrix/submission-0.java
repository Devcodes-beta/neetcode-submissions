class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        int row=-1;
        //check in which row target can exist using BS
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[mid][0]<=target)
            {
                row=mid;
                low=mid+1;
            }
            else
            high=mid-1;
        }
        if(row<0)
        return false;
        //checking for all cols in that row
        low=0;
        high=matrix[0].length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(matrix[row][mid]==target)
            return true;
            else if(matrix[row][mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;   
    }
}
