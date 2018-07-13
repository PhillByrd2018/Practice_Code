import java.util.ArrayList;
import java.util.List;

public class GoogleMock {


    //find the longest string of characters in a given string
    //
    //Pseudo:
    //pass the string to the function

    //check to see if it is null
        //return null

    //check to make sure it isn't empty
        //return null

    //check length and limits of the string x<5
        //return null

    //create a list
    //parse string into the list
    //create variable to hold longest continual char
    //use two for loops to check at position i & position j=i+1 to compare
    //if they are the same increment j until they are not the same
    //then store substring(i-j) in output variable
    //only replace the output variable if it is larger than it currently if

    // if there is more than one continue and save the return the output variable
    //break and return output variable

    public String conFinder(String input){
        String output="";
        if(input==null){
            return null;
        }else if(input.length()<=2){
            return input;
        }else{


            List<Character> conList = new ArrayList<Character>();

            for(int q=0;q<input.length();q++){
                conList.add(input.charAt(q));

            }

            ///////////////////////////////////

            for(int i=0;i<conList.size();i++){
                for(int j =i+1;j<conList.size();j++){
                    if(conList.get(i) != conList.get(j)){
                        String temp = input.substring(i, j);
                        if(output.length()<temp.length()) {
                            output = temp;
                        }

                        i=j;
                    }
                }
            }
        }
     return output;

    }


    public static void main(String[] args) {

        //brute Force approach
        ///////////////////////////////////////////////
        String testCase="hfjissnjicsuuuuuuuuuullllopwefbijvs";
        String aCase="a";
        String nCase="opopoogggggggggggjoincjinnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnny";
        String Google ="ababbbbbaasesseseg";
        GoogleMock test = new GoogleMock();
        System.out.println(test.conFinder(testCase));
        System.out.println(test.conFinder(aCase));
        System.out.println(test.conFinder(nCase));
        System.out.println(test.conFinder(Google));




    }

}