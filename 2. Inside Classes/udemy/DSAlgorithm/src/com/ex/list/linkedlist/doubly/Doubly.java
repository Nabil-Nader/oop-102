package com.ex.list.linkedlist.doubly;

import com.ex.list.array.Employee;

public class Doubly {

    public static void main(String[] args) {

        // by using list, if I decide later to change and use a different type of list
        Employee jane = new Employee("Jane", "Doa", 123);
        Employee john = new Employee("John", "Doa", 456);
        Employee billy = new Employee("Billy", "Doa", 789);
        Employee nader = new Employee("Nader", "Doa", 1011);

        EmployeeLDoublyinkedList list = new EmployeeLDoublyinkedList();

        list.addToFront(jane);
        list.addToFront(john);
        list.addToFront(billy);
        list.addToFront(nader);

        System.out.println(list.getSize());
        list.printNode();
    }


}
