public class longestRepeatingSubsq {
    public static int longest(String a,String b,int n){
        int t[][]=new int[n+1][n+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<n+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1) && i!=j){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        return t[n][n];
    }
    public static void main(String[] args) {
        String a="AABEBCDD";
        String b=a;
        int n=a.length();
        System.out.println("The length of repeating subsequence= "+longest(a, b, n));
    }
}
