class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums);
        Arrays.sort(nums, (String s1, String s2)->s1.length()-s2.length());
        return nums[nums.length-k];
    }
}