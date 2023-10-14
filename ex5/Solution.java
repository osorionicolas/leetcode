package ex6;

class Solution {
    public String longestPalindrome(String s) {
        int sLength = s.length();
        if(sLength == 1) return s;
        String response = Character.toString(s.charAt(0));
        for(int i = 0; i < sLength - 1; i++) {
            if(sLength - i < response.length()) break;
            String aux = Character.toString(s.charAt(i));
            for(int j = i + 1; j < sLength; j++){
                aux = s.charAt(j) + aux;
                if(j + 1 - i < response.length()) continue;
                String substring = s.substring(i, j + 1);
                if(substring.equals(aux) && aux.length() > response.length()) response = aux;
            }
        }
        return response;
    }
}