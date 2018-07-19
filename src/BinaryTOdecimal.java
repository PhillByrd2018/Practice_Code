//Write a Java program to convert a binary number to decimal number

//make a main
//make a binary number
//make an object
//call the function with object and pass the binary


//check that the binary number is correct
//loop through the number and use running total to add up the number


public class BinaryTOdecimal {

    public int BinTODec(String input){
        int output = 0;

            int powerNum=0;
            for(int i = input.length()-1;i>=0;i--){
                if(input.charAt(i) == '1'){
                    output+= Math.pow(2,powerNum);
                }
                powerNum++;
            }

        return output;
    }

    public static void main(String[] args){

        String test = "100101"; //37
        BinaryTOdecimal testCase = new BinaryTOdecimal();
        System.out.println(testCase.BinTODec(test));

        String test2 = "111001001"; //457
        System.out.println(testCase.BinTODec(test2));
    }

}
