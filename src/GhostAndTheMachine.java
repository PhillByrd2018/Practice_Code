//You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is (target[0], target[1]).
// There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).
//
//Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions:
// north, east, west, or south, going from the previous point to a new point 1 unit of distance away.
//
//You escape if and only if you can reach the target before any ghost reaches
// you (for any given moves the ghosts may take.)  If you reach any square (including the target) at the same
// time as a ghost, it doesn't count as an escape.
//
//Return True if and only if it is possible to escape.



//make a main
    //make a test variable List<List>
        //one true expected
        //one false expected
    //make an object
    //use the object to call the function, pass the test value list


//make a function that takes in a list of lists & a target position || and returns a boolean based on
// if a pacman ghost can catch you before you can leave.

//Example 1:
//Input:
//ghosts = [[1, 0], [0, 3]]
//target = [0, 1]
//Output: true
//Explanation:
//You can directly reach the destination (0, 1) at time 1, while the ghosts located at (1, 0) or (0, 3) have no way to catch up with you.


import java.util.ArrayList;
import java.util.List;

public class GhostAndTheMachine {

    List<Integer> pacmanLocay = new ArrayList<>();
    List<Integer> ghostLocay = new ArrayList<>();

    //this function tells me how many moves until pacman reaches his target
    public int pacmanMoves(List<Integer> target){
        int numOfmoves = 0;
        //counts the steps to get to the target
        for(int i=target.get(0);i>0;i--){
            numOfmoves++;
        }
        for(int i=target.get(1);i>0;i--){
            numOfmoves++;
        }
        return numOfmoves;
    }

    //this function tells me how many moves the ghost has to reach pacman
    public int ghostMoves(List<Integer> pacmanLocaytarget, List<Integer> ghostLocay){
        int numOfmoves = 0;
        //counts the steps to get to the target
        for(int i=ghostLocay.get(0);i>pacmanLocaytarget.get(0);i--){
            numOfmoves++;
        }
        for(int i=ghostLocay.get(1);i>pacmanLocaytarget.get(1);i--){
            numOfmoves++;
        }
        return numOfmoves;

    }



////////////////////////////////////////////////////////////////////////////////

    //this function sets the pacman location array
    public List<Integer> pacmanLocation(){

        pacmanLocay.add(0);
        pacmanLocay.add(0);

        return pacmanLocay;
    }

    //this function sets the ghost location array
    public List<Integer> ghostLocation(int Ghostx, int Ghosty){

        ghostLocay.add(Ghostx);
        ghostLocay.add(Ghosty);

        return ghostLocay;
    }


////////////////////////////////////////////////////////////////////////////////


    //this function will return true if pacman can escape or false if he can not
    public boolean pacMan(List<List<Integer>> ghostList, List<Integer> target) {

        boolean didpacmanmakeIt = true;

        //set the array for the ghosts and pacman
        pacmanLocation();
        ghostLocation(ghostList.get(0).get(0),ghostList.get(0).get(1));

        //////do this for every ghost/////////
        //ghostLocation();
        ///////////////////////////



        //now we loop the number of moves that pacman makes

        int numOfMovesPAC = pacmanMoves(target);
        while(numOfMovesPAC>0 && didpacmanmakeIt==true) {
            int numOfMovesGhost = ghostMoves(pacmanLocay, ghostLocay);

            if (numOfMovesPAC < numOfMovesGhost) {
                numOfMovesPAC--;
            }else{
                didpacmanmakeIt=false;
            }

        }




        return didpacmanmakeIt;


    }


    public boolean escapeGhosts(int[][] ghosts, int[] t) {
        int d = Math.abs(t[0]) + Math.abs(t[1]);
        for (int[] g: ghosts)
            if (d >= Math.abs(t[0] - g[0]) + Math.abs(t[1] - g[1]))
                return false;
        return true;
    }



///////////////////////////////////////////////////////////////////////////////


    public static void main(String[] args){

        int[][] ghosts = new int[1][2];
        ghosts[0][0]=4;
        ghosts[0][1]=4;
        int[] target = new int[2];
        target[0]=0;
        target[1]=1;

        GhostAndTheMachine testCase = new GhostAndTheMachine();
        System.out.println(testCase.escapeGhosts(ghosts,target));















        List<Integer> testGhost = new ArrayList<Integer>();
        testGhost.add(2);
        testGhost.add(0);
//        List<Integer> testGhost2 = new ArrayList<Integer>();
//        testGhost2.add(0);
//        testGhost2.add(3);
//        List<Integer> testGhost3 = new ArrayList<Integer>();
//        testGhost3.add(1);
//        testGhost3.add(2);

        List<List<Integer>> test = new ArrayList<List<Integer>>();
        test.add(testGhost);
//        test.add(testGhost2);
//        test.add(testGhost3);



        //List<Integer> target = new ArrayList<Integer>();
        //target.add(0);
        //target.add(3);



        //GhostAndTheMachine testCase = new GhostAndTheMachine();
        //System.out.println(testCase.pacMan(test,target));





    }
}
