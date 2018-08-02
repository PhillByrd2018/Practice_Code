// Use a for loop and print numbers 1-100
//check at each step to see if number is multi of 3 or 5

//if 3 fizz
//if 5 Buzz
//if both FizzBuzz


//make a main
    //make an object
    //use object to call the function

//make a function that takes in a number and performs the fizzbuzz mechanic
    //if number is less than 1 return 0 (break case)
    //else if(num%3=0 && num %5==0)
        //return num + FizzBuzz + FUN(num-1)
    //else if(n%3=0)
        //return num + Fizz + FUN(num-1)
    //else if(n%5=0)
        //return num + Buzz + FUN(num-1)
    //else
        //return num +FUN(num - 1)

public class RecurBuzzFizz {

    public int ReCurCur(int num){
        if(num<1){return 0;}
        else if(num%5==0 && num%3==0){
            System.out.println(num + " FizzBuzz");
            return ReCurCur(num-1);
        }else if(num%5==0){
            System.out.println(num + " Buzz");
            return ReCurCur(num-1);
        }else if(num%3==0){
            System.out.println(num + " Fizz");
            return ReCurCur(num-1);

        }else{
            System.out.println(num);
            return ReCurCur(num-1);
        }
    }

    public static void main(String[] args){
        RecurBuzzFizz testCase = new RecurBuzzFizz();
        int test=100;
        testCase.ReCurCur(test);

    }
}
