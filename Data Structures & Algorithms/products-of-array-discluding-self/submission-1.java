class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int count=0;
        int prod=1;
        int indexOf0=-1;

        for(int i=0;i<nums.length;i++){
        if(nums[i]==0)
        {
          count++;
          indexOf0=i;
        if(count==2)
        return output;
          continue;
           //if two zero all elements will be zero
        }
       
        //product calculation
        prod=prod*nums[i];
        }
    
    //if one zero
    if(count==1)
    {
        output[indexOf0]=prod;
        return output;
    }
    //if no zeroes present
    for(int i=0;i<nums.length;i++)
     output[i]=prod/nums[i];
     return output;
        
    }
}
 
