
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class LinkedClasss {
    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(3);
        Node a4 = new Node(4);
        Node a5 = new Node(5);

        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;


        Node b1 = new Node(5);
        Node b2 = new Node(6);
        Node b3 = new Node(7);
        Node b4 = new Node(8);
        Node b5 = new Node(9);
        Node b6 = new Node(10);

        b1.next = b2;
        b2.next = b3;
        b3.next = b4;
        b4.next = b5;
        b5.next =b6;
        Node temp = b1;
        int sum = 0;

        while( temp != null ){
            if (temp.data == 8 || temp.data == 9)
                sum += temp.data;
            temp = temp.next;
                
        }
        System.out.println(sum);

    }
}
