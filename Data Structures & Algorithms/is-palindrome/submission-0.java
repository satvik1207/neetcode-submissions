class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String clean = "";
        String rev = "";

        for(int i = 0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            clean += s.charAt(i);
        }

        for(int i = clean.length()-1;i>=0;i--)
        {
            rev += clean.charAt(i);
        }
        if(clean.equalsIgnoreCase(rev))
        return true;
        return false;
    }
}
