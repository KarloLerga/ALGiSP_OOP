package pckg_adt_queue;

public class QUEUEARR <E> implements ADTQUEUE<E>{

    private int front;
    private int capacity;
    private static final int CAPACITY = 10;
    private int sz;
    private E[] queue;

    public QUEUEARR(){
        this.capacity = CAPACITY;
        this.sz = 0;
        this.queue = (E[]) new Object[capacity];
    }
    public QUEUEARR(int capacity){
        this.capacity = capacity;
        this.sz = 0;
        this.front = 0;
        this.queue = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return this.sz;
    }

    @Override
    public E first() {
        E element = null;
        if (isEmpty()){
            System.out.println("Queue is empty!");
        }else{
            element = queue[front];
        }
        return element;
    }

    @Override
    public void enqueue(E element) {
        if(this.sz < this.capacity){
            System.out.println("Placing new element in the queue...");
            int idx = (front+sz)%capacity;
            queue[idx] = element;
            System.out.println("Added at the index position: " + idx);
            sz++;
        }else{
            System.out.println("The queue is full - nothing to add!");
        }

    }

    @Override
    public E denqueue() {
        E element = null;
        if (isEmpty()){
            System.out.println("Nothing to process - the queue is empty!");
        }else{
            element = queue[front];
            queue[front] = null;
            front = (front+1)%capacity;
            sz--;
            System.out.println("Processing element: " + element);
        }
        return element;
    }

    @Override
    public String toString(){
        String front = "Front: ";
        String size = "Size: ";
        String rep ="";
        if(isEmpty()){
            size += sz;
        }else{
            front += this.front;
            size += sz;
            for(int k = 0; k < capacity; k++){
                if(k == this.front){
                    rep += ">>[ " + queue[this.front] + " ]<<";
                }else{
                    rep += ">>[ " + queue[k] + " ]";
                }
            }
        }

        return size + "\n" + front + "\n" + rep + "\n";
    }

    @Override
    public boolean isEmpty() {
        return this.sz == 0;
    }
}
