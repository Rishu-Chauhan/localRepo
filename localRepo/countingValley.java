public class countingValley {
    public static int countValley(String path){
        int sl=0;int pl=0;int countV=0;
        for(char step :path.toCharArray()){
        pl=sl;
        if(step=='U'){
            sl++;
        }
        else{
            sl--;
        }
        if(sl==0 && pl<0){
            countV++;
        }
        }
        return countV;
    }
    public static void main(String[] args) {
        
        String path="UDDDUDUU";
        System.out.println(countValley(path));
    }
}
