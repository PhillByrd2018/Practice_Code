import java.util.*;
public class ListOfCountries {

    //given a list of countries,
    // make a function that returns a list of all minimum listed countries

    //make a main
    //make a list that holds all the countries
    //call the function and pass the list

    //in function
        //create a hash map
        //create a 'Clean' list that only holds one copy of each country
        //create an output list
    /////////////////////////////////////////////////////////////////////
    //load the list into the hashmap
        //check that the length of list <2
            //return list
        //else
            //step through the input list
                //if the string is not in the hashmap
                    //add it to hashmap
                //else
                    //increase the value where the key is stored.

//////////////////////////////////////////////////////////////////////
    //find the min values

        //step through the hashmap and compare the values stored there with a min value
            //if value is less than min
                //switch them

//////////////////////////////////////////////////////////
    //prepare the output list to return

    //step through the hashmap the number of times there are elements in the cleanlist
        //add any element to the output list if the hashmap value is == min

    //return the list

    public List<String> minCountries(List<String> inputList){

        List<String> outputList = new ArrayList<String>();
        List<String> cleanList = new ArrayList<String>();
        Map<String, Integer> mapOfCountries = new HashMap<String,Integer>();

        if(inputList.size()<2){
            return inputList;
        }



        for(int i=0;i<inputList.size();i++){
           if(mapOfCountries.get(inputList.get(i))==null){
               mapOfCountries.put(inputList.get(i),1);
           }else{
               mapOfCountries.put(inputList.get(i),mapOfCountries.get(inputList.get(i))+1);
           }
        }

        for(int p=0;p<inputList.size();p++){
            if(!cleanList.contains(inputList.get(p))){
                cleanList.add(inputList.get(p));
            }
        }
        System.out.println("This is the clean list: "+ cleanList);

        int min =mapOfCountries.get(inputList.get(0));
        for(int y=0;y<mapOfCountries.size();y++){
            if(mapOfCountries.get(cleanList.get(y))<min){
                min=mapOfCountries.get(cleanList.get(y));

            }
        }

        for(int q=0;q<mapOfCountries.size();q++){
            if(mapOfCountries.get(cleanList.get(q))==min){
                outputList.add(cleanList.get(q));
            }
        }

        System.out.println("This is the min: "+min);

        return outputList;
    }





    public static void main(String[] args){


        List<String> ListOfCountriesTooSmall = new ArrayList<String>();
        ListOfCountriesTooSmall.add("Italy");
        ListOfCountriesTooSmall.add("Italy");
        ListOfCountriesTooSmall.add("Italy");
        ListOfCountriesTooSmall.add("Italy");
        ListOfCountriesTooSmall.add("Italy");
        ListOfCountriesTooSmall.add("Mexico");




        List<String> ListOfCountries = new ArrayList<String>();
        ListOfCountries.add("France");
        ListOfCountries.add("Germany");
        ListOfCountries.add("France");
        ListOfCountries.add("United States");
        ListOfCountries.add("Canada");
        ListOfCountries.add("Canada");
        ListOfCountries.add("Germany");
        ListOfCountries.add("United States");
        ListOfCountries.add("Chile");

        ListOfCountries testCase = new ListOfCountries();
        System.out.println(testCase.minCountries(ListOfCountries));
        System.out.println(testCase.minCountries(ListOfCountriesTooSmall));

    }
}
