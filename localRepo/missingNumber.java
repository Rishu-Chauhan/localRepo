public class missingNumber {
    public static int missing(int arr[]){
        int idx=1;
        for(int i=0;i<arr.length;i++){
            if(idx==arr[i]){
                idx++;
            }
        }
        return idx;
    }
   
    public static void main(String[] args) {
        int arr[]={1,2,3,5};
        System.out.println(missing(arr));
        
    }
}
