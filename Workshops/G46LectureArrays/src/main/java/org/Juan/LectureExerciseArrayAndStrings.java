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
        ex3();
        sortNumber();


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
        for (int i = 0; i < numbers.length; i++) {            //*** This is a method to insert as printArray and simplify in other methods ***
            System.out.println(numbers[i]);            // *** Improves, Runs and prints the new method replacing previous ***
        }                                                                 //*** this is a Iterate method ***//
    }

    public static void ex3() {
        String[][] bord = new String[3][3];            // created interdimensional array-element list of 3 rows (i) and 3 columns (j)
        // [ "0", "X", "X"]
        // [ "0", "X", "X"]
        // [ "0", "X", "X"]

        bord[0][0] = "0";                              // defining the value of each element according to the index position [0][0]
        bord[0][1] = "X";                              //                                - || -
        bord[0][2] = "X";

        bord[1][0] = "0";
        bord[1][1] = "X";
        bord[1][2] = "X";

        bord[2][0] = "0";
        bord[2][1] = "X";
        bord[2][2] = "X";

        for (int i = 0; i < bord.length; i++) {                           //nested for loop (i: vertical length)
            for (int j = 0; j < bord[i].length ; j++) {                   //for the value "bord[i].length" (j: horizontal length)
                System.out.print(bord[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static void ex4() {


        int[] numbers = {2, 3, 5, 6};                     // defining array of numbers

        for (int i = 0; i < numbers.length ; i++){        // this "for loop" example can iterate forwards and backwards
        System.out.println(numbers[i]);                               // Index based for loop
        }


        for (int number : numbers) {                      // this "for each loop" example iterates only forwards, from start to end
            System.out.println(number);                               // Enhanced for loop
        }

    }

    public static void sortNumber() {                           // Method that stores an array of numbers and sort in ascending numbers

        int[] numbers = {5, 2, 3, 4, 7};
        // {2, 5, 3, 4, 7}
        // {2, 3, 5, 4, 7}
        // {2, 3, 4, 5, 7}

        for (int i = 0; i < numbers.length; i++) {                  //defining i = 0

            for (int j = i + 1 ; j < numbers.length; j++){          //defining j = i + 1

                //compare each element of the array to all remaining elements:
                if(numbers[i] > numbers[j]) {        // if 5 > 2 execute this block; true if j = 1 and i = 1+: //nested loop:

                    // swapping array elements:
                    int tmp = numbers[i];           //defining tmp variable
                    numbers[i] = numbers [j];       //replacing "i" variable with "j" variable
                    numbers[j] = tmp;               //replacing "j" variable with "tmp" variable
                }
            }
        }
        for (int number : numbers){
            System.out.println(" " + number);
        }
    }


}
