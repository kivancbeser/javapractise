/*Reverse String
https://leetcode.com/problems/reverse-words-in-a-string
Complexity
Time complexity:O(2*N) // N is String Length
Space complexity:O(1)*/
class Solution {
    void reverse(StringBuilder str,int i,int j)
    {
        while(i<j)
        {
            char temp=str.charAt(i);
            str.setCharAt(i,str.charAt(j));
            str.setCharAt(j,temp);
            i++;
            j--;
        }
    }
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder str=new StringBuilder(s);
        int j=str.length()-1;
        int i=j;
        boolean space=false;
        while(i>=-1)
        {
            if(i==-1 || str.charAt(i)==' ')
            {
                
                if(!space)
                {
                    reverse(str,i+1,j);
                    space=true;
                }
                else
                {
                    str.delete(i,i+1);
                }
               
            }else
            {
                if(space)
                {
                    j=i;
                    space=false;
                }
            }
            i--;
        }
        return str.reverse().toString();
    }
}

/* 2.Solution reverseWords
class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        String ans="";
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int j=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(ans.isEmpty()){
                ans=ans.concat(s.substring(i+1,j+1));
            }else{
                ans=ans.concat(" "+s.substring(i+1,j+1));
            }
        }
        return ans;
    }
}
*/
