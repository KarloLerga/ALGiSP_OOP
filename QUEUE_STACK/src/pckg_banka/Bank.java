package pckg_banka;

import pckg_adt_queue.QUEUEARR;

import java.util.Set;
import java.util.TreeSet;

public class Bank {
    private String bankName;
    private int id;
    private static int cntID = 100;
    private Set<BankStand> stands;
    private QUEUEARR<Customer> queue;

    public Bank(String name){
        this.bankName = name;
        this.id = cntID++;
        this.stands = new TreeSet<>();
    }
    public void addStand(BankStand stand){
        this.stands.add(stand);

    }
}
