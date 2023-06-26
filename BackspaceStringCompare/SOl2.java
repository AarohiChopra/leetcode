// this uses 2 pointer approach
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int index1 = s.length() - 1;
        int index2 = t.length() - 1;
        while(index1 >=0 || index2 >= 0)
        {
            int i1 = getValidI(s, index1);
            int i2 = getValidI(t, index2);
            if(i1 < 0 && i2 < 0)
            {
                return true;
            }
            if(i1 < 0 || i2 < 0)
            {
                return false;
            }
            if(s.charAt(i1) != t.charAt(i2))
            {
                return false;
            }
            index1 = i1 - 1;
            index2 = i2 - 1;
        }
        return true;
    }
    public static int getValidI(String s, int index)
    {
        int backspace = 0;
        while(index >= 0)
        {
            if(s.charAt(index) == '#')
            {
                backspace++;
            }
            else if(backspace > 0)
            {
                backspace--;
            }
            else 
            {
                break;
            }
            index--;
        }
        return index;
    }
}
