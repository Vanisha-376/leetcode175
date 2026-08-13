// Last updated: 8/13/2026, 3:58:56 PM
class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid =nums.length/2;
        int target=nums[mid];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                count++;
            }
        }
        return count==1;
    }
}