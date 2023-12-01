class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] toReturn = new int[2];
        int result = 0;
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                result = target - (nums[i] + nums[j]);
                if (result == 0 && i!=j){
                    toReturn[0] = i;
                    toReturn[1] = j;
                    return toReturn;
                }        
            }
        }
        return toReturn;
    }         
}