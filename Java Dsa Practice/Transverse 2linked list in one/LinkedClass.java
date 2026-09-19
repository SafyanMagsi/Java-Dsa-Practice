class Node{
int data;
Node next;
Node(int data){
    this.data = data;
    }
}
public class LinkedClass{
    public static void main(String[] args) {
        Node a1 = new Node(4);
        Node a2 = new Node(8);
        Node a3 = new Node(12);
        Node a4 = new Node(16);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        Node temp = a1;

        Node b1 = new Node(6);
        Node b2 = new Node(9);
        Node b3 = new Node(11);
        Node b4 = new Node(13);

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        Node temp1 = b1;

        while(temp != null && temp1 != null){
            System.out.println(temp.data + " " + temp1.data);
            temp = temp.next;
            temp1 = temp1.next;
        }
        



    }
}
