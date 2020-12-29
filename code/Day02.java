class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length;j++){
                if( nums[i] + nums[j] == target){
                    positions[0] = i;
                    positions[1] = j;
                    return positions;
                }
            }
        }
        return positions;
    }
}

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.twoSum(new int[3,3], 6);
    }