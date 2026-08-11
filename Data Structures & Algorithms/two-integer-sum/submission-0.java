class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int difference = 0;

        for(int i = 0;i<nums.length;i++)
        {
            difference = target - nums[i];
            if(map.containsKey(difference))
            {
                return new int[] {map.get(difference),i};
            }

            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution exists");
    }
}
