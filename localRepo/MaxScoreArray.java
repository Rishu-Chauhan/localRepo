public class MaxScoreArray {
    public static int max(int nums[]){
  int count=0;
  int ma=0;
  for(int num:nums){
    count+=ma;
    ma=Math.max(ma,num);
  }
  return count;
    }
    public static void main(String[] args) {
        int nums[]={1,3,1,5};
        System.out.println(max(nums));
    }
}
