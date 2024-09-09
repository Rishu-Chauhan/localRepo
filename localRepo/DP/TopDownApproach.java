public class TopDownApproach {
    public static int Knps(int wt[],int val[],int W,int n){
        int t[][]=new int[n+1][W+1];
        for(int p=0;p<n+1;p++){
            for(int q=0;q<W+1;q++){
                if(p==0 || q==0){
                    t[p][q]=0;
                }
            }
        }
            for(int i=1;i<n+1;i++){
                for(int j=1;j<W+1;j++){
                 if(wt[i-1]<=j){
               t[i][j]=Math.max(val[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                 }
                 else if(wt[i-1]>j){
                 t[i][j]=t[i-1][j];
                 }
                }
            }
        
            return t[n][W];
        }
        
        
    
 public static void main(String[] args) {
    int wt[]={4,5,1};
    int val[]={1,2,3};
    int W=4;
    int n=3;
   System.out.println(Knps(wt, val, W, n));
 }   
}
