class Solution {
    public boolean isAnagram(String s, String t) {
        //used fixed array
        if (s.length() != t.length()) return false;
        int[] fixedArray = new int[26];
        for (int i = 0; i < s.length(); i++){
            fixedArray[s.charAt(i) - 'a']++;
            fixedArray[t.charAt(i) - 'a']--;
        }
        
        for(int x = 0; x < 26; x++){
            if(fixedArray[x] != 0){
                return false;
            }
        }
        return true;
    }
}
