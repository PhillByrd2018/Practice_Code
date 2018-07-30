//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.


//Example 1:
//
//Input: [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//             Total amount you can rob = 1 + 3 = 4.



//make a main
    // make a robber object
    //make a list to pass as test data and comment the expected return for the test
    // use object to call the function and print the return

//make a function that takes in a list of ints and returns an int of max value to steal from non adjacent homes
    //make int output var
    //if the list < 2 elements  or null return 0
    //else
        //step through the list at interval of 2
            //make a sum with elements
            //if the temp number > output, output = temp


// return temp

import org.w3c.dom.html.HTMLObjectElement;

import java.util.ArrayList;
import java.util.List;

public class Robber {

    public int robMostHouses(List<Integer> Houses){
        int output =0;
        if(Houses.size()<2 || Houses == null){
            return output;
        }else{
            int numOfRuns = Houses.size()/3;
            for(int j=0;j<Houses.size();j++) {
                int i = j;
                int temp = 0;
                while (i < Houses.size()) {
                    temp = temp + Houses.get(i);
                    i += 2;
                    if (temp > output) {
                        output = temp;
                    }
                }
            }
        }

        return output;
    }

    public static void main(String[] args){
        List<Integer> ListOfHouses = new ArrayList<Integer>();
        ListOfHouses.add(1);
        ListOfHouses.add(5);
        ListOfHouses.add(3);
        ListOfHouses.add(2);
        ListOfHouses.add(1);

        Robber testCase = new Robber();


        System.out.println(testCase.robMostHouses(ListOfHouses));//return 7

        List<Integer> ListOfHouses2 = new ArrayList<Integer>();
        ListOfHouses2.add(1);
        ListOfHouses2.add(5);
        ListOfHouses2.add(3);
        ListOfHouses2.add(2);
        ListOfHouses2.add(10);
        System.out.println(testCase.robMostHouses(ListOfHouses2));//return 14


        List<Integer> ListOfHouses3 = new ArrayList<Integer>();
        ListOfHouses3.add(1);

        System.out.println(testCase.robMostHouses(ListOfHouses3));//return 0


        List<Integer> ListOfHouses4 = new ArrayList<Integer>();
        ListOfHouses4.add(1);
        ListOfHouses4.add(5);
        ListOfHouses4.add(3);
        ListOfHouses4.add(2);
        ListOfHouses4.add(10);
        ListOfHouses4.add(10);
        ListOfHouses4.add(10);
        ListOfHouses4.add(10);
        System.out.println(testCase.robMostHouses(ListOfHouses4));//return 27

    }

}
