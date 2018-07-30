//Given a binary tree return an int that is the MAX Depth of Binary Tree

//make a main
//make a MAXBInTree object
//make a binary tree to test
//use object to call the function and pass the test tree
// print the return

//make a function that takes in a tree root and returns an int of the MAX depth
//if the root is null return 0
//else
//if(root.left!=null && root.right!=null){return Math.min(FUN(root.left), root.right))+ 1 }
//else{return minDepth(root.left != null ? root.left : root.right)+ 1}


public class MaxBinaryTree {

    public int checkMaxBin(TreeNode root){

        if(root == null){return 0;}

        if(root.left!= null && root.right!=null){
            return Math.max(checkMaxBin(root.left),checkMaxBin(root.right))+1;
        }else{
            return checkMaxBin(root.left != null ? root.left : root.right) + 1;
        }
    }
    public static void main (String[] args){

        TreeNode test = new TreeNode(5);
        test.setLeft(4);
        test.setRight(2);
        TreeNode test2R = test.getRight();
        test2R.setLeft(1);
        test2R.setRight(7);
        TreeNode test3R = test2R.getRight();
        test3R.setLeft(3);
        test3R.setRight(3);

        MaxBinaryTree testCase = new MaxBinaryTree();


        System.out.println(testCase.checkMaxBin(test));//returns 4


        TreeNode test5 = new TreeNode(5);
        test5.setLeft(4);
        test5.setRight(2);
        TreeNode test5R2 = test5.getRight();
        test5R2.setLeft(1);
        test5R2.setRight(7);
        TreeNode test5R3 = test5R2.getRight();
        test5R3.setLeft(3);
        test5R3.setRight(3);
        TreeNode test5R4 = test5R3.getRight();
        test5R4.setLeft(9);
        test5R4.setRight(17);

        System.out.println(testCase.checkMaxBin(test5));//return 5



    }
}
