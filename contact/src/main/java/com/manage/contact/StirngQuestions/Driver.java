package com.manage.contact.StirngQuestions;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver extends ConverStringToLowerCase {
    void hello(){
        System.out.println("hyy");
    }
    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.hello();
        ConverStringToLowerCase converStringToLowerCase = new Driver();
        converStringToLowerCase.print();

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");

//        System.out.println(list);


        // using collections method
        List<String> synchronized_list =
                Collections.synchronizedList(list);

        // using copyonwriteArraylist

        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        strings.add("a");
        strings.add("d");
        strings.add("c");

        Collections.shuffle(strings);
        System.out.println(strings);
        TreeSet<String> tree_set = new TreeSet<String>();//creating an empty tree set
        //adding values in the tree set
        tree_set.add("Monday");
        tree_set.add("Tuesday");
        tree_set.add("Wednesday");
        tree_set.add("Thursday");
        tree_set.add("Friday");
        tree_set.add("Saturday");
        tree_set.add("Sunday");

        TreeSet<String> strings1 = (TreeSet<String>)tree_set.clone();

//        strings.stream().forEach((data)-> System.out.println(data.toUpperCase()));


        Iterator itr = synchronized_list.listIterator();

//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        String sample_array[]
                = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

//        List<String> strings1 = Arrays.asList(sample_array);


        Hashtable<Integer,String> hashtable = new Hashtable();
        hashtable.put(1,"deepak");
        hashtable.put(2,"aman");
        hashtable.put(3,"dee");
        hashtable.put(4,"ayush");
//        System.out.println( hashtable.get(3));
//       hashtable.forEach((key,value)-> System.out.print(key+" "+value));
        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()){
            System.out.print(enumeration.nextElement());
        }

        }

}
