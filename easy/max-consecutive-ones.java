class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int highest1count = 0;
        int current1count = 0;
        
        for(int num : nums){
            if(num == 1){
                current1count++;
            }
            else {
                current1count = 0;
            }
            if(current1count > highest1count){
                highest1count = current1count;
            }
        }
        return highest1count;
    }
}