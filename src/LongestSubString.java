//make a main
    //make a test object
    //make a test string
    //use object to call substring function and pass test string

//make a function that takes in a string and returns a string that is the longest non repeating substring in that input.
    //create and output string
    //if the string is less than 2
        //return that string
    //else
        //step through the string with nested forloops i & i+1
            //compare the char at i with i+1
            //if they are not the same i+1++
            //else
                //if new string is > old output
                    //substring from i, i+1

    //return output


//return output

import java.sql.SQLSyntaxErrorException;
import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public String findTheString(String input){


    int n =input.length();
            String output="";
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0;
        int j = 0;

        while (i<n&&j<n){
            if(!set.contains(input.charAt(j))){
                set.add(input.charAt(j++));
                ans=Math.max(ans,j-i);
            }else{
                if(set.toString().length() > output.length()) {
                    output = set.toString();
                }
                set.remove(input.charAt(i++));

            }

        }
        //System.out.println(output);
        return output;


    }

    public static void main(String[] args){

        String test = "abcabcbb";
        LongestSubString testCase = new LongestSubString();
        System.out.println(testCase.findTheString(test));

        String test2 = "bbbbb";
        System.out.println(testCase.findTheString(test2));

        String test3 = "pwwkew";
        System.out.println(testCase.findTheString(test3));





    }

}
