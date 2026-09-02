class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;

        char[] str = s.toCharArray();

        while (right < str.length) {

            // expand window
            if (!set.contains(str[right])) {

                set.add(str[right]);

                maxLength = Math.max(maxLength, right - left + 1);

                right++;
            }

            // shrink window
            else {

                set.remove(str[left]);

                left++;
            }
        }

        return maxLength;
    }
}