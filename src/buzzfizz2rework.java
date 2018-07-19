

import java.util.*;

public class buzzfizz2rework {
    //given a list of numbers step through and print buzz if #/3,fizz if #/5 and both if both

    //make list of numbers in main
    //populate
    //make a function that takes the list
    //make a call to function and pass the list
    //

    //make return list
    //make copy of input into new list

    //check if list is less than 2 or null
    //if true return null
    //else
    //step through list and use mod to see if #/3or5
    //if both return fizzbuzz
    //else if #/3 return fizz
    //else if #/5 return buzz

    //return the list

    public Boolean buzzFizz(List<Integer> input){

        List<String> outputList = new ArrayList<String>();
        if(input==null || input.size()<3){
            return null;
        }else{
            for(int p=1;p<=input.size();p++){
                if(p%3==0 && p%5==0){
                    System.out.println(p + "FizzBuzz");

                }else if(p%3==0){
                    System.out.println(p + "Fizz");
                }else if(p%5==0){
                    System.out.println(p + "Buzz");
                }else{
                    System.out.println(p);


                }
            }

        }


        return true;
    }

    public static void main(String[] args){

        List<Integer> listOfNums = new ArrayList<Integer>();
        for(int i=1;i<101;i++) {
            listOfNums.add(i);
        }

        buzzfizz2rework test= new buzzfizz2rework();

        test.buzzFizz(listOfNums);
    }

}