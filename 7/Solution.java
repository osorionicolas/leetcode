package ex7;

class Solution {
    public int reverse(int x) {
        StringBuilder s = new StringBuilder();
        s.append(Math.abs(x));
        s.reverse();
        try {
            int result = Integer.parseInt(s.toString());
            return x < 0 ? -result : result;
        }
        catch (Exception e){
            return 0;
        }
    }
}