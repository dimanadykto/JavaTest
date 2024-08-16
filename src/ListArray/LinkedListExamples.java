package ListArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamples {

    public static void main(String[] args) {
        LinkedList<String> namesList = new LinkedList<>(); //Faster for manipulating the list data
        namesList.add("John");
        namesList.add("Dima");
        namesList.add("George");
        namesList.add("John");
        System.out.println(namesList);


        ArrayList<String> Arraylist = new ArrayList<>(); //SLower but great for storage and accessing data
        Arraylist.add("John");
        Arraylist.add("Dima");
        Arraylist.add("George");
        Arraylist.add("John");
        System.out.println(Arraylist);
    }
}
