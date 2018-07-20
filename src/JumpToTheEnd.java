//Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//Each element in the array represents your maximum jump length at that position.
//
//Determine if you are able to reach the last index.


//case
    //1st =0
    //some number is 0
    //no numbers are 0, but not enough to reach the end index
    //no numbers are 0 and you reach the end index


//make a main
    //make a test array
    //make an object
    //use the object to call the function and pass the array

//make a function that takes in an array of none 0 ints and returns a boolean
    //capture the length of the array
    //if the array is empty return false
    //else
        //take the value at i=0
        //if the value is >= n then return true
        //move to [i]
        //take value there and move
        //if the value is >= then return true


import java.util.ArrayList;
import java.util.List;

public class JumpToTheEnd {

    public boolean canJumpToEnd(int position, List<Integer> input){


        if(position ==input.size()-1){
            return true;
        }

        int furthestJump = Math.min(position + input.get(position), input.size()-1);

        for(int nextPosition = position+1;nextPosition<=furthestJump;nextPosition++){
            if(canJumpToEnd(nextPosition,input)){
                return true;
            }
        }



        return false;
    }
    public static void main(String[] args){

        List<Integer> testList = new ArrayList<Integer>();
        testList.add(2);
        testList.add(3);
        testList.add(1);
        testList.add(1);
        testList.add(4);


        JumpToTheEnd testCase = new JumpToTheEnd();
        System.out.println(testCase.canJumpToEnd(0,testList));

        List<Integer> testList2 = new ArrayList<Integer>();
        testList2.add(3);
        testList2.add(2);
        testList2.add(1);
        testList2.add(0);
        testList2.add(4);
        System.out.println(testCase.canJumpToEnd(0,testList2));

        List<Integer> testList3 = new ArrayList<Integer>();
        testList3.add(0);
        testList3.add(2);
        testList3.add(1);
        testList3.add(0);
        testList3.add(4);
        System.out.println(testCase.canJumpToEnd(0,testList3));

        List<Integer> testList4 = new ArrayList<Integer>();
        testList4.add(8);
        testList4.add(2);
        testList4.add(1);
        testList4.add(0);
        testList4.add(4);
        System.out.println(testCase.canJumpToEnd(0,testList4));





    }
}
