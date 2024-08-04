public class BackTrackiingOnArray {
    public static void change(int arr[],int i,int val){
        if(i==arr.length){
            printArr(arr);//base case
            return;
        }
        arr[i]=val;
        change(arr, i+1, val+1);//kaam
        arr[i]=arr[i]-2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");//printing array
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        change(arr, 0, 1);
        printArr(arr);
    }
}
