//this class will ask a user if it wants to print the word java and the print it in the big format

//make a main in the class
//ask the user if they want to print
//scanner
//check input
//call function to write if == yes
//else
//ask them why not?

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Spell_Java {

    public void makeThatJavaOutput(){


        ///////////////////////////////////////////////////////////////////
        System.out.println("Would you like to print the word Java?");
        System.out.println("Y- yes || N- no ");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.next();

        while(!answer1.equals("y") && !answer1.equals("Y") && !answer1.equals("n") && !answer1.equals("N") ) {


            answer1 = scanner.next();
            if(answer1.equals("n") || answer1.equals("N")){
                System.out.println("Fine...");
                System.out.println("Have a nice day.");
                return;

            }
            System.out.println("Sorry not a valid entry");
            System.out.println("Try Again");

        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("java");
        ///////////////////////////////////////////////////////////////////

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Would you like to print the word Java... but BIGGER this time?");
        String answer2 = scanner.next();



        while(!answer2.equals("y") && !answer2.equals("Y") && !answer2.equals("n") && !answer2.equals("N") ) {

            answer2 = scanner.next();

            if(answer2.equals("n") || answer2.equals("N") ){
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Fine...");
                System.out.println("Have a nice day.");
                break;
            }

            System.out.println("Sorry not a valid entry");
            System.out.println("Try Again");

    }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("JAVA");
        ///////////////////////////////////////////////////////////////////
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Last Question....");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Would you like to print Java but this time....");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("EVEN BIGGER!?");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String answer3 = scanner.next();
        while(!answer3.equals("y") && !answer3.equals("Y") && !answer3.equals("n") && !answer3.equals("N") ) {

            answer3 = scanner.next();

            if(answer3.equals("n") || answer3.equals("N") ){
                System.out.println("Oh really...");
                System.out.println("Too bad");
                System.out.println("You are getting it anyway.");

            }

            System.out.println("Sorry not a valid entry");
            System.out.println("Try Again");

        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("      J       a       V       V       a       ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("      J      a a       V     V       a a      ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("      J     a   a       V   V       a   a     ");try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("  J   J    aaaaaaa       V V       aaaaaaa    ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("   J J    a       a       V       a       a   ");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

public static void main (String[] args){

        Spell_Java testCase = new Spell_Java();

    try {
        TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("Starting test in...");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("3..");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("2..");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println("1..");
    try {
        TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        testCase.makeThatJavaOutput();

}
}

