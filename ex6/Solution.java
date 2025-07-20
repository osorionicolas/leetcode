package ex6;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        if(s.length() == 1) return s;
        int index = 0;
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < numRows; i++){
            if(index + i >= s.length()) break;
            if(list.size() < numRows) {
                list.add(Character.toString(s.charAt(index + i)));
            }
            else if(numRows - 2 - i > -1){
                list.set(numRows - 2 - i, list.get(numRows - 2 - i) + s.charAt(index + i));
            }
            else {
                list.set(numRows - 1 - i, list.get(numRows - 1 - i) + " ");
            }
            if(i == numRows - 1) {
                index = index + numRows;
                i = -1;
            }
        }
        list.forEach(l -> System.out.println(l));
        System.out.println(String.join("", list));
        return String.join("", list);
    }
}