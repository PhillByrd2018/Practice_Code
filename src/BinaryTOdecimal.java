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
        if(input.length()>7){
            System.out.println("Sorry, you need to have no more than six positions!");
            return 0;
        }else{

            for(int i = input.length()-1;i>0;i--){
                if(input.charAt(i) == '1'){
                    output+= Math.pow(2,i);
                }
            }

        }
        return output;
    }

    public static void main(String[] args){

        String test = "100101";
        BinaryTOdecimal testCase = new BinaryTOdecimal();
        System.out.println(testCase.BinTODec(test));
    }

}
