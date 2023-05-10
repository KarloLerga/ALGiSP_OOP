package pckg_banka;

public class BankStand {
    private int id;
    private static int ctrID = 1;
    private float processingTime;

    public BankStand(float processingTime){
        this.id = ctrID++;
        this.processingTime = processingTime*id;
    }
}
