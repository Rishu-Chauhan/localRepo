public class DrawingBook {
    public static int flip(int n,int p){
        if(n % 2 != 0){
            n=n-1;
        }
        if(p % 2 !=0){
            p=p-1;
        
        }
        int leftFlip=p/2;
        int rightFlip=(n-p)/2;
        return Math.min(leftFlip,rightFlip);
    } 
    public static void main(String[] args) {
        int n=6;//no.of pages in the book
        int p=2;//find page2 in the book
        System.out.println(flip(n, p));
    }
}
