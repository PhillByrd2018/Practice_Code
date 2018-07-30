//Given a binary tree return an int that is the Minimum Depth of Binary Tree

//make a main
    //make a MinBInTree object
    //make a binary tree to test
    //use object to call the function and pass the test tree
    // print the return

//make a function that takes in a tree root and returns an int of the min depth
    //if the root is null return 0
    //else
        //if(root.left!=null && root.right!=null){return Math.min(FUN(root.left), root.right))+ 1 }
        //else{return minDepth(root.left != null ? root.left : root.right)+ 1}

import jdk.nashorn.api.tree.Tree;

public class MinBinaryTree {
    public int checkThatTree(TreeNode root){


        if(root == null){return 0;}

        if(root.left!= null&&root.right!=null){
            return Math.min(checkThatTree(root.left),checkThatTree(root.right))+1;
        }else{
            return checkThatTree(root.left != null ? root.left : root.right) + 1;
        }


    }


    public static void main(String[] args){

        MinBinaryTree testCase = new MinBinaryTree();

        TreeNode test = new TreeNode(5);
            test.setLeft(4);
            test.setRight(2);
            TreeNode test2R = test.getRight();
            test2R.setLeft(1);
            test2R.setRight(7);
            TreeNode test3R = test2R.getRight();
            test3R.setLeft(3);
            test3R.setRight(3);


        System.out.println(testCase.checkThatTree(test));//return 3


    }
}
