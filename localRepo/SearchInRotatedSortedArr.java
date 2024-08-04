public class SearchInRotatedSortedArr {
    public static int search(int arr[],int tar,int si,int ei){
        if(si>ei){
            return -1;//base case
        }
        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //mid on l1
        if(arr[si]<=arr[mid]){
            //left case-a
            if(arr[si]<=tar && tar<=arr[mid]){
              return  search(arr, tar, si, mid-1);
            }
            else{
            return    search(arr, tar, mid+1, ei);
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                return search(arr, tar, mid+1, ei);
            }
            else{
                return search(arr, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=6;
      int tarIdx=  search(arr, tar, 0, arr.length-1);
      System.out.println(tarIdx);
    }
}
