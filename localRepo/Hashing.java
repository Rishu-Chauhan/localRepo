import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[]args){
    //creation
    HashSet<Integer> set=new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    System.out.println(set);//puri list milegi
    
    //size
    System.out.println(set.size());

     //search
     if(set.contains(1)){
       System.out.println("present");
     }
     if(!set.contains(6)){
        System.out.println("not present");
     }

    //delete
    System.out.println(set.remove(1));
    System.out.println(set);

    //Iterator
    Iterator it=set.iterator();
    while(it.hasNext()){
        System.out.println(it.next());
    }
    }
}
