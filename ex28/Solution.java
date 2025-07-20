package ex28;

class Solution {
    public int strStr(String haystack, String needle) {
        int response = -1;
        int needleIndex = 0;
        int needleMaxIndex = needle.length();
        for(int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(needleIndex)) {
                needleIndex++;
                for(int j = i + 1; j < haystack.length(); j++) {
                    if (haystack.charAt(j) == needle.charAt(needleIndex)) {
                        needleIndex++;
                        if(needleIndex == needleMaxIndex) {
                            response = i - needleMaxIndex + 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if(response != -1) break;
            } else {
                needleIndex = 0;
            }
        }
        return response;
    }
}