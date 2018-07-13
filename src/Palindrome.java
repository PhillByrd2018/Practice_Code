import java.util.*;


public class Palindrome {

    public boolean isPalendrome(String s){
        if(s == null){
            return false;
        }
        if(s.length()==0){
            return false;
        }else if(s.length()==1){
            return true;

        }else{
            List<Character> palList = new ArrayList<Character>();
            for(char c : s.toCharArray()){
                palList.add(c);

            }
            List<Character> palList2 = new ArrayList<Character>();
            for(int i=palList.size()-1;i>=0;i--){
                palList2.add(palList.get(i));

            }
            for(int g=0;g<palList.size();g++){

                if(palList.get(g)!=palList2.get(g)){
                    return false;

                }
            }

        }

     return true;
    }

    public static void main (String[] args){

        //write a function that takes in a string and check to see if it a palindrome
        //  returns true if yes or false if not
        //
        // returns false if empty
        //assume only alphabetical


        // pseudo:
        //check string input size and return false if size=0
        //
        //return true for length =1
        //make an array list for string
        //length>1 parse string into an list
        //go through string backwards to add to new array
        // use for loop to loop through both arrays
        //if elements are not the same return false
        //return true

        String s = "deed";

        Palindrome test = new Palindrome();
        System.out.println(test.isPalendrome(s));


    }

}
