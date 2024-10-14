import java.util.Arrays;

public class isPalindrome {
    static int t[][];
    public static boolean Palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int solve(String s,int i,int j){
        if(i>=j){
            return 0;
        }
        if(Palindrome(s, i, j)==true){
            return 0;
        }
        if (t[i][j] != -1) {
            return t[i][j];
        }
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
          //  int temp=1+solve(s, i, k)+solve(s, k+1, j);
          int left,right;
          if(t[i][k]!=-1){
            left=t[i][k];
          }
          else{
           left=solve(s, i, k);
          t[i][k]=left;
          }
          if(t[k+1][j]!=-1){
            right=t[k+1][j];
          }
          else{
            right=solve(s, k+1, j);
          t[k+1][j]=right;
          }
          int temp=1+left+right;
            if(temp<min){
                min=temp;
            }
        }
        return t[i][j] = min;
    }
    public static void main(String[] args) {
        String s="aab";
        int n=s.length();
        int i=0;
        int j=s.length()-1;
        t=new int[n][n];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
       // System.out.println(Palindrome(s, i, j));
        System.out.println(solve(s, i, j));
    }
}
