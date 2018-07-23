//Shuffle a set of numbers without duplicates.

//make a main
    //make an object
    //make test case of ints in an array
    //use object to call the function and print it.

//make a function that takes in an array, and returns a shuffled array
    //create an output list

    //check that the array is not empty.
        //return empty array if true
    //else
        //use for loop to step through list
            //use Math.ran(0,n-1) to add element to output list

    //return output list.



//make a function that takes in an array, and returns a reset array
    //create an output list

    //check that the array is not empty.
        //return empty array if true
    //else
        //use for loop to step through list
        //bubble sort

    //return output list


import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class shuffleAndReset {
    private List<Integer> ListOfNums;

    public shuffleAndReset(List<Integer> list){
        ListOfNums = list;
    }

    public void shuffle(){
        List<Integer> output = new ArrayList<>();

        for(int i =0;i<ListOfNums.size();i++){
            output.add(ListOfNums.get(i));
    }
        int n=ListOfNums.size();
        ListOfNums.clear();


            while(ListOfNums.size()!=n){

                double ranDoub = Math.random()*output.size();
                int ran = (int)ranDoub;

                int temp  = output.get(ran);
                output.remove(ran);

                ListOfNums.add(temp);
            }



    }

    public void reset(){

            for(int i=0;i<ListOfNums.size();i++){
                for(int j=i+1;j<ListOfNums.size();j++){
                    if(ListOfNums.get(i)>ListOfNums.get(j)){
                        int temp = ListOfNums.get(i);
                        ListOfNums.set(i,ListOfNums.get(j));
                        ListOfNums.set(j,temp);
                    }
                }
            }

    }


    public static void main(String[] args){



        List<Integer> test2 = new ArrayList<Integer>();
        test2.add(1);
        test2.add(2);
        test2.add(3);
        test2.add(4);
        test2.add(5);
        test2.add(6);
        test2.add(7);
        test2.add(8);
        test2.add(9);

        shuffleAndReset testCase = new shuffleAndReset(test2);
        testCase.shuffle();
        System.out.println(test2);
        testCase.reset();
        System.out.println(test2);





    }
}
