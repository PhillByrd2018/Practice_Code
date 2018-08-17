//Given an array, rotate the array to the right by k steps, where k is non-negative.

//make a main
    //make an object
    //make a test array and pop with values
    // use object to call function and pass test array

//write a function that takes in an array and a non 0 int to rotate the array by
    //create and output array
    //if the array is empty || int<1
        //return empty array and error message
    //else
        //step through the array and starting at array.size-k add to the output
        //step through the array again starting at 0 and go to K and add to output

import java.util.ArrayList;
import java.util.List;

public class ArrayRotate {

    public List<Integer> RotateArray(List<Integer> InputList, int rotateBy){

        List<Integer> outputList = new ArrayList<>();
        if(rotateBy<1 ||InputList.size()<1){
            System.out.println("Sorry this input is not valid. You must give a non empty list and k value");
            return  outputList;
        }else{

            for(int i=rotateBy+1;i<InputList.size();i++){
                outputList.add(InputList.get(i));
            }
            for(int i=0;i<rotateBy;i++){
                outputList.add(InputList.get(i));
            }
        }

        return outputList;
    }

    public static void main(String[] args){

        ArrayRotate testCase =  new ArrayRotate();
//        List<Integer> testList = new ArrayList<>();
//        testList.add(1);
//        testList.add(2);
//        testList.add(3);
//        testList.add(4);
//        testList.add(5);
//        testList.add(6);
//        testList.add(7);
//        testList.add(8);
//        testList.add(9);
//        testList.add(10);
//        System.out.println(testCase.RotateArray(testList,3)); //{[5, 6, 7, 8, 9, 10, 1, 2, 3]
//        List<Integer> testList2 = new ArrayList<>();
//        System.out.println(testCase.RotateArray(testList2,3)); //{[5, 6, 7, 8, 9, 10, 1, 2, 3]

        List<Integer> testList3 = new ArrayList<>();
        testList3.add(101);
        testList3.add(258);
        testList3.add(31);
        testList3.add(49);
        testList3.add(5);
        testList3.add(69);
        testList3.add(71);
        testList3.add(58);
        testList3.add(639);
        testList3.add(1020);
        System.out.println(testList3);
        System.out.println(testCase.RotateArray(testList3,6));

    }

    }

