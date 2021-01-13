package com.ddddvia.algorithms.test;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: hedwf
 * @Date:
 * @Version: 1.0
 */
public class Dog {
    public static void main(String[] args) {
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        Cat cat1 = new Cat();
        cat1.setName("name1");
        cat1.setWeight("we");
        cat1.setAge(1);
        catLinkedList.add(cat1);
        match(catLinkedList);
    }

    private static <T extends ALL> void match(List<T> cats){

        System.out.println("cat");

    }
}
