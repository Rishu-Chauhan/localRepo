public class coinChangel {
    public static int change(int coin[],int sum){
        int n=coin.length;
        int t[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=1;
        }
        for(int j=1;j<sum+1;j++){
            t[0][j]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(coin[i-1]<=j){
                    t[i][j]=t[i][j-coin[i-1]]+t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args) {
        int coin[]={1,2,5};
        int sum=11;
        System.out.println(change(coin, sum));
    }
}
