package ex3;

import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty() || s.length() == 1) return s.length();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int longest = 0;
        String[] str = s.split("");
        for(int i = 0; i < s.length(); ++i){
            Integer position = map.get(str[i]);
            int size = map.size();
            if(position != null){
                if(size > longest) longest = size;
                map.clear();
                i = position;
                continue;
            }
            map.put(str[i], i);
            int newSize = size + 1;
            if(newSize > longest) longest = newSize;
        }
        return longest;
    }
}