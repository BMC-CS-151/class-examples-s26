import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); //note the ADT
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println(list); 

        for (int i=0; i<10000; i++) {
            if (i == 100) {
                list.add("kiwi");
            } else {
                list.add("fruit " + i);
            }
        }


        //TODO: rewrite with iterators
        //step 1: create an iterator
        //step 2: loop 
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().equals("kiwi")) {
                System.out.println("found it");
            }
        }

        /*
        for (int i=0; i<list.size(); i++) {
            if (list.get(i).equals("kiwi")) {
                list.set(i, "kiwifruit");
            }
        }*/

        //System.out.println(list); 
    }
}

