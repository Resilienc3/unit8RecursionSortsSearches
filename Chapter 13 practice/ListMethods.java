import java.util.*;

public class ListMethods{
   

    public static ArrayList makeList(int n){
        ArrayList<Integer> tempList =  new ArrayList<Integer>();

        if (n <= 0)  
        { 
            return tempList;

        }
        else        
        {

            tempList = makeList(n-1);
            tempList.add(n);

        }
        return tempList;
    }

    public static ArrayList<Integer> deepClone(ArrayList<Integer> tList){
       ArrayList<Integer> list = new ArrayList<Integer>(); 
       for (Integer i : tList){
          list.add(new Integer(i));
       }
       return list;

    }       
    public static ArrayList<Integer> reverseList(ArrayList<Integer> tList){
       ArrayList<Integer> list = ListMethods.deepClone(tList);
       int i= tList.size();
       if (list.size()==0){
          return list;
       }else{
          reverseList(i-1);
          list.add(i);
       }
       return list;
   }

}