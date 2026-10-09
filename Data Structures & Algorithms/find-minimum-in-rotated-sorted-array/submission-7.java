class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums[low]<=nums[high])
        return nums[0];//already sorted
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int next=nums[(mid+1)%nums.length];
            int prev=nums[(mid+nums.length-1)%nums.length];
            if(nums[mid]<=prev && nums[mid]<=next)
            return nums[mid];
            else if(nums[mid]>=nums[0])//left side is sorted
            {
                low=mid+1;
            }
            else 
            high=mid-1;
        }
     return -1;   
    }
}
