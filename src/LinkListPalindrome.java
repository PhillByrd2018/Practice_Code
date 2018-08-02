//Given a singly linked list, determine if it is a palindrome.

//make a main
    //linked list, comment the expected return
    //make an object
    //use object to call the function

//make a function that takes in a linked list and return boolean on palindrome question.
    //


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkListPalindrome {

    public boolean isPal(Node startNode){

        Node temp = startNode;
        Stack stack = new Stack();

        while(temp != null){
           stack.push(temp.getValue());
           temp = temp.getNext();

        }

        while(startNode != null){
            if(startNode.getValue() != (int)stack.pop()){
                return false;
            }
            startNode = startNode.getNext();
        }



    return true;
    }

    public static void main (String[] args){

        Node testStart = new Node(1);
        Node testStart2 = new Node(2);
        testStart.setNext(testStart2);
        Node testStart3 = new Node(2);
        testStart2.setNext(testStart3);
        Node testStart4 = new Node(1);
        testStart3.setNext(testStart4);

        LinkListPalindrome testCase = new LinkListPalindrome();
        System.out.println(testCase.isPal(testStart));//return true


        Node testStart5 = new Node(1);
        Node testStart6 = new Node(9);
        testStart5.setNext(testStart6);
        Node testStart7 = new Node(2);
        testStart6.setNext(testStart7);
        Node testStart8 = new Node(1);
        testStart7.setNext(testStart8);

        System.out.println(testCase.isPal(testStart5));//return false

        Node testStart10 = new Node(1);
        System.out.println(testCase.isPal(testStart10));//return true

        Node testStart11 = new Node(1);
        Node testStart12 = new Node(9);
        testStart11.setNext(testStart12);

        System.out.println(testCase.isPal(testStart11));



    }

}
