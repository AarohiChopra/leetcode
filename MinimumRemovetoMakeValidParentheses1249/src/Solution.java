import java.util.*;
class Solution {
	public String minRemoveToMakeValid(String s) {
	int left=0;
	StringBuilder sb=new StringBuilder();
	for(char c: s.toCharArray())
	{
	 if(c=='(')
	 {
		 left++;
	 }
	 else if(c==')')
	 {
		 if(left!=0)
		 {
			 left--;
		 }
		 else if(left==0)
		 {
			continue; 
		 }
	 }
	 sb.append(c);
	}
	StringBuilder res=new StringBuilder();
	for(int i=sb.length()-1;i>=0;i--)
	{
		if(sb.charAt(i)=='(' && left>0)
		{
			left --;
			continue;
		}
		res.append(sb.charAt(i));
	}
	return res.reverse().toString();
	}
}