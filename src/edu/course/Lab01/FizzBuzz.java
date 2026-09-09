package edu.course.Lab01;

import java.util.ArrayList;

public class FizzBuzz {

   private ArrayList<String> numbers = new ArrayList<>();


    public FizzBuzz() { this.getFizzBuzz(); }

    public void getFizzBuzz() {
        for (int i = 0; i < 500; i++) {
            if (i%7==0 && i%5==0) numbers.add("fizzbuzz");
            else if (i%5!=0 && i%7==0) numbers.add("buzz");
            else if (i%7!=0 && i%5==0) numbers.add("fizz");
            else numbers.add(String.valueOf(i));
        }

        for (String i : numbers) {
            System.out.println(i);
        }
    }
}
