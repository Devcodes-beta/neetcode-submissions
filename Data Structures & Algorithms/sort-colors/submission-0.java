class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = nums.length - 1;
        while (b <= c) 
        {
            if (nums[b] == 0) {
                int temp = nums[a];
                nums[a] = nums[b];
                nums[b] = temp;
                a++;
                b++;
            } 
            else if (nums[b] == 1) {
                b++;
            } 
            else {
                int temp = nums[b];
                nums[b] = nums[c];
                nums[c] = temp;

                c--;
            }
        }
    }
}