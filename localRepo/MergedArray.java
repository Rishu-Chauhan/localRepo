public class MergedArray {
    public static void Print(int a1[],int a2[],int temp[]){
        
       int i=0,j=0,k=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                temp[k++]=a1[i++];
            }
            temp[k++]=a2[j++];
        }

        while(i<a1.length){
            temp[k++]=a1[i++];
        }
        while(j<a2.length){
            temp[k++]=a2[j++];
        }
        for( i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        
    }
   public static double median(int temp[]){
    int slow=temp[0];
    int fast=temp[0];
    while(fast!=temp.length){
        slow+=1;
        fast+=2;
    }
    return slow;
   }
    public static void main(String []args){
        int a1[]={1,3};
        int a2[]={2};
        int temp[]=new int [a1.length+a2.length];
        Print(a1, a2,temp);
        System.out.println();
        System.out.println( "median of array is "+median(temp));
    }
}
