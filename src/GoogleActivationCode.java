//given a string s and an int k make an activation code that is chunked into k characrters

//make a main
    //make an object
    //make 2 test strings and the int k to test out function
    //use the object to call the function and pass our test data

//make a function that takes in a string s and an int k and returns a correctly formatted activation code
    //create output string
    //if the string is null or empty
        //return ""
    //else if String length < k
        //return string uppercase
    //else
        //replace "-" "" in string
        //then step through the string beginning at the length-k and decrement by k

            //if i==0
                // output = S.substring(0,K) + output
            //else if i<k
                //output = s.sub(i,k)+ output
            //else
                //output = "-" + s.sub(i,k) + output;

//return output






public class GoogleActivationCode {

    public String MakeCode(String S, int K){
        String output="";

        if(S.equals("") || S == null){
            return output;
        }

        S=S.replace("-","");
       
        if(S.length()<K){
            return S.toUpperCase();
        }


        String returnString = "";
        for (int i = S.length() - K; i >= 0; i -= K) {
            if (i == 0) { // k=2 "rr-uu-tt-hh"
                returnString = S.substring(0, K) + returnString;
            } else if (i < K) {
                returnString = S.substring(0, i) + returnString;
            } else {
                returnString = "-" + S.substring(i, i + K) + returnString;
            }
        }

        return returnString.toUpperCase();
    }


    public static void main(String[] args){
     String test1 = "jfu-i975-8dnc"; //2
     String test2 = "jf-i97-8dn"; //4

     GoogleActivationCode testCase = new GoogleActivationCode();
     System.out.println(testCase.MakeCode(test1, 2)); //return "J-UF-I9-75-8D-NC"
     System.out.println(testCase.MakeCode(test2, 4)); //return "JFI9-78DN"


    }
}
