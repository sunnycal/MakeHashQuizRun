package com.company;

// 5.01 Hashmap quiz try to make program run

//Q what is the role of the constructor?
//A: to initialize the class.

//import statements go after package declaration and before class declaration
import java.util.HashMap;
public class Main{

    public static void main(String[] args){

// Initialize hashmap
        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        //add keys and values
            myMap.put( 1, "oklahoma");
            myMap.put( 2, "maryland");
            myMap.put( 3, "virgina");

//get the value corresponding to the key 3
            System.out.println("The value is " + myMap.get(3));

            //check to see if "indiana" is in my HashMap
            String myVal = "virginia";
            for (String value : myMap.values()) {
                if (myVal == value) {
                    System.out.println(myVal + " is in the hashmap.");
                    break;

                }
            }



    }
}
