public class SortColor {
    public static void printArr(int nums[]){
        int[] temp=new int[nums.length];          
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count0++;
            }

            else if(nums[i]==1){
              count1++; 
            }
           else{
            count2++;
           }
            
        }
        for(int i=0;i<count0;i++){
            temp[i]=0;
        }
        for(int i=count0;i<count0+count1;i++){
            temp[i]=1;
        }
        for(int i=count0+count1; i<nums.length; i++){
            temp[i]=2;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        printArr(nums);
    }
}
