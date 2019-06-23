package ch18pc02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author frank
 */
public class MyList<T extends Comparable<? super T>> {
    // Fields
    private ArrayList<T> myArray = new ArrayList<T>(0);
    
    public void add(T item) {
        myArray.add(item);
    }
    
    public T largest() {
        return Collections.max(myArray);
    }
    
    public T smallest() {
        return Collections.min(myArray);
    }
}
