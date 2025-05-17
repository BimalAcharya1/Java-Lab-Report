
package presentation;

import java.util.LinkedList;

class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        //add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addLast("Orange");
        System.out.println("Fruits List: " + fruits);
        
        //remove elements 
        fruits.remove("Banana");
        fruits.removeFirst();
        System.out.println("Fruits List After Removing  First Fruits and Banana : " + fruits);

        // Check for a element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
         
        //clear all element
        fruits.clear();
        System.out.println("List of fruits After clearing all : " + fruits);
        
    }
}