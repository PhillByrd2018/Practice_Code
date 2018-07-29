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

    public TreeNode getLeft(){
        if(this.left!=null) {
            return this.left;
        }else{
            return null;
        }
    }
    public TreeNode getRight(){
        if(this.right != null) {
            return this.right;
        }else{
            return null;
        }
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

    public void showTree(){
        System.out.println("  "+this.getValue()+" ");

            System.out.println(" / " + "\\");
            System.out.println(this.getLeft().getValue() + "   " + this.getRight().getValue());


    }
}
