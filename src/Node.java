//  I am following along with the plural site tutorial to learn about nodes and linked lists

public class Node {
    int value;
    Node next;


    Node(int value){
        this.value=value;
    }


    public int getValue(){
        return this.value;
    }
    public void setValue(int newValue){
        this.value = newValue;
    }




    public Node getNext(){
        return this.next;
    }
    public void setNext(Node newNode){
        this.next = newNode;
    }




    public static void main (String[] args){
        Node testNode1 = new Node(3);
        Node testNode2 = new Node(5);
        Node testNode3 = new Node(9);

        testNode1.setNext(testNode2);
        testNode2.setNext(testNode3);
        testNode2.setValue(4);

        System.out.println(testNode1.getNext().getValue());
        System.out.println(testNode2.getNext().getValue());


    }

}
