package com.stockmarket.technicalanalysis.util;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    /**
     *Write a program that outputs the string representation of numbers from 1 to n.
     *
     * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
     *  **/

    private List<String> fizzBuzz(int n) {
        List <String> listOfFizzBuzz = new ArrayList<>();
        for(int i = 1; i <= n ;i ++)
        {
            String toAdd = "";

            if(i % 3 == 0 )
            {
                toAdd += "Fizz";
            }
            if(i % 5 == 0)
            {
                toAdd += "Buzz";
            }
            if(toAdd.equals("")){
                listOfFizzBuzz.add(Integer.toString(i));
            }
            else{
                listOfFizzBuzz.add(toAdd);
            }

        }
        return listOfFizzBuzz;
    }
}
