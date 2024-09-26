public class LongestCommonSub {
    public static int Lcs(String x,String y,int n,int m){
        int t[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
              if(x.charAt(i-1)==y.charAt(j-1)){
                t[i][j]=1+t[i-1][j-1];
              }
              else{
                t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
              }
            }
        }
        return t[n][m];
    }
    public static void main(String[] args) {
        String x="abcdgh";
        String y="abedfr";
        int n=x.length();
        int m=y.length();
        System.out.println(Lcs(x, y, n, m)); 
    }
}
