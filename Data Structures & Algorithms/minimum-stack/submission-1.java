class MinStack {
    int top;
    ArrayDeque<Integer> dq;
    ArrayDeque<Integer> dq_des;

    public MinStack() {
        top=-1;
        dq=new ArrayDeque<>();
        dq_des=new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(dq.isEmpty())
        {
            dq.addLast(val);
            dq_des.addLast(val);
            top++;
        }
        else
        {
            if(dq_des.peekLast()<val)
            {
                int temp=dq_des.pollLast();
                dq_des.addLast(val);
                dq_des.addLast(temp);
            }
            else
            dq_des.addLast(val);


            dq.addLast(val);
            top++;
        }    
    }
    
    public void pop() 
    {
        dq_des.remove(dq.peekLast());
        dq.pollLast();
        top--;
        
    }
    
    public int top() {
        return dq.peekLast(); 
    }
    
    public int getMin() {
        return dq_des.peekLast();
        
    }
}
