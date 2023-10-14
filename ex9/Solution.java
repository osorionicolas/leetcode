package ex9;

class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder s = new StringBuilder();
        s.append(x);
        String old = s.toString();
        s.reverse();
        return s.toString().equals(old);
    }
}