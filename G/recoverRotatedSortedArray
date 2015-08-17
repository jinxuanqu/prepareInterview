public class Solution {
    /**
     * @param nums: The rotated sorted array
     * @return: void
     */
    public void recoverRotatedSortedArray(ArrayList<Integer> nums) {
        // write your code
        int k = 0;
        int len = nums.size();
        for(int i = 1; i < len; i++){
            if(nums.get(i - 1) > nums.get(i)){
                reverse(nums, 0, i - 1);
                reverse(nums, i, len - 1);
                reverse(nums, 0, len - 1);
                break;
            }
        }
    }
    
    private void reverse(ArrayList<Integer> nums, int start, int end){
        while(start < end){
            int temp = nums.get(start);
            nums.set(start, nums.get(end));
            nums.set(end, temp);
            start++;
            end--;
        }
    }
}
