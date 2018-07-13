import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class TheLoops {

    //given a list full of number, use for loop, while loop, & recursion to count the sum of the number

    //create a main
    //create a list of number
    //create 3 function
    //pass the list to each function

////////////////////////////////////////

    //for
        //take the list and check if ==0
            //if yes return null
            //else return the single element
        //else step through the list and use variable to hold and update the sum value
        //return output variable

    public int forSum(List<Integer> input){
        int sum = 0;
        if(input.size()<1){

            return 0;
        }else if (input.size()==1){
            return input.get(1);
        }else{
            for(int i=0;i<input.size();i++){
                sum+=input.get(i);
            }


        }
        return sum;
    }

    //while
        //take the list and check if ==0
        //if yes return null
        //else return the single element
        //else step through the list and use variable to hold and update the sum value
        //return output variable

    public int whileSum(List<Integer> input){

        int sum =0;
        if(input.size()==0){
            return 0;

        }else if (input.size()==1){
            return input.get(1);
        }else{
            int w=0;
            while(w<input.size()){
                sum+=input.get(w);

                w++;
            }

        }


        return sum;
    }


    //recursion
        //take the list and check if ==0
        //if yes return null
        //else return the single element
        //else call the function and pass it the list at n-1 elements
            //break case @ n=1

        //return output variable

    public int recursiveSum(List<Integer> input ){

            if(input.size()>1){

                return input.get(input.size()-1) + recursiveSum(input.subList(0,input.size()-1));
            }else{
                return input.get(0);
            }




    }



    public static void main(String[] args){

        //make and populate the list
        List<Integer> ListOfNums = new ArrayList<Integer>();
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);
        ListOfNums.add(1);

        //create and call the right functions and pass the list of numbers to be summed
        TheLoops testCase = new TheLoops();
        System.out.println(testCase.forSum(ListOfNums));
        System.out.println(testCase.whileSum(ListOfNums));
        System.out.println(testCase.recursiveSum(ListOfNums));


    }

}
