import java.io.*;
import java.util.*;

//given a list of countries, return a list of countries that appear
//the lease number of times
public class Interview2 {


    public List<String> countries(List<String> input){

        Map<String, Integer> output = new HashMap<String, Integer>();

        //check to see if input list is large enough
        if(input.size()<=2){
            return input;
        }else{
            for(int i=0;i<input.size();i++){
                if(output.get(input.get(i)) == null){
                    //if it is not in the hashmap add it to the key and set
                    //value at 1
                    output.put(input.get(i),1);
                }else{
                    //increase the value with that key
                    output.put(input.get(i),(output.get(input.get(i))+1));
                }
            }
        }

        List<String> inputClean = new ArrayList<String>();
        for(int u = 0;u<input.size();u++){
            if(!inputClean.contains(input.get(u))){
                inputClean.add(input.get(u));
            }

        }

        //create a list to return
        List<String> returnList = new ArrayList<String>();
        //create a min value to check the map
        int min=output.get(inputClean.get(1));
        //step through the map and find the min value
        for(int y=0;y<output.size();y++){
            if(output.get(inputClean.get(y))<min){
                min=output.get(inputClean.get(y));
            }
        }

        //find all values with min count and add to output list
        for(int y=0;y<output.size();y++){

            if(output.get(inputClean.get(y)) == min && !returnList.contains(inputClean.get(y))){
                returnList.add(inputClean.get(y));
            }
        }
        //return list of min count countries
        return returnList;
    }


    public static void main (String[] args) {
        List<String> listOfCon = new ArrayList<String>();
        listOfCon.add("Argentina");
        listOfCon.add("Cuba");
        listOfCon.add("Chile");
        listOfCon.add("Argentina");
        listOfCon.add("Argentina");
        listOfCon.add("Chile");
        listOfCon.add("America");
        listOfCon.add("Cuba");
        listOfCon.add("Cuba");
        listOfCon.add("America");
        listOfCon.add("France");



        Interview2 testCase = new Interview2();
        System.out.println(testCase.countries(listOfCon));
    }
}

