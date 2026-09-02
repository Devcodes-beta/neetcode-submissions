class Solution {
    public void sortColors(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            map.put(nums[i],1);
            else 
            map.put(nums[i],map.get(nums[i])+1);
        }
        int i=0;
        while(i<nums.length)
        {
            while(map.get(0)>0)
            {
                nums[i]=0;
                map.put(0,map.get(0)-1);
                i++;
            }
            while(map.get(1)>0)
            {
                nums[i]=1;
                map.put(1,map.get(1)-1);
                i++;
            }
            while(map.get(2)>0)
            {
                nums[i]=2;
                map.put(2,map.get(2)-1);
                i++;
            }

        }

        
    }
}