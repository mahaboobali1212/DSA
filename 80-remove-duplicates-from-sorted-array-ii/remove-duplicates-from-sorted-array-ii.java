
class Solution {
    public int removeDuplicates(int[] nums) 
    {

        if (nums == null) 
        {
            return 0;
        }

        if (nums.length <= 2) 
        {
            return nums.length;
        }

        int count = 1;
        int k = 1;

        for (int i = 1; i < nums.length; i++) 
        {

            if (nums[i] == nums[i - 1]) 
            {
                count++;
            } 
            else 
            {
                count = 1;
            }

            if (count <= 2) 
            {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}