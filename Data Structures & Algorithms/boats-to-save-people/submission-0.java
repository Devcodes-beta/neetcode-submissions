class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0,right=people.length-1;
        int count=0;
    
        while(left<right)
        {
            if(people[right]+people[left]<=limit)
            {
                left++;
                right--;
                count++;
            }
            else
            {
                right--;
                count++;

            }
        }
        if(left==right)
        return count+1;
        else return count;
        
    }
}