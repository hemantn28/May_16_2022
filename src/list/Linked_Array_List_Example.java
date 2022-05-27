package list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_Array_List_Example {
    public static void main(String[] args) {

        LinkedList<String> stringLinkedList=new LinkedList<>();
        stringLinkedList.add("John");
        stringLinkedList.add("Gaurav");
        stringLinkedList.add("Peter");
        stringLinkedList.add("Santosh");
        stringLinkedList.add("Mosh");

        System.out.println(stringLinkedList.get(2));


        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("John");
        stringArrayList.add("Gaurav");
        stringArrayList.add("Peter");
        stringArrayList.add("Santosh");
        stringArrayList.add("Mosh");

        System.out.println(stringArrayList.get(2));
    }
}
