
//Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
//
//Return the number of different transformations among all words we have.


//List of Arrays ([".-","-...","-.-.","-..","."|,"..-."|,"--."|,"...."|,".."|,".---"|,"-.-"|,
// ".-.."|,"--"|,"-."|,"---"|,".--."|,"--.-"|,".-."|,"..."|,"-"|,"..-"|,"...-"|,".--"|,"-..-"|,"-.--"|,"--.."])


//make a main
    //make test strings and comment the expected return value
    //make an object
    //use object to call function and pass the test values. Print the return



//make a function that takes in a string and returns a morse code of the string
    //make an output string initialized to ""
    //if the input is empty or null return an empty string
    //if the string is nonAlpha return error string
    //else
        //step through the string and


//make a function that takes in  a character and returns a string that is the morse code conversion.
    //use the hashmap to look through the keys and match the input and return the values stored there


import java.util.HashMap;
import java.util.regex.*;

public class MorseCode {

    public String toMorseCode(String input){
        String output="";
        //System.out.println(Pattern.matches( "\\d" ,input.substring(0,input.length()-1)));

        if(input.equals("") || input==null){
            return "Sorry, the string is empty or null. Pass a nonempty string to get morse code";
        }else if(Pattern.matches( "\\d" ,input.substring(0,input.length()-1))){

        }else{
            for(int i =0;i< input.length();i++) {
                String lookup = input.substring(i,i+1);
                if (Pattern.matches( "\\d" ,lookup)) {
                    return "Sorry, the string can not have numbers in it. Pass a nonempty string with characters only to get morse code";
                }
            }
            input = input.toLowerCase();
            for(int i =0;i< input.length();i++){
                char passToFunction=input.charAt(i);
                output+=codeMap(passToFunction) + "    ";
            }

        }
        return output;
    }

    public String codeMap(char inputChar){
        String output = "";

        HashMap<Character,String> MorseCode = new HashMap<Character,String>();
        MorseCode.put('a',".-");
        MorseCode.put('b',"-...");
        MorseCode.put('c',"-.-.");
        MorseCode.put('d',"-..");
        MorseCode.put('e',".");
        MorseCode.put('f',"..-.");
        MorseCode.put('g',"--.");
        MorseCode.put('h',"....");
        MorseCode.put('i',"..");
        MorseCode.put('j',".---");
        MorseCode.put('k',"-.-");
        MorseCode.put('l',".-..");
        MorseCode.put('m',"--");
        MorseCode.put('n',"-.");
        MorseCode.put('o',"---");
        MorseCode.put('p',".--.");
        MorseCode.put('q',"--.-");
        MorseCode.put('r',".-.");
        MorseCode.put('s',"...");
        MorseCode.put('t',"-");
        MorseCode.put('u',"..-");
        MorseCode.put('v',"...-");
        MorseCode.put('w',".--");
        MorseCode.put('x',"-..-");
        MorseCode.put('y',"-.--");
        MorseCode.put('z',"--..");


        output =MorseCode.get(inputChar);

        return output;

    }


    public static void main(String[] args){
        String test1 = "apple";//some morse code
        String test2 = "league";//morse code
        String test3 = "3eague";//error
        String test4 = "";//error
        String test5 = "Barrel";//some morse code

        MorseCode testCase = new MorseCode();

        System.out.println(testCase.toMorseCode(test1));
        System.out.println(testCase.toMorseCode(test2));
        System.out.println(testCase.toMorseCode(test3));
        System.out.println(testCase.toMorseCode(test4));
        System.out.println(testCase.toMorseCode(test5));

    }

}
