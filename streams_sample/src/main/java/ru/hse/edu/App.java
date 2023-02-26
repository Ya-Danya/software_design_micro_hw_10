package ru.hse.edu;

import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        List<String> data = Arrays.asList(
                "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d",
                "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d",
                "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d",
                "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d", "aa", "bbb", "c", "d");
        Counter first_counter = new Counter(data);
        Counter second_counter = new Counter();
        Counter third_counter = new Counter();
        first_counter.start();
        second_counter.start();
        third_counter.start();
        try{
            first_counter.join();
        }
        catch(InterruptedException e){
            System.out.printf("%s has been interrupted", first_counter.getName());
        }
        try{
            second_counter.join();
        }
        catch(InterruptedException e){
            System.out.printf("%s has been interrupted", second_counter.getName());
        }
        try{
            third_counter.join();
        }
        catch(InterruptedException e){
            System.out.printf("%s has been interrupted", third_counter.getName());
        }

        System.out.println("Counter.sum = " + Counter.sum);
    }
}
