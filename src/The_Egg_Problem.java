//A building has 100 floors. One of the floors is the highest floor an egg can be dropped from without breaking.
//
//If an egg is dropped from above that floor, it will break. If it is dropped from that floor or below, it will be completely undamaged and you can drop the egg again.
//
//Given two eggs, find the highest floor an egg can be dropped from without breaking, with as few drops as possible.


//make a main
//make an object
//call the function and pass it the floor number that is the limit for this problem

//in function
    //check that the floor number is in range
        //if not return 0
    //else
//

public class The_Egg_Problem {

    public int eggTest(int inputFloor){
        int output=-1;
        int numOfChecks=0;

        int numOfBrokenEggs=0;



        if(inputFloor <0 || inputFloor>100){
            return -1;
        }else{
            int midFloor = 50;
            while(numOfBrokenEggs<2){



                if(midFloor>inputFloor){
                    numOfBrokenEggs++;
                    midFloor=midFloor/2;

                }else{
                    midFloor+=midFloor/2;

                }
                numOfChecks++;

            }
        }
        System.out.println("This is the number of checks it took to find the right floor: "+numOfChecks);
        return output-1;
    }
    public static void main(String[] args){

        int floorTest = 79;
        The_Egg_Problem testCase = new The_Egg_Problem();
        System.out.println(testCase.eggTest(floorTest));


    }

}
