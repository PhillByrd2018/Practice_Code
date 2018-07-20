//make a main
//make an object
//use object to call function and pass in the array with the desire sum


//function that takes in an arraylist and a int, returns an arraylist<int> that is a index

    //check that the array and the sum are none 0 and non empty.
    //if yes, return -1

//else
    //step through the array in a double nested loop and add the elements at i & i+1
        //if they are equal to the sum add them to and output arraylist and return the list

import java.util.ArrayList;
import java.util.List;

public class TheArraySum {


    public List<Integer> sumInArray(List<Integer> inputList, int inputInt){
        List<Integer> output = new ArrayList<Integer>();

        if(inputList.size()<2 || inputInt<2){
            System.out.println("Sorry, you need to have an array larger than 2 elements and a sum greater than 2.");
            return output;
        }else{

            for(int i=0;i<inputList.size();i++){
                for(int y=i+1; y<inputList.size();y++){
                    if(inputList.get(i)+inputList.get(y)==inputInt){
                        output.add(i);
                        output.add(y);
                        return output;
                    }
                }
            }
        }


    return output;

    }

    public static void main (String[] args){
        TheArraySum testCase = new TheArraySum();
        List<Integer> testList = new ArrayList<Integer>();

        testList.add(18);
        testList.add(2);
        testList.add(11);
        testList.add(50);
        testList.add(4);
        testList.add(9);
        testList.add(7);
        testList.add(14);
        int sumtest = 23;
        System.out.println(testCase.sumInArray(testList,sumtest));


    }
}
