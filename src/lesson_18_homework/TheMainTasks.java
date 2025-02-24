package lesson_18_homework;

import java.util.*;
import java.util.stream.Collectors;

public class TheMainTasks {

    public static void main(String[] args) {

        setTheFirstTask();
        System.out.println("-----------Task*------------------");
        System.out.println("Records backwards: " + setTheStarTask());


    }


    //Task 1. Create a collection of the ArrayList class and fill it with elements of the Integer type.
    // With the help Streams: remove duplicates, leave only even elements, withdraw the amount of the remaining
    // items in the stream
    public static void setTheFirstTask(){

        try {
            System.out.print("Enter number's line (f.e format: 1, 2, 2, 3): ");
            String inputLine = new Scanner(System.in).nextLine();

            String[] numbersArray = inputLine.split(",");

            List<Integer> values = new ArrayList<>();

            for (String number : numbersArray) {
                values.add(Integer.parseInt(number.trim()));
            }
            System.out.println("Input line: " + values);


            List<Integer> newList = values.stream().distinct().toList();
            System.out.println("--------------------------------");
            System.out.println("Line without duplicates:" + newList);


            List<Integer> newListSecond = newList.stream().filter(number -> number % 2 == 0).toList();
            System.out.println("Only even elements:" + newListSecond);


            List<Integer> newListThird = Collections.singletonList(newListSecond.stream().mapToInt(i -> i).sum());
            System.out.println("The sum of the remaining elements:" + newListThird);


        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }



    }



    // Task *. Create a data set in the id-name format saved in the Map. It is necessary to select from
    //this set only those data whose id falls within the numeric range 1/2/5/8/9/13.
    //Among the selected values, select only those that have an odd number.
    //letters in the name. Then return the list of names written in letters backwards.
    public static List<String> setTheStarTask() {

        Map<Integer, String> data = new HashMap<>();
        data.put(1, "Polina");
        data.put(2, "Alina");
        data.put(3, "Arina");
        data.put(5, "Maria");
        data.put(8, "Evelina");
        data.put(9, "Marina");
        data.put(10, "Zoi");
        data.put(13, "Lena");

        Set<Integer> idRange = Set.of(1, 2, 5, 8, 9, 13);

        List<String> filteredNames = data.entrySet().stream().filter(entry -> idRange.contains(entry.getKey()))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        System.out.println("Records with id = {1, 2, 5, 8, 9, 13}: " + filteredNames);


        List<String> oddLengthNames = filteredNames.stream()
                .filter(name -> name.length() % 2 != 0).collect(Collectors.toList());

        System.out.println("Records with odd number of letters: " + filteredNames);


        List<String> reversedNames = oddLengthNames.stream().map(name -> new StringBuilder(name).reverse().
                toString()).collect(Collectors.toList());

        return reversedNames;

    }




}
