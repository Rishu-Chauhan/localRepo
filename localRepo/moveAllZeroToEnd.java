public class moveAllZeroToEnd {
    public static void move(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if (arr[i] != 0) {
                if (i != j) { 
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp; 
                } 
                j++;
             }
          
            }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,0,4,3,0,5,0};
        int n=arr.length;
        move(arr, n);
        printArr(arr);
    }
}
