public class MinimizeSubsetSum {
    public static int findMin(int arr[]){
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        boolean t[][]=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            t[i][0]=true;
        }
        for(int j=1;j<sum+1;j++){
            t[0][j]=false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j]=t[i-1][j-arr[i-1]] ||t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        for(int j=sum/2;j>=0;j--){
            if(t[n][j]){
                min=sum-2*j;
              break;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,1};
        System.out.println(findMin(arr));
    }
}
