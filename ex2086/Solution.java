package ex2086;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int response = solution("-H-H-H-H");
        System.out.println(response);
    }
    
    public static int solution (String s){
        Map<Integer, Integer> map = new HashMap<>();
        int response = 0;
        for(int i = 0; i < s.length(); i++){
            Character curr = s.charAt(i);
            
            if(curr == '-') continue;
            if(curr == 'H'){
                Character prev = i == 0 ? null : s.charAt(i-1);
                Character next = i == s.length() - 1 ? null : s.charAt(i+1);
                
                if(prev == '-'){
                    map.put(i-1, map.get(i-1) + 1);
                }
                if(next == '-') {
                    map.put(i+1, map.get(i+1) + 1);
                }
            }
        }
        
        for(int j = 0; j < s.length(); j++){
            Character curr = s.charAt(j);
            
            if(curr == '-') continue;
            if(curr == 'H'){
                Character prev = j == 0 ? null : s.charAt(j-1);
                Character next = j == s.length() - 1 ? null : s.charAt(j+1);
                
                if(prev == '-'){
                    map.get(j-1);
                }
                if(next == '-') {
                    map.get(j+1);
                }
            }
        }
        return response;
    }
}