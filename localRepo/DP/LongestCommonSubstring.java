public class LongestCommonSubstring {
    public static int longestCommonSubstr(String str1, String str2) {
        // code here
        int n=str1.length();
        int m=str2.length();
        int t[][]=new int [n+1][m+1];
        int maxLen=0;
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                    maxLen=Math.max(maxLen,t[i][j]);
                }
                else{
                    t[i][j]=0;
                }
            }
        }
    return maxLen;
    }
    public static void main(String[] args) {
      String  str1 = "ABCDGH";
      String str2 = "ACDGHR";
      System.out.println(longestCommonSubstr(str1, str2));
    }
}
