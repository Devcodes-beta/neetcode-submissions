class TimeMap {
    
    HashMap<String,List<Entry>> map;

    class Entry
    {
        String value;
        int timestamp;
        public Entry(String value,int timestamp)
        {
            this.value=value;
            this.timestamp=timestamp;
        }
    }

    public TimeMap() {
        map=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
    map.putIfAbsent(key, new ArrayList<>());
    map.get(key).add(new Entry(value, timestamp));
}
    
    public String get(String key, int timestamp) {
        List<Entry> entries=map.get(key);
        if(entries==null)
        return "";
        int size=entries.size();
            int low=0;
            int high=size-1;
            Entry timestamp_prev=null;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(entries.get(mid).timestamp<=timestamp)
                {
                    timestamp_prev=entries.get(mid);
                    low=mid+1;
                }
                else high=mid-1;

            }
            return timestamp_prev==null?"":timestamp_prev.value;

        } 
    }

