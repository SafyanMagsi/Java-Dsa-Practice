
public class LinkedStack implements Stack {
    private int size;
    private Node top;
    private class Node{
        Object data;
        Node next;
        Node(Object data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }

    public Object peek(){
        if(size == 0){
            throw new IllegalStateException("its empty bitch");
        }
        return top.data;
    }

    public void push(Object obj){
        top = new Node(obj , top);
        size++;
    }
    public Object pop(){
        if(size == 0){
            throw new IllegalStateException("bitch its empty");
        }
        Object temp = top.data;
        top = top.next;
        size--;
        return temp;
    }
    
}
