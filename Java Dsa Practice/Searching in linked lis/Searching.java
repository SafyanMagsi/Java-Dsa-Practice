class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;

    }
}

public class Searching {
    public static void main(String[] args) {
        
        Node first = new Node(5);
        Node second = new Node(10);
        Node third = new Node(15);
        Node fourth = new Node(20);

        first.next = second;
        second.next = third;
        third.next = fourth;

        int target = 15;
        Node temp = first;
        boolean found = false;

        while(temp != null){
            if(temp.data == target){
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (found == true){
            System.out.println("target found at:" + temp.data);
        }else{
            System.out.println("not found!");
        }
    }
 
}
