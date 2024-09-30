import java.util.ArrayList;
import java.util.List;

public class MinimumNoOfDeletionInsertion {
    public static List<Integer> delIns(String a,String b,int n,int m){
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
        int lcs=t[n][m];
        int noOfDel=n-lcs;
        int noOfInser=m-lcs;
       List<Integer> list=new ArrayList<>();
       list.add(noOfDel);
       list.add(noOfInser);
        return list;
    }
    public static void main(String[] args) {
        String a="heap";
        String b="pea";
        int n=a.length();
        int m=b.length();
        System.out.println(delIns(a, b, n, m));
    }
}
