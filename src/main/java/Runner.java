import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list Y
        scottishIslands.add("Coll");

//        2. Add "Tiree" to the start of the list Y
        scottishIslands.add(0,"Tiree");

//        3. Add "Islay" after "Jura" and before "Mull" Y
        scottishIslands.add(scottishIslands.indexOf("Jura"), "Islay");

//        4. Print out the index position of "Skye" Y
        System.out.println(scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name Y
        scottishIslands.remove(scottishIslands.indexOf("Tresco"));

//        6. Remove "Arran" from the list by index Y
        scottishIslands.remove(scottishIslands.indexOf("Arran"));

//        7. Print the number of islands in your arraylist Y
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically Y
        Collections.sort(scottishIslands);

//        9. Print out all the islands using a for loop Y
        for (String island: scottishIslands){
            System.out.println(island);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers Y
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number: numbers){
            if (number % 2 == 0){
                evenNumbers.add(number);
            }
        }

        System.out.println("List of even numbers " + evenNumbers);

//        2. Print the difference between the largest and smallest value Y
        int difference = Collections.max(numbers) - Collections.min(numbers);
        System.out.println(difference);

//        3. Print True if the list contains a 1 next to a 1 somewhere. Y
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) - 1 == 0 && numbers.get(i+1) - 1 == 0 ){
                System.out.println("True");
            }
        }

//        4. Print the sum of the numbers, Y
        int totalSum = 0;

        for (int number: numbers){
            totalSum = totalSum + number;
        }

        System.out.println(totalSum);

//        5. Print the sum of the numbers... Y
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

        int specialTotalSum = 0;

        if (numbers.get(0) != 13){
            specialTotalSum = specialTotalSum + numbers.get(0);
            for (int i = 1; i < numbers.size(); i++){
                if (numbers.get(i) != 13 && numbers.get(i-1) != 13){
                    specialTotalSum = specialTotalSum + numbers.get(i);
                }
            }

        } else{
            for (int i = 2; i < numbers.size(); i++){
                specialTotalSum = specialTotalSum + numbers.get(i);
            }
        }

        System.out.println(specialTotalSum);

    }

}
