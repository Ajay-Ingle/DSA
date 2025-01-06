import java.util.HashSet;

public class Hashing {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        //insert - using add() fun
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        //Search - contains() func
        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(9)){
            System.out.println("The set doesnot contains 9");
        }
        
        
        

    }
}
