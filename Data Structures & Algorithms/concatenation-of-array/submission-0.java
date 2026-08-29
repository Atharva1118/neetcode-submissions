class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] newnums=new int[2*n];
        for(int i=0;i<n;i++){
            newnums[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            newnums[i]=nums[i-n];
        }
        return newnums;

    }
}