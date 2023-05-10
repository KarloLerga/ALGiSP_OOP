package pckg_adt_queue;

public class TestQueue {
    public static void main(String[] args) {
        QUEUEARR<String> qs = new QUEUEARR<>(5);
        qs.enqueue("A");
        qs.enqueue("B");
        qs.enqueue("C");
        qs.enqueue("D");
        qs.enqueue("E");
        qs.enqueue("F");
        System.out.println(qs);
        String inProcess;
        inProcess = qs.denqueue();
        System.out.println("Processing: " + inProcess);
        System.out.println(qs);
        qs.enqueue("F");
        System.out.println(qs);
        qs.denqueue();
        qs.denqueue();
        qs.denqueue();
        qs.denqueue();
        System.out.println(qs);
        qs.denqueue();
        System.out.println(qs);
        qs.denqueue();
    }
}
