class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> hashSet = new HashSet<>();
        
        //put all number to hashset
        for(int i: nums){
            hashSet.add(i);
        }
        
        int maxLength = 0;
        for(int num: hashSet){
            //Is not begin of the  longest consecutive sequence
            if(hashSet.contains(num - 1)) continue;

            int currentNums = num;
            int currentLength = 1;
            //Look up in hashSet to find sequence of this Element
            while(hashSet.contains(currentNums + 1)){
                currentLength++;
                currentNums++;
            }
            
            maxLength = Math.max(currentLength, maxLength);
        }
        return maxLength;
    }
}
