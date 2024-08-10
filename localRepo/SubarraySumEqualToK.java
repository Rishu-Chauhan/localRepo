import java.util.HashMap;

public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int nums[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer> map=new HashMap<>();//sum,fequ
        map.put(0, 1);//empty subarray
        int ans=0;
        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            if(map.containsKey(sum-k)){
                ans+=map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
