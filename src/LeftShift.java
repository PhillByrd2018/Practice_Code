//Create a new -element (where  is the length of ) array named  to hold the rotated items.
//Copy the contents of  over to the new array in two parts:
//The -element contiguous segment from  to  must be copied over to the contiguous segment starting at .
//The -element contiguous segment from  to  must be copied over to the contiguous segment starting at .
//Reassign the reference to  so that it points to  instead.

//bruteforce:
//cases:
    //good list with d<list.size()
    //what about d> list.size()
    //null or empty list


//make a main
    //make an object
    //make test data with expected values
    //use object to call function  and pass test data.

//make a function that takes in an arraylsit and an int d and returns a rotated list d elements to the left
    //make an output list
    //if null or empty return empty list
    //else
        //int shift = d%list.size()
        //step through the list from shift-end and add to an output list
        //step through the inputlist from beginning to shift and add to output list

    //return output



import java.util.ArrayList;
import java.util.List;

public class LeftShift {

    public List<Integer> shiftList( List<Integer> inputList,int shift){
        List<Integer> outputList = new ArrayList<>();

        if(inputList.size()<1|| shift<1 || inputList== null){
            System.out.println("invaild input data");
            return outputList;
        }else{
            int realShift = shift%inputList.size();
            for(int i=realShift;i<inputList.size();i++){
                outputList.add(inputList.get(i));
            }
            for(int i=0;i<realShift;i++){
                outputList.add(inputList.get(i));
            }
        }


        return outputList;
    }

public static void main (String[] args){
    LeftShift testCase = new LeftShift();
    List<Integer> test = new ArrayList<>();
    test.add(1);
    test.add(2);
    test.add(3);
    test.add(4);
    test.add(5);
    test.add(6);
    System.out.println(testCase.shiftList(test, 3));//should return [4,5,6,1,2,3]

    List<Integer> test2 = new ArrayList<>();
    test2.add(1);
    test2.add(2);
    test2.add(3);
    test2.add(4);
    test2.add(5);
    test2.add(6);
    System.out.println(testCase.shiftList(test2, 10));//should return [5,6,1,2,3,4]
}

}
