class Solution {
    /*
        About: This problem is a little misleading. The goal is to remove duplicate elements in a sorted
        array, but to do this by correctly positioning the values in-place. The int value which we return
        represents the length we will read from the modified input array to get a unique
        copy of each sorted number.
    */
    public int removeDuplicates(int[] nums) {
        /*  
         Thoughts: 
         we can solve this using a 2 pointer approach. let's call the pointers fast and slow
         slow moves to the current index at which we want to place the next number
         fast moves to each index and places the number located at fast at slow IF it is different from the value at slow */
        if(nums.length == 0)
        {
            return 0;
        }
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++)
        {
            if(nums[fast] != nums[slow])
            {
                slow++;
                nums[slow] = nums[fast]; // at the next index, place a unique number
            }
        
        }
        return slow + 1; // slow is an index, but we want length, so we add 1
    }
}
