package ch18pc02;

import ch18pc02.MyList.*;
/**
 * 
 * @author frank
 */
public class Ch18pc02 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] myIntArray = {1, 5, 65, 789, -321, 215, 35};
        String[] myStringArray = {"alpha", "gamma", "delta", "epsilon", "omega"};
        
        // Instantiate MyList
        MyList intList = new MyList();
        MyList stringList = new MyList();
        
        System.out.println("Welcome to the MyList Class demonstration.");
        System.out.println("The following numbers are in my array.");
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        
        System.out.println("Adding these values to the generic class.");
        for (int i = 0; i < myIntArray.length; i++) {
            intList.add(myIntArray[i]);
        }
        
        System.out.println("Here is the largest value: " + intList.largest());
        System.out.println("Here is the smallest value: " + intList.smallest());
        
        System.out.println("The following string are in my array.");
        for (int i = 0; i < myStringArray.length; i++) {
            System.out.println(myStringArray[i]);
        }
        
        System.out.println("Adding these values to the generic class.");
        for (int i = 0; i < myStringArray.length; i++) {
            stringList.add(myStringArray[i]);
        }
        
        System.out.println("Here is the largest value: " + stringList.largest());
        System.out.println("Here is the smallest value: " + stringList.smallest());
    }
}
