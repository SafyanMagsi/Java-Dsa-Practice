class Node{

    int data;
    Node next;

    Node(int data){
        this.data = data;

    }
}
    public class Insersion{
        public static void main(String[] args){
            Node first = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            first.next = second;
            second.next = third;
             
            Node newFnode = new Node(4);
            newFnode.next = first;
             first = newFnode;

            Node newSnode = new Node(99);
            Node temp = first;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newSnode;


            temp = first;
            while(temp != null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
