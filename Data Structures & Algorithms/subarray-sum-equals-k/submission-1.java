class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int curr=0,count=0;
        map.put(0,1);//most imp
        for(var i: nums)
        {
            curr=curr+i;
            count+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        
        return count;
    }
}