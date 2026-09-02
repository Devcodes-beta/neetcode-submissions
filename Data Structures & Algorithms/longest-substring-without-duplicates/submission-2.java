class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;
        char[] str = s.toCharArray();
        while (right < str.length) 
        {
            //shrink window
            while(set.contains(str[right]))
            {
                set.remove(str[left]);
                left++;
            }
            //Expand Window
            set.add(str[right]);
            maxLength=Math.max(right-left+1,maxLength);
            right++;

        }
        return maxLength;
    }
}