import java.util.Stack;

class Solution {
    public int minAddToMakeValid(String S) {
     Stack<Character> s=new Stack<Character>();
    for(int i=0;i<S.length();i++)
    {
        char c=S.charAt(i);
      if(c=='(')
      {
        s.push('('); 
      }
      else
      {
          if(!(s.isEmpty()) && s.peek()=='(')
          {
              s.pop();
          }
          else
          {
              s.push(c);
          }
      }
    }
        return s.size();
    }
}