class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] result=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(stack.isEmpty())
            stack.push(i);
            else
            {
                while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()])
                {
                    int found=stack.pop();
                    result[found]=i-found;
                }
                stack.push(i);
            }
        }
        return result;
        
    }
}
