public class LengthOfShortestSuperSeque {
    public static int LoSsS(String a,String b,int n,int m){
        int t[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=0;
        }
        for(int j=0;j<m+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[n][m];
    }
    public static int SSS(int lengthOflcs,int n,int m){
        return n+m-lengthOflcs;
    }
    public static void main(String[] args) {
        String a="AGGTAB";
        String b="GXTXAYB";
        int n=a.length();
        int m=b.length();
        int lengthOflcs=LoSsS(a, b, n, m);
        System.out.println(SSS(lengthOflcs, n, m));
    }
}
