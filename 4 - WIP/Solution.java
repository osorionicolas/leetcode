package ex4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        Double dividend = Double.valueOf(2);
        if(nums1.length == 0 && nums2.length == 0) return Double.valueOf(0);
        if(nums1.length == 1 && nums2.length == 1) return (nums1[0] + nums2[0]) / dividend;
        if((nums1.length + nums2.length) % 2 == 0) {
            if(nums1[nums1.length - 1] <= nums2[0]) return (nums1[nums1.length - 1] + nums2[0]) / dividend;
        }
        int[] shortest, longest;
        if (nums1.length > nums2.length) {
            longest = nums1;
            shortest = nums2;
        } else {
            longest = nums2;
            shortest = nums1;
        }
        int[] aux = new int[nums1.length + nums2.length];
        int minor;
        for(int i = 0; i < shortest; i++){
            int num1 = shortest[i];
            int longestHalf = longest[longest.length / 2];
            if(num1 < longestHalf){
                aux[i] = num2;
                aux[i+1] = num1;
            } else {
                aux[i] = num1;
                aux[i+1] = num2; 
            }
        }
        for(int number : aux){
            System.out.println(number);
        }
        int auxLength = aux.length;
        int half = auxLength / 2;
        return auxLength % 2 == 0 ? (aux[half] + aux[half + 1]) / dividend : aux[half + 1] / dividend;
    }
}