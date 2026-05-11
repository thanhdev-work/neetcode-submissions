class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];     // đếm tần suất A-Z
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            int c = s.charAt(right) - 'A';

            // 1. Mở rộng cửa sổ
            count[c]++;
            maxFreq = Math.max(maxFreq, count[c]);

            // 2. Co cửa sổ nếu vi phạm
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // 3. Cập nhật max
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
