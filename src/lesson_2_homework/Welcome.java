package lesson_2_homework;

import javax.swing.event.RowSorterListener;
import java.util.SortedMap;

public class Welcome {

    public static void main(String[] args){ // arguments

        getBasicInformationOnJava();
        exploreTypesVariables();
        arithmeticOperators();
    }


    public static void getBasicInformationOnJava(){

        System.out.println("Hello world");
        System.out.print("Hello world without next line");
        System.out.print("\nNo new line \n"); // checking the line break
        System.out.print("The new line message\n");
        System.out.println("----------------------------------------------");

    }

    public static void exploreTypesVariables() {

        //Integer
        byte byteValue = -35;
        short shortValue = 32767;
        int intValue = 25;
        long longValue = 1234_56789_5555L; // using the literal L
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println("----------------------------------------------");

        // Floating
        double doubleValue = 4.9;
        float floatValue = 4.9F;
        double floatValueConvert = (double) floatValue; // convert float to double

        System.out.println(doubleValue);
        System.out.println(floatValueConvert);
        System.out.println("--------------------------------------------------");

        // Logical
        boolean isAlive = true;
        boolean isMarried = false;
        System.out.println(isMarried);
        System.out.println(isAlive);
        System.out.println("--------------------------------------------------");

        // Char
        char charValue = 'p';
        System.out.println(charValue);
        char charASCIIValue = 112;
        System.out.println("Result:" + charASCIIValue);
        System.out.println("--------------------------------------------------");

    }

    public static void arithmeticOperators(){

        int height = 164;
        double weight = 52.5;

        int getSumHeightAddition = height + height;
        int getSumHeightSubtraction = height - 25;
        double getSumWeightDivided = weight / 5;
        System.out.println(getSumHeightAddition);
        System.out.println(getSumHeightSubtraction);
        System.out.println(getSumWeightDivided);
        System.out.println("--------------------------------------------------");

        char storeChangingValue = 112;
        storeChangingValue = (char) (storeChangingValue - 12); // casting about the difference (-12) with char values
        System.out.println("Result:" + storeChangingValue);
        System.out.println("--------------------------------------------------");

        //Remainder of division
        System.out.println(22%4); // 4+4+4+4+4 = 20, 22-20 = 2
        System.out.println("--------------------------------------------------");

        // Increment, Decrement
        int valueIncrement = 21;
        int valueDecrement = 9;

        // post
        valueIncrement++;
        valueDecrement--;
        System.out.println("Result increment (st1):" + valueIncrement);
        System.out.println("Result decrement (st1):" + valueDecrement);

        //pre
        ++valueIncrement;
        --valueDecrement;
        System.out.println("Result increment (st2):" + valueIncrement);
        System.out.println("Result decrement (st2):" + valueDecrement);

        //Difference between pre and post
        int postValueResultIncrement = 126 - valueIncrement++;
        int preValueResultIncrement = 126 - ++valueIncrement;
        System.out.println("Post: " + postValueResultIncrement);
        System.out.println("Pre: " + preValueResultIncrement);


    }

}
