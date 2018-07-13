import java.util.ArrayList;
import java.util.List;

public class Combine2Lists {
    //given two list combine them into 1 that stays in order and alternative

    //create a main
    //create a list of ints
    //create a list of chars
    //create a function call that pass both list to combine them into 1

    //create new output list of object type
    //check to make sure that list > 0
        //return empty list if false
    //else step through both lists with while loop that checks to see if there are still elements in both lists
        // and add the elements to the new list at i and i+1
    //return output list

    public List<Object> alternate(List<Integer> intInput, List<Character> charInput){
        List<Object> output = new ArrayList<Object>();

        if(intInput.size()<1 || charInput.size()<1){
            output.add("List too small");
            return output;
        }else{
            int list1Len=intInput.size();
            int list2Len=charInput.size();

            int i=0;
            int j=0;
            while(list1Len>0 && list2Len>0){
                output.add(intInput.get(i));
                output.add(charInput.get(j));
                list1Len--;
                list2Len--;
                i++;
                j++;
            }

        }
        return output;
    }

public static void main(String[] args){

    List<Integer> listOfInts = new ArrayList<Integer>();
    listOfInts.add(1);
    listOfInts.add(2);
    listOfInts.add(3);
    listOfInts.add(4);
    listOfInts.add(5);

    List<Character> listOfChars = new ArrayList<Character>();
    listOfChars.add('a');
    listOfChars.add('b');
    listOfChars.add('c');
    listOfChars.add('d');
    listOfChars.add('e');

    Combine2Lists testCase = new Combine2Lists();
    System.out.println(testCase.alternate(listOfInts,listOfChars));


}

}

