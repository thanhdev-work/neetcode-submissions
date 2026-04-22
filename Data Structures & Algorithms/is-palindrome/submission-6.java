class Solution {
    public boolean isPalindrome(String s) {
        // Idea:
        // Sử dụng 2 pointer để compare character tử đối xứng ở đầu và cuối chuỗi
        // Condition Operation:
            // Loop with L <= R:
            // if L is not letter L ++  skip 
            // if R is not letter R -- skip
            // if char at L == char at R -> L ++ R ++; else return false

        /*
         L = 0, R = s.length - 1;
         s = s.toLowerCase
         while (L <= R): 
            if (s[L] is not character):
                L ++; 
                skip;
            if (s[R] is not character):
                R --;
                skip;
            if (s[L] == s [R]):
                L ++;
                R --;
            else:
                return false
                
        return true;
        */
        

        int L = 0;
        String sTrim = s.toLowerCase();
        int R = s.length() - 1;
        while (L <= R) {
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
