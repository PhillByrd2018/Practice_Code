//Given a string S
    //Non empty HH:MM
    //What was the last time that could be displayed using the same subset of digits

//make a main
    //make a test string and comment an expected
    //make an object
    //use object to call function and pass the string

//make a function that takes in a string and returns a string that is a new combination of the input or ""
    //make an output variable
    //if the string is null or empty
        //return ""

    //replace the ":"

//step through the string and copy that element 4 times J
    //step through the string and copy that element 4 times I
        //temp iX4
        //if i=4 && temp.parseInt - input.parseInt < min
            //output =temp



//string front = output.sub(0,2)
//string back = output.sub(2,4)
//output= front + ":" + back;

//return output





public class GoogleClock {

    public String lastTime(String input){
        String output="";

        if(input.length()<1 || input==null){
            return output;
        }


        input = input.replace(":","");
        System.out.println(input);
        int min = Integer.parseInt(input,10);
        String temp = "";

//////////////////////////////////////////////////////////////////
        //here is the arranging bit that is currently not working
        
        for(int i=0;i<input.length();i++){
            for(int j=0;j<input.length();j++){
                temp += input.charAt(j);
            }
            if(Integer.parseInt(temp)-Integer.parseInt(input)<min){
                output=temp;
            }
        }


        System.out.println(output);

        String front = output.substring(0,2);
        String back = output.substring(2,4);

        output = front + ":" + back;

        return output;
    }

public static void main(String[] args){
    String test = "11:01";//returns 11:00
    GoogleClock testCase = new GoogleClock();
    System.out.println(testCase.lastTime(test));

}
}
