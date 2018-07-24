//Given two binary trees, write a function to check if they are the same or not.
//
//Two binary trees are considered the same if they are structurally identical and the nodes have the same value.



//make a main
    //make an object of the treenodechecker type
    //make two identical trees to compare with our function
    //use the object to call the function and pass the 2 trees

//write a function that takes in 2 binary trees and return true if they are the same and false if they are not
    //check that the trees are the same length
        //if not return false
    //else
        //go the the left most node
        //check the values at both places, if they are not the same return true





public class TreeNodeChecker {

    public boolean checkTwoTrees(TreeNode inputTree1, TreeNode inputTree2){

        if(inputTree1 == null || inputTree2 == null){
            return inputTree1 == inputTree2;
        }

        if(inputTree1.getValue() != inputTree2.getValue()){
            return false;
        }






        return checkTwoTrees(inputTree1.getLeft(),inputTree2.getLeft()) && checkTwoTrees(inputTree1.getRight(),inputTree2.getRight());

    }

    public static void main(String[] args){

        TreeNode testTree1 = new TreeNode(3);
        TreeNode testTree2 = new TreeNode(3);

        testTree1.setLeft(1);
        testTree1.setRight(5);

        testTree2.setLeft(1);
        testTree2.setRight(5);



        TreeNodeChecker testCase = new TreeNodeChecker();

        System.out.println(testCase.checkTwoTrees(testTree1,testTree2));//returns true



        ///////////////////////////////////////////////////////////////////////////////

        TreeNode testTree3 = new TreeNode(3);
        TreeNode testTree4 = new TreeNode(3);

        testTree3.setLeft(1);
        testTree3.setRight(8);

        testTree4.setLeft(1);
        testTree4.setRight(5);
        System.out.println(testCase.checkTwoTrees(testTree3,testTree4));//returns false

    }

}
