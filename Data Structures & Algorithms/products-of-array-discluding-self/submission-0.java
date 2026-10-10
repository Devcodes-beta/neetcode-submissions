class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] preleft=new int[n];
        int[] preright=new int[n];
        preleft[0]=nums[0];
        preright[n-1]=nums[n-1];
        for(int i=1;i<n;i++)
        {
            preleft[i]=nums[i]*preleft[i-1];
            preright[n-i-1]=nums[n-i-1]*preright[n-i];
        }
        for(int i=0;i<n;i++){
            if(i==0)
            nums[i]=1*preright[i+1];
            else if(i==n-1)
            nums[i]=preleft[i-1]*1;
            else
            nums[i]=preleft[i-1]*preright[i+1];

        }
        return nums;
        
    }
}  
