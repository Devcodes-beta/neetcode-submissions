class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded=new StringBuilder();
        String result="";
        if(strs.size()==0)
        return "";
        for(String s:strs)
        {
            encoded=encoded.append(s.length()).append("#").append(s);
        }
        result=encoded.toString();
        return result;

    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        if(str.length()==0)
        return new ArrayList<>();
        StringBuilder decode=new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            while(str.charAt(i)!='#'){
            decode=decode.append(str.charAt(i));
            i++;
            }
            //Extracting length
            int length=Integer.parseInt(decode.toString());
            i++;
            //Empty decode
            decode.setLength(0);
            //Moving forward
            list.add(str.substring(i,i+length));
            i=i+length-1;

        }
        return list;

    }
}
