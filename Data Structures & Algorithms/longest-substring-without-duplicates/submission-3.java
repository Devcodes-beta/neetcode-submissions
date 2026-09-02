class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set=new HashSet<>();
        int left=0,right=0,maxLength=0;
        while(right<s.length())
        {
            char ch=s.charAt(right);
            //Shrink Window
            while(set.contains(ch))
            {
                set.remove(s.charAt(left));
                left++;
            }
            //Expand window
            set.add(ch);
            maxLength=Math.max(right-left+1,maxLength);
            right++;
        }
        return maxLength;
        
    }
}
