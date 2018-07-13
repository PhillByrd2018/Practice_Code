import java.util.*;

public class BuzzFizz {

    // Use a for loop and print numbers 1-100
    //check at each step to see if number is multi of 3 or 5

    //if 3 fizz
    //if 5 Buzz
    //if both FizzBuzz
    public int RunBuzzFizz() {

        for (int i = 1; i < 101; i++) {


            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + "FizzBuzz");


            }
            else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");

            }  else {
                System.out.println(i);
            }

        }
        return 1;
    }


        public static void main (String[]args){

            BuzzFizz test = new BuzzFizz();
            test.RunBuzzFizz();
        }
    }
