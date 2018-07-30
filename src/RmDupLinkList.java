
//Given a sorted linked list, delete all duplicates such that each element appear only once.


//make a main
    //make an object
    //make many test values to pass with expected returns in comments
    //use object to call function and pass the test data

//make a function that takes in a string and returns a string that is a linklist with no duplicates
    //make an out node
    //if the nodeINPUT is empty or null return empty string
    //else
        //add the first element of the INPUT to OUTPUT
        //while next nodeINPUT is not null
            //while next nodeOUTPUT is not null
                //if nodeValINPUT is not equal to nodeValOUTPUT add node in INPUT to OUTPUT

import java.sql.SQLSyntaxErrorException;

//return OUTPUT
public class RmDupLinkList {

    public Node NoDupsLinkList(Node input){


        if(input == null){
            return null;
        }else{
            Node output = input;
                while(output != null && output.next!=null){
                   if(output.next.value == output.value){
                       output.next = output.next.next;
                   }else{
                       output = output.next;
                   }

                }
            return output;

        }



    }

    public static void main(String[] args){


        Node test = new Node(1);


        Node test2 = new Node(2);
            test.setNext(test2);
        Node test3 = new Node(2);
            test2.setNext(test3);
        Node test4 = new Node(2);
            test3.setNext(test4);
        Node test5 = new Node(3);
            test4.setNext(test5);
        Node test6 = new Node(3);
            test5.setNext(test6);

            RmDupLinkList testCase = new RmDupLinkList();


            System.out.println("Before we Called the No Duplicated Method");
            Node head = test;
        while(test != null){
            System.out.print(test.getValue()+"->");
            test = test.next;
        }
            test =head;

           testCase.NoDupsLinkList(test);
        System.out.println();
            System.out.println("After we Called the No Duplicated Method");
            while(test != null){
                System.out.print(test.getValue()+"->");
                test = test.next;
            }

    }

}
