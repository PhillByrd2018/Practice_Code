//given a string with duplicate words return a string with no duplicates

//make a main
//make a string with duplicate words
//make a double words object
//call the cleaning function and then pass it the string

//check to see if the string is longer than 1
    //if not return the string

//else
    //parse the string into a list
    //then double loop step through comparing each element at i to i+1
        // if they are the same remove element at i+1

import java.util.*;

public class Double_Words {

public List<String> cleanString(String input){

    List<String> output = new ArrayList<String>();

    input.trim();
    input = input.replaceAll(".$","");
    StringTokenizer st = new StringTokenizer(input);
    while (st.hasMoreTokens()) {
        output.add(st.nextToken());
    }



    if(output.size()<1){
        return output;
    }else if(output.size()==1){
        return output;
    }else{
        for(int i =0;i<output.size();i++){
            for(int y=i+1;y<output.size();y++){
                if(output.get(i).toLowerCase().equals(output.get(y).toLowerCase())){
                    output.remove(y);
                }
            }
        }
        String test = "";
        for(int p=0;p<output.size();p++){
            test+=output.get(p).toUpperCase() + " ";
        }
        System.out.println(test);
        return output;
    }



}

    public static void main(String[] args){
        String test ="I Love i to PLAY play Magic I.";
        Double_Words testCase = new Double_Words();
        System.out.println(testCase.cleanString(test));

        System.out.println();
        test ="How how, now brown How. now cow cow";
        System.out.println(testCase.cleanString(test));

        System.out.println();
        test ="!I Love i to to to to PLAY play Magic I.";
        System.out.println(testCase.cleanString(test));

        System.out.println();
        test ="I Love i to PLAY play Magic I. In the the summer time time time when the the the weather is fine.";
        System.out.println(testCase.cleanString(test));


    }
}
