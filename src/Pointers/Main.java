package Pointers;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*
         * @dev Without Using Pointers
         */

        // Creating integers
        int num1 = 11;
        int num2 = num1; // gets the value from num1 not address

        // Changing num1's value to 22
        num1 = 22;

        // Printing numbers
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        /*
         * @dev Using Pointers
         */

        // Create Hashmaps
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        // Assign values
        map1.put("value", 11); // { "value": 11 }
        map2 = map1; // map2 gets the address of map1 here

        // Change value of map1 which will eventually change value in map2 too
        map1.put("value", 12);

        // Print Hashmaps
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
    }
}
