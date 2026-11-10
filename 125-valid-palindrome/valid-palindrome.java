class Solution {
    public boolean isPalindrome(String s) 
    {
        String st="";
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i)))
            {
                st+=s.charAt(i);
            }
        }
        st=st.toLowerCase();
        int i=0;
        int j=st.length()-1;
        while(i<j)
        {
            if(st.charAt(i)!=st.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}