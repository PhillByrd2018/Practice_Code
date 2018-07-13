
import java.util.*;
public class Palindrome2 {
    //create an array list
    //add palindromes to the list
    //Pass list to function
    //check to see if empty, return false
    //function returns true if one of the words in the list is a palindrome
    //loop through each element in the list
    //make a copy of the element into a new array in reverse order
    //loop through both list and check to see if is palindrome.
    //return false if not, otherwise return true.

    public boolean testPalindrome (String s){

        if (s.length()==0){
            return false;

        }else if(s.length()==1){
            return true;
        }
        else{
            List<Character> palList = new ArrayList<Character>();
            for(char c : s.toCharArray()){
                palList.add(c);

            }
            List<Character> palList2 = new ArrayList<Character>();
            for(int t=palList.size()-1;t>=0;t--){
                palList2.add(palList.get(t));


            }
            for(int h=0;h<palList.size();h++){
                if(palList.get(h)!=palList2.get(h)){
                    return false;
                }

            }


        }


        return true;

    }


    public static void main(String[] args) {

        List<String> pos_Palindrome = new ArrayList<String>();
        pos_Palindrome.add("deed");
        pos_Palindrome.add("racecar");
        pos_Palindrome.add("Phill");
        pos_Palindrome.add("Anna");

        Palindrome2 test= new Palindrome2();
        for(int q=0;q<pos_Palindrome.size();q++) {
            System.out.println(test.testPalindrome(pos_Palindrome.get(q)));
        }


    }
}
