class Solution {

    // method parameter info: where m is the length of numbers in nums1, n is the length of numbers in nums2, and nums1 has enough capacity to hold all the numbers in both nums1 and nums2
    public void merge(int[] nums1, int m, int[] nums2, int n) { 
        
	int [] nums1clone = nums1.clone();
        
        int p = 0; // pointer to nums1, our final output
        int p1 = 0; // pointer to our copy of nums1, from which we get nums1 values
        int p2 = 0; // pointer to nums2, from which we get nums2 values
        
        for(; p1 < m && p2 < n; p++) // perform place until we reach the end of one of the input arrays
        {
            if(nums1clone[p1] < nums2[p2]) // place the lesser value 
            {
                nums1[p] = nums1clone[p1++];
            }
            else
            {
                nums1[p] = nums2[p2++];
            }
        }
        
        //place remaining values. (we can place all values that remain since we have already read to the end of one of the input arrays)
        while(p1 < m)
        {
            nums1[p++] = nums1clone[p1++];
        }
        
        while(p2 < n)
        {
            nums1[p++] = nums2[p2++];
        }
        
    
    }
}