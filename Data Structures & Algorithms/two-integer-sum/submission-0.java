class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum=target-nums[i];
            if(map.containsKey(sum)){
                if(i<map.get(sum)){
                    return new int[]{
                        i,map.get(sum)
                    };
                }
                return new int[]{
                        map.get(sum),i
                };
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
