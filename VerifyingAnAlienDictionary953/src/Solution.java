
public class Solution {
	int[] map=new int[26];
    public boolean isAlienSorted(String[] words, String order) {
    for(int i=0;i<order.length();i++)
    {
    	map[order.charAt(i)-'a']=i;
    }
    for(int i=1;i<words.length;i++)
    {
    	if(compare(words[i-1], words[i])>0)
    	{
    		return false;
    	}
    }
    return true;
    }
    public int compare(String word1, String word2)
    {
    	int i=0;
    	int j=0;
    	int val=0;
    	while(i<word1.length() && j<word2.length() && val==0)
    	{
    		val=map[word1.charAt(i)-'a']-map[word2.charAt(j)-'a'];
    		i++;
    		j++;
    	}
    	if(val==0)
    	{
    		return word1.length()-word2.length();
    	}
    	return val;
    }
}
