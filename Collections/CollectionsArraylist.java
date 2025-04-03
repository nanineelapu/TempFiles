package Collections;

import java.util.*;


public class CollectionsArraylist {
    
    public static void main(String[] args) {
        List list = new ArrayList<>();
        
        // List<String> listStrings = new ArrayList<>();
        ArrayList<String> arrayString = new ArrayList<String>();

        list.add(10);
        list.add(20);
        list.add(30);


        System.out.println(list);


        // for(int i = 0 ; i < list.size(); i++){
        //     System.out.println(list.get(i));
            
        // }
        
        // for(Integer num : list)
        // {
        //     System.out.print(num + " ");
        // }

        //Print data in through iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }

        ListIterator li = list.listIterator();

        while (li.hasPrevious()) {
            System.out.println(li.hasPrevious());
        }

        arrayString.add("Name");
        arrayString.add("Age");
        arrayString.add("City");
        System.out.println(arrayString);
        list.addAll(0,arrayString);

        System.out.println(list);

        // list.removeAll(arrayString);
        // System.out.println(list);
    }
}
