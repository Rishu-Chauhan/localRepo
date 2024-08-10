import java.util.HashSet;

public class IntersectionOfArray {
    public static void Intersection(int nums1[],int nums2[]){
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                count++;
                System.out.print(nums2[j]+" ");
                set.remove(nums2[j]);
            }
        }
        System.out.println();
        System.out.println(count);
    }
 public static void main(String[] args) {
    int nums1[]={7,3,9};
    int nums[]={6,3,9,2,9,4};
    Intersection(nums1, nums);
 }   
}
