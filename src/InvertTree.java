//invert a tree

//make a make
    //make a test tree to pass into function and record the expected output
    //make an object
    //use object to call function and print the return against the expected output


//assume that the tree is balanced

//make a function that takes in a root node and returns a tree that has been inverted
//in function
    //if the node is null or empty return null
    //if the node has no children return the node
    //else
        //print the original node
        //then step to the left most node and swap it with the right most node.
        //make i & j -- until you reach the root and stop



public class InvertTree {

    public void invertTree(TreeNode inputTree){

        if(inputTree==null){
            return;
        }

        TreeNode temp = inputTree.right;
        inputTree.right = inputTree.left;
        inputTree.left = temp;

        invertTree(inputTree.left);

        invertTree(inputTree.right);


    }


    public static void main (String[] args){

        TreeNode testTree = new TreeNode(4);
        testTree.setLeft(2);
        testTree.setRight(7);
        InvertTree testCase = new InvertTree();
        System.out.println("This is the tree before: ");
        testTree.showTree();
        testCase.invertTree(testTree);
        System.out.println("This is the tree after: ");
        testTree.showTree();



//        TreeNode testLeftLvL2 = testTree.getLeft();
//        TreeNode testRightLvL2 = testTree.getRight();
//        testLeftLvL2.setLeft(1);
//        testLeftLvL2.setRight(3);
//        testRightLvL2.setLeft(6);
//        testRightLvL2.setLeft(9);
//        testTree.showTree(testTree);





    }

}
