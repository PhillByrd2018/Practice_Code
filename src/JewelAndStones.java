//You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
// Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.


//make a main
    //instance of object
    //create 2 input test string
    //use object to call the function and pass test input

//make a function that takes in 2 strings(stonesThatAreJewels and Stones you have), then returns the number of stones
//you have that are jewels

    //create an output that tracks the number of correct matches
    //check that both inputs are none empty
    //then use nested for loop to step through the two inputs and compare i & j
    //if [i]==[j]
        //output++

    //return output


public class JewelAndStones {

    public int checkThoseJewels(String jewelInput, String stoneInput){
        int output=0;
        if(jewelInput.equals("") || stoneInput.equals("")){
            return 0;
        }else{
            for(int i =0;i<jewelInput.length();i++){
                for(int j=0; j<stoneInput.length();j++){
                    if(jewelInput.charAt(i)==stoneInput.charAt(j)){
                        output++;
                    }
                }
            }
        }

        return output;
    }

    public int CheckThoseJewwlsCONS(String jewelInput, String stoneInput){
        int output=0;
        if(jewelInput.equals("") || stoneInput.equals("")){
            return 0;
        }else{
            int n=0;
            while(n<jewelInput.length()){
                String temp = jewelInput.substring(n,n+1);
                if(stoneInput.contains(temp)){
                    output++;
                }
                n++;
            }

        }


        return  output;
    }

public static void main (String[] args){

    JewelAndStones testCase = new JewelAndStones();

    String testJewels = "IBbpz";
    String testStones = "BBZiIpTYU";
    System.out.println(testCase.checkThoseJewels(testJewels,testStones)); //should return 4

    String testJewels5 = "IBbpz";
    String testStones5 = "BBZiIpTYU";
    System.out.println(testCase.CheckThoseJewwlsCONS(testJewels5,testStones5)); //should return 4

////////////////////////////////////////////////////////////////////////////////
    String testJewels2 = "axviof";
    String testStones2 = "AXCIOTY";
    System.out.println(testCase.checkThoseJewels(testJewels2,testStones2)); //should return 0

    String testJewels6 = "axviof";
    String testStones6 = "AXCIOTY";
    System.out.println(testCase.CheckThoseJewwlsCONS(testJewels6,testStones6)); //should return 0


    /////////////////////////////////////////////////////////////////////////////////////////

    String testJewels3 = "IBbpz";
    String testStones3 = "Iqrqrqrqrqrqr";
    System.out.println(testCase.checkThoseJewels(testJewels3,testStones3)); //should return 1

    String testJewels7 = "IBbpz";
    String testStones7 = "Iqrqrqrqrqrqr";
    System.out.println(testCase.CheckThoseJewwlsCONS(testJewels7,testStones7)); //should return 1


    ///////////////////////////////////////////////////////////////////////////////////////////

    String testJewels4 = "";
    String testStones4 = "Iqrqrqrqrqrqr";
    System.out.println(testCase.checkThoseJewels(testJewels4,testStones4)); //should return 0

    String testJewels8 = "";
    String testStones8 = "Iqrqrqrqrqrqr";
    System.out.println(testCase.CheckThoseJewwlsCONS(testJewels8,testStones8)); //should return 0




}
}
