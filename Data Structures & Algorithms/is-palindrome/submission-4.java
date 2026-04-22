class Solution {
    public boolean isPalindrome(String s) {
        int L = 0;
        String sTrim = s.toLowerCase();
        int R = s.length() - 1;
        while (L < R) {
            if (!Character.isLetterOrDigit(sTrim.charAt(L))) {
                L++;
                continue;
            }
            if (!Character.isLetterOrDigit(sTrim.charAt(R))) {
                R--;
                continue;
            }
            if (sTrim.charAt(L) == sTrim.charAt(R)) {
                L++;
                R--;
            } else {
                return false;
            }
        }
        return true;
    }
}
