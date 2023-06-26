class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < s.length())
        {
            if(s.charAt(index1) == '#')
            {
                if(! s1.isEmpty())s1.pop();
            }
            else 
            {
                s1.push(s.charAt(index1));
            }
            index1++;
        }
        while(index2 < t.length())
        {
            if(t.charAt(index2) == '#')
            {
                if(! s2.isEmpty())s2.pop();
            }
            else 
            {
                s2.push(t.charAt(index2));
            }
            index2++;
        }
        return s1.toString().equals(s2.toString());
    }
}
