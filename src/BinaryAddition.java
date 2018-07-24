//Given two binary strings, return their sum (also a binary string).
//The input strings are both non-empty and contains only characters 1 or 0.

//make a main
    //make 2 string that are binary numbers
    //make an object
    //use object to call the binary addition function and print the results

//write a function that takes in 2 string and return a string that is the sum of those 2 binary numbers
    //check that both string are non empty
        //if they are return an empty string
    //else
        //use a for loop to step through the



public class BinaryAddition {

    public String add2binary(String input1, String input2){
        int output =0;

        System.out.println(input1);
        System.out.println("+");
        System.out.println(input2);


        System.out.println("-----------------------------------");

        int number0 = Integer.parseInt(input1, 2);
        int number1 = Integer.parseInt(input2, 2);

        output = number0+number1;

        System.out.println(Integer.toBinaryString(output));

        System.out.println(number0);
        System.out.println("+");
        System.out.println(number1);
        System.out.println(Integer.toString(output));

        return Integer.toBinaryString(output);
    }



    public static void main(String[] args){


        String test1 = "101010";
        String test2 = "111000";

        BinaryAddition testCase = new BinaryAddition();
        System.out.println(testCase.add2binary(test1,test2));

    }

}

