public class EqualSumPartition {

    public static int sum(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
              sum+=arr[i];
        }
        return sum;
    }
    public static boolean Sum(int arr[],int sum ,int n){
        boolean t[][]=new boolean [n+1][sum+1];
        for(int i=0;i<n+1;i++){
         for(int j=0;j<sum+1;j++){
             if(i==0){
                 t[i][j]=false;
             }
             if(j==0){
                 t[i][j]=true;
             }
         }
        }
        for(int i=1;i<n+1;i++){
         for(int j=1;j<sum+1;j++){
             if(arr[i-1]<=j){
                 t[i][j]=t[i-1][j-arr[i-1]] || t[i-1][j];
             }
             else{
                 t[i][j]=t[i-1][j];
             }
         }
        }
        return t[n][sum];
     }
   
    public static void main(String[] args) {
        int arr[]={1,5,11,7};
        int n=arr.length;
        int sum=0;
        int val=sum(arr, n);
       if(val % 2==0 && Sum(arr, sum/2, n)){
        System.out.println("Arrays has equal partitioned");
       }
       else{
        System.out.println("not equal partitioned");
       }
    }
}
