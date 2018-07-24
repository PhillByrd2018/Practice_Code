//This is the default class for a Tree


public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;


    TreeNode(int inputValue){
        this.value = inputValue;
    }


    public void setLeft(int inputValue){
        this.left = new TreeNode(inputValue);
    }

    public void setRight(int inputValue){
        this.right = new TreeNode(inputValue);
    }

    public int getValue(){
        return this.value;

    }
    public void setValue(int inputValue){
        this.value=inputValue;
    }
}
