import java.util.ArrayList;
import java.util.List;

public class HighestCombo {

    //given an array of ints return a number that is the highest possible number of all those ints

    //make a main
    //make a list of numbers in main
    //make a function that takes in a list of ints and returns an int

    //in function:
        //create a output int var
        //check to see if array size > 1
            //return the only number if true
        //else
            //step through array and divide each number by ten
                //nested loop i+1
                    //if i<j
                        //switch i & j


        //return output var

    //int[] test = new test[7];

    public String highestCom(List<Integer> input){
        String maxCombo="";
        if(input.size()<1){
            maxCombo = String.valueOf(input.get(1));

        }else{
            for(int i=0;i<input.size();i++){
                for(int j=i+1;j<input.size();j++){
                    
                    if(input.get(i)/10 < input.get(j)/10){
                        int temp = input.get(i);
                        input.set(i,input.get(j));
                        input.set(j,temp);
                    }
                }

            }
        }
        for(int y =0;y<input.size();y++){
            maxCombo+=input.get(y);

        }

        return maxCombo;
    }

    public static void main(String[] args){

        List<Integer> listOfNums = new ArrayList<Integer>();
        listOfNums.add(67);
        listOfNums.add(2);
        listOfNums.add(45);
        listOfNums.add(3);
        listOfNums.add(89);
        listOfNums.add(13);

        HighestCombo testCase = new HighestCombo();

        System.out.println(testCase.highestCom(listOfNums));
        System.out.println(2/10);

    }
}
