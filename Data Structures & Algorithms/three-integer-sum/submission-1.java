class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // To eliminate duplicate
        // a + b + c = 0
        // for this case [-3, -3, 1, 2, 3, 4] -> dont want duplicate of [-3, 1, 2]
        // for this case [-2, -2, -2, 0, 0, 2, 2, 2] -> [-2, 0, 2]
        Arrays.sort(nums);
        int checkPointOfA = nums[0];
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            // check duplicate in same position
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            while (L < R) {
                // need some more bigger
                if (nums[i] + nums[L] + nums[R] < 0) {
                    L++;
                // need some more smaller
                } else if (nums[i] + nums[L] + nums[R] > 0) {
                    R--;
                } else {
                    output.add(List.of(nums[i], nums[L], nums[R]));
                    //Update L pointer
                    L++;
                    //Check duplicate for L
                    while(nums[L] == nums[L - 1] && L < R){
                        L++;
                    }
                }
            }
            checkPointOfA = nums[i];
        }
        return output;
    }
}
