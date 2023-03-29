class Solution {
    public String minWindow(String str, String pattern) {
        //if(str.length() < pattern.length()) throw new Exception("Invalid");
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : pattern.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int windowStart = 0;
        int minStart = -1;
        int matched = 0;
        int minLen = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++)
        {
            char right = str.charAt(windowEnd);
            //System.out.println("Right: "+right);
            if(map.containsKey(right))
            {
                map.put(right, map.get(right) - 1);
                if(map.get(right) == 0) matched++;
            }
            while(matched == map.size())
            {
                if(minLen >  windowEnd - windowStart + 1)
                {
                    //System.out.println("**********");
                    minLen = windowEnd - windowStart + 1;
                    //System.out.println("MinLen:"+minLen);
                    minStart = windowStart;
                    //System.out.println(minLen);
                }
                char left = str.charAt(windowStart++);
                //System.out.println("\tLeft: "+left);
                if(map.containsKey(left))
                {
                    if(map.get(left) == 0) matched--;
                    map.put(left, map.get(left) + 1);
                }
            }
            }
            //System.out.println("windowStart: "+windowStart);
            //System.out.println("minLen: "+minLen);
            return minLen == Integer.MAX_VALUE ? "" : str.substring(minStart, minStart+minLen);
        }
    }
