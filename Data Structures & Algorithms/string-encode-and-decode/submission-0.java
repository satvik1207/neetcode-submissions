class Solution 
{
    public String encode(List<String> strs) 
    {
        int totalLen = 0;
        for (int i = 0; i < strs.size(); i++) 
        totalLen += String.valueOf(strs.get(i).length()).length() + 1 + strs.get(i).length();
        char[] result = new char[totalLen];
        int idx = 0;

        for (int i = 0; i < strs.size(); i++) 
        {
            String s = strs.get(i);
            String lenStr = String.valueOf(s.length());
            
            for (int j = 0; j < lenStr.length(); j++) 
            {
                result[idx++] = lenStr.charAt(j);
            }
            result[idx++] = '#';
            for (int j = 0; j < s.length(); j++) 
            {
                result[idx++] = s.charAt(j);
            }
        }
        
        return new String(result);
    }

    public List<String> decode(String s) 
    {
         List<String> res = new ArrayList<>();
        int i = 0;
        
        while (i < s.length()) 
        {
            int j = i;
            while (s.charAt(j) != '#') 
            {
                j++;
            }
            int len = Integer.parseInt(s.substring(i, j));
            int start = j + 1;
            res.add(s.substring(start, start + len));
            i = start + len;
        }
        return res;
    }
}
