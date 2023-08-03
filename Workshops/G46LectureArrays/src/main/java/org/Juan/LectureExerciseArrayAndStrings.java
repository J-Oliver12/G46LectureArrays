package org.Juan;

import java.sql.SQLOutput;

public class LectureExerciseArrayAndStrings {

    public static void main(String[] args) {
        String[] stringArrays = new String[3];
        int[] numbers = new int[]{2, 4, 6, 8};
        char[] letters = {'J', 'A', 'V', 'A'};
//      char[] letters = new char[]{'J', 'A', 'V', 'A'};  Alternative also works //

        ex1();
        ex2();

    }

    public static void ex1(){
        String[] names = new String[3]; // [null, null, null] Created 3 "elements"
        System.out.println(names.length);     // Print length "[3]" as in 3 new elements
        System.out.println("-----------------");
        names[0] = "Fredrik";  // [Fredrik, null, null] Assigned Name to first element [index:0]
        names[2] = "Jonas";  // [Fredrik, null, Jonas] Assigned Name to last element [index:2]
        //names[ names.length - 1 ] = "Jonas"; // means number [2] as above: [Fredrik, null, Jonas]
        System.out.println(names[0]);           //Print element [index: 0]
        System.out.println(names[1]);           //Print element [index: 1]
        System.out.println(names[2]);           //Print element [index: 2]
    }

    public static void ex2() {
        int[] numbers = {5, 2, 3, 4, 7};                 // created directly five given elements ("ArrayList")
        System.out.println(numbers.length);              // Print length "[5]" as in the 5 new given elements
        System.out.println("-------------------");
        printArray(numbers);                             // *** Using the method below (printArray) to simplify ***
        /*for ( int i = 0; i < numbers.length; i++) {    // Iterates and loop through the ArrayList
            System.out.println(numbers[i]);              // Access the elements and print them
        }*/
        numbers[1] = 4;                                  // Replaced Array "index 1" with new "value 4"
        System.out.println("-------------------");
        printArray(numbers);                              // *** Using the method below (printArray) to simplify ***

        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);               // Runs and prints the new value replacing previous
        }*/
        //  numbers[5] = 10;   // throws exception -> java.lang.ArrayIndexOutOfBoundsException

    }

    public static void printArray(int[] numbers){      // *** inserting the parameters (array of "numbers") in the method printArray to print ***
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);            // *** Improves, Runs and prints the new method replacing previous ***
        }
    }


}
