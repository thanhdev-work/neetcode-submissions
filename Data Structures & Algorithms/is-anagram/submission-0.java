class Solution {
    public boolean isAnagram(String s, String t) {
        //Use fixed array
        int[] fixedArray = new int[26];
        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            fixedArray[s.charAt(i) - 'a'] += 1;
        }
        
        for(char c: t.toCharArray()){
            fixedArray[c - 'a'] -= 1;
            if (fixedArray[c - 'a'] < 0) return false;
        }
        return true;
    }
}
