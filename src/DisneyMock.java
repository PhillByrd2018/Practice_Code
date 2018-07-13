import java.util.*;

public class DisneyMock {
    //given a non-0 string, count the frequency of each character and return the most frequent one.
    //create the hashmap
    //step the string and check if character is in map already,
    //if not add to map and set to 1
    //if yes increment value by 1
    //finish the loop
    //return the key with the highest value

    public char mostChar(String input){
        Map<Character,Integer> wordCountTable = new HashMap<Character,Integer>();
        for(int i=0;i<input.length();i++){
            if(!wordCountTable.containsKey(input.charAt(i))){
                wordCountTable.put(input.charAt(i),1);

            }else{
                int charCount = wordCountTable.get(input.charAt(i));
                wordCountTable.put(input.charAt(i),charCount+1);
            }

        }
        int max=0;
        char output=' ';
        /////////////////////////////////
        //make two arrays and pair them up to find the highest frequency character in the map
        /////////////////////

        List<Character> outputChar = new ArrayList<Character>();
        List<Integer> outputInt = new ArrayList<Integer>();

        for(char f : wordCountTable.keySet()){
            outputChar.add(f);

        }
        for(int y : wordCountTable.values()){
            outputInt.add(y);

        }
        for(int u=0;u<outputInt.size();u++){
            if(max<outputInt.get(u)){
                max=outputInt.get(u);
                output =outputChar.get(u);
            }
        }

        return output;
        //System.out.println(wordCountTable);

    }

    public static void main(String[] args) {

        String testCase ="hoenwurhdnmoajcncpajfhfjfpnkiiiiiiiqotutnvnoxjdbfnkskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        DisneyMock test = new DisneyMock();
        System.out.println(test.mostChar(testCase));
    }
}