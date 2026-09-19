class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}
public class Deletion{
    public static void main(String[] args){
        Node first = new Node(5);
        Node second = new Node (10);
        Node third = new Node (15);
        Node fourth = new Node (20);
        
        first.next = second;
        second.next = third;
        third.next = fourth;

        Node temp = first;
        while(temp.next.data != 15){
            temp = temp.next;
        }
        temp.next = temp.next.next;

        temp = first;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}