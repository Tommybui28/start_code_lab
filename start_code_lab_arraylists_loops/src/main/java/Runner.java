import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
//  1
        scottishIslands.add("Coll");
//  2
        scottishIslands.add(0, "Tiree");
//  3
        scottishIslands.add(2, "Islay");

//  4
        System.out.println(scottishIslands.indexOf("Skye"));
//  5
        scottishIslands.remove("Tresco");
//  6
        scottishIslands.remove(5);
//  7
        int totalIsland = scottishIslands.size();
        System.out.println(totalIsland);


//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
//        5. Remove "Tresco" from the list by name
//        6. Remove "Arran" from the list by index
//        7. Print the number of islands in your arraylist
//        8. Sort the list alphabetically
//        9. Print out all the islands using a for loop

        // 8
        Collections.sort(scottishIslands);
        System.out.println(scottishIslands);

        // 9
        for (int i = 0; i < scottishIslands.size(); i++) {

            String island = scottishIslands.get(i);
            System.out.println(island);
        }


//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

        //        1. Print out a list of the even integers
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= numbers.size(); i++) {

            if (i % 2 == 0) {

                System.out.println((i));
            }
        }


//        2. Print the difference between the largest and smallest value
        System.out.println(Collections.max(numbers) - Collections.min(numbers));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean result = false;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1 && numbers.get(i + 1) == 1) {
                result = true;
            }
        }
        System.out.println("(numbers contains 1 next to a 1) is: " + result);


//        4. Print the sum of the numbers,
        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println("Sum of numbers: " + sumOfNumbers);


//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        int total = 0;
        for (int number : numbers) {
            if (number == 13) {
                break;
            }
            total += number;

        }
        System.out.println(total);





    }

}


