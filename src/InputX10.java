// this problem takes in a number and then prints a multiplication table.

//make a main
//make an input
//pass the input to a function
//sanitize the input
//return 0 if == 0 || # if = 1

    //loop 10 times and print the output at each iteration

import java.util.Scanner;

public class InputX10 {

    public void multiTable(int input){
        int total=0;
        if(input == 0){
            System.out.println("Please give a none 0 number");
    }else{

        for(int i =0;i<10;i++){
                System.out.println(i + "*" + input + "= " + (i*input));
                total+=(i*input);
            }
        }

        System.out.println("Would you like to know the sum of this table?");
        System.out.println("Y- Yes || N- No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();

        if(answer.equals("y") || answer.equals("Y")){
            System.out.println(total);
        }else{
            System.out.println("Fine then....");
        }


    }




    public static void main(String[] args) {

        System.out.println("Please enter a number to show the multiplication table: ");
        Scanner scanner = new Scanner(System.in);
        int scannerInput = scanner.nextInt();
        InputX10 testcase = new InputX10();
        testcase.multiTable(scannerInput);
        System.out.println("Have a great day!");

    }
}