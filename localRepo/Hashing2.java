import java.util.*;
public class Hashing2 {
    public static void main(String[] args) {
        //Creation
    HashMap<String,Integer> map=new HashMap<>();

    //Insetion
    map.put("India",120);
    map.put("china",150);
    map.put("US",30);
    //map.put("china",180);-->update the value of 150 to 180
    System.out.println(map);
   
   //Searching
   if(map.containsKey("India")){
    System.out.println("present the key");
   }
   else{
    System.out.println("not present");
   }
  
   System.out.println(map.get("china"));
   System.out.println(map.get("russia"));

   //for each loop
   int arr[]={15,16,17};
   for(int val:arr){
    System.out.print(val+" ");
   }
   System.out.println();

    //Iteration in hashMap
    for(Map.Entry<String,Integer> e: map.entrySet()){
      System.out.println(e.getKey());
      System.out.println(e.getValue());
    }

    //otherWay to iterate
    Set <String> keys=map.keySet();
    for(String key:keys){
        System.out.println(key+" "+map.get(key));
    }

    //remove
    map.remove("china");
    System.out.println(map);
   }
    }

