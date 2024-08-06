public class FindSubset {
    public static void PrintStr(String str,String ans,int i){
        //basecase
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
           else{
            System.out.println(ans);
            
           }
           return;
        }
        //kaam
        //choice yes
        PrintStr(str, ans+str.charAt(i), i+1);
        //choice no
        PrintStr(str, ans, i+1);

    }
    public static void main(String[]args){
        String str="abc";
        PrintStr(str, "", 0);
    }
}
