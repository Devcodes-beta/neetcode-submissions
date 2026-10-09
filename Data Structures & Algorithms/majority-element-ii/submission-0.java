class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        //makingh frequency map
         for(int i=0;i<nums.length;i++)
         {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
         }

        //Check for each entry 
        int req=nums.length/3;
        ArrayList<Integer> res=new ArrayList<>();
        for(var entry:map.entrySet()){
            if(entry.getValue()>req)
            res.add(entry.getKey());
        }
        return res;
        
    }
}