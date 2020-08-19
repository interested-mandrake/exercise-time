class Solution 
{
    // purpose: rotate input array k units to the right
    public int [] rotate(int[] nums, int k) 
    { 
        int [] numsCopy = nums.clone();
	for(int i = 0; i < nums.length; i++)
        {
            if(i + k < nums.length)  //i.e. {1, 2, 3} with k = 2 shifts to {1, 2, 1}
            {
                numsCopy[i + k] = nums[i];
            }
            else   //i.e. {1, 2, 3} with k = 2 shifts to {2, 3, 3}
            {
                numsCopy[(i + k) % nums.length] = nums[i];
            }
        }
        return numsCopy;
    }
}