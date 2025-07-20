package ex66;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] response = increment(new int[]{9,9,9});
        System.out.println(Arrays.toString(response));
    }

    static public int[] increment(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        return newArray;
    }
}
