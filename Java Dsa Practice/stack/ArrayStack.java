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

    public static void main(String[] args) {
       
    ArrayStack s = new ArrayStack(10);
s.push(10);
s.push(20);
s.push(30);

while (!s.isEmpty()) {
    System.out.println(s.pop());
        }




        ArrayStack s1 = new ArrayStack(10);
s1.push(10);
s1.push(20);

ArrayStack s2 = new ArrayStack(10);
s2.push(30);
s2.push(40);

while (!s2.isEmpty()) {
    s1.push(s2.pop());
}

while (!s1.isEmpty()){
    System.out.println( s1.pop());
}
    }

}

