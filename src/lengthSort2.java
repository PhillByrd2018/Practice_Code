import java.util.*;
public class lengthSort2 {

    //sort a list of string by length

    //make a list of words
    //make a function
    //make a call to the function and pass the list

    //check the length of the list
        // and return the list if < 2
    //else
    //set through the list
        //check the length of string at i
        //check the length of the string at i+1
            //if length of word i+1 > i
                //switch i & j
                    //temp = i
                    //i=j
                    //j=temp

    //return sorted list

    public List<String> sortList(List<String> unsortedList){

        if(unsortedList.size()<2){
            return unsortedList;
        }else{
            for(int y=0;y<unsortedList.size();y++){
                for(int i=y+1;i<unsortedList.size();i++){

                    if(unsortedList.get(y).length()>unsortedList.get(i).length()){
                        String temp = unsortedList.get(i);
                        unsortedList.set(i,unsortedList.get(y));
                        unsortedList.set(y,temp);


                    }
                }
            }

        }
        return unsortedList;
    }


    public static void main(String[] args) {

        List<String> unsortedWords = new ArrayList<String>();
        unsortedWords.add("pie");
        unsortedWords.add("money");
        unsortedWords.add("crowned");
        unsortedWords.add("run");
        lengthSort2 test= new lengthSort2();

        System.out.println(test.sortList(unsortedWords));




    }
}
