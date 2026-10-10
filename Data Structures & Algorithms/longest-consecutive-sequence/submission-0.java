class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0;i<nums.length;i++)
        set.add(nums[i]);
        int maxSeq=0;
        for(var entry: set)
        {
            if(!set.contains(entry-1))
            {
                int seq=1;
                while(set.contains(entry+1))
                {
                    seq++;
                    entry++;
                }
                maxSeq=Math.max(seq,maxSeq);
            }
        }   
        return maxSeq;    
    }
}
