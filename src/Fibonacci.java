import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    //create a function that return the first 100 numbers of the fibonacci sequence

    //create a main
    //create a function that will return the sequence in an array list
    //create a call to that function

    //in the function
    //create an array
        //create an output variable 0
        //create output a variable 1

        //use a forloop to interate 100 time
            //array(i) += array(i-1)+array(i)

        //return array

    public List<Integer> fibo(){
        List<Integer> output = new ArrayList<Integer>();
        output.add(0);
        output.add(1);
        for(int i=1;i<101;i++){
            output.add(output.get(i-1)+output.get(i));
        }


        return output;
    }

 public static void main (String[] args){
        Fibonacci testCase = new Fibonacci();

        System.out.println(testCase.fibo());
        System.out.println(9-(50%9));
 }
}
