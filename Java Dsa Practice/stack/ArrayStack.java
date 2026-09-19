public class ArrayStack implements Stack {
    private int size;
    private Object[] a;

    public ArrayStack(int capacity){
        a = new Object[capacity];
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public int size(){
        return size;
    }
    public Object peek(){
        if(size == 0) throw new IllegalStateException("Stack is empty");
        return a[size -1];
    }
    public void push(Object obj){
        if(size == a.length){
            resize();
        }
        a[size++] = obj;
    }
    public Object pop(){
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object temp = a[--size];
        a[size] = null;
        return temp;
    }
    private void resize(){
        Object[] aa = a;
        a = new Object[2*aa.length];
        System.arraycopy(aa, 0, a, 0, size);
    }  
}


