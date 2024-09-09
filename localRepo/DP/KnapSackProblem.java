
public class KnapSackProblem {
    
    
    public static int Knp(int wt[],int val[],int W,int n ){
        int t[][]=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
               t[i][j]=-1;
            }
        }

        if(n==0 || W==0){
            return 0;
        }
        if(t[n][W]!=-1){
            return t[n][W];
        }
        if(wt[n-1]<=W){
            return t[n][W]=Math.max(val[n-1]+Knp(wt,val,W-wt[n-1],n-1),Knp(wt, val, W, n-1));
        }
        else if(wt[n-1]>W){
          return  t[n][W]=Knp(wt, val, W, n-1);
        }
        return n;
    }
public static void main(String[] args) {

 
    int wt[]={4,5,1};
    int val[]={1,2,3};
    int W=4;
    int n=3;
    
    
    System.out.println(Knp(wt,val,W,n));
}
}


