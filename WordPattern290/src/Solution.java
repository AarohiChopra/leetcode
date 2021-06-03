
import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character, String> charMap=new HashMap<Character, String>();
    HashMap<String,Character> wordMap=new HashMap<String,Character>();  
    String[] words=s.split(" ");
    if (words.length != pattern.length())
    {return false;}

    for(int i=0;i<words.length;i++)
    {
        String word=words[i];
        char c=pattern.charAt(i);
        if(!(charMap.containsKey(c)))
        {
           if(wordMap.containsKey(words)) 
           {
               return false;
           }
           else
           {
               charMap.put(c, word);
               wordMap.put(word,c);
           }
        }
        else
        {
            if(! (charMap.get(c).equals(word)))
            {
                return false;
            }
        }
    }
        return true;
    }
}