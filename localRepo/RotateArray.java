public class RotateArray {
  
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        int k=2;
        int n=nums.length;
        int temp[]=new int [n];
         k=k%n;
         for(int i=0;i<n;i++){
            temp[(i+k)%n]=nums[i];
         }
         for(int i=0;i<n;i++ ){
          nums[i]=temp[i];
         }
         for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
         }
         System.out.println();
    }
}
