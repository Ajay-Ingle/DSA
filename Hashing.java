import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        //insert - using add() fun
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //set size
        System.out.println("the size of set is: "+set.size());
        System.out.println("the elements of set is: "+set);

        //Search - contains() func
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(9)){
            System.out.println("The set doesnot contains 9");
        }
        
        // set.remove(1);
        // if(set.contains(1)){
        //     System.out.println("Set contains 1");
        // }else{
        //     System.out.println("1 is removed");
        // }
        
        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            //doest not requires iteration it automatically get iterated
        }
    }
}
