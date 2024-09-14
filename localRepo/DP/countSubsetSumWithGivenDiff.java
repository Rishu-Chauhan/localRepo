public class countSubsetSumWithGivenDiff {
    public static int countSum(int nums[],int diff){
      int arrSum=0;
      for(int num:nums){
        arrSum+=num; 
      }
      if ((diff + arrSum) % 2 != 0) {
        return 0; // If not, return 0 as it's not possible to partition
    }
      int sum=(diff+arrSum)/2;
      return subsetSum(nums,sum);
    }
   
    public static int subsetSum(int nums[],int sum){
      
        int n = nums.length;
        int[][] dp = new int[n + 1][sum + 1];
        
        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (nums[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[n][sum];

    }
  
    public static void main(String[] args) {
        int nums[]={1,1,2,3};
        int diff=1;
        System.out.println(countSum(nums, diff));
    }
}
