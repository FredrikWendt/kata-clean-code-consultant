package se.jdojo.gbg.consultant;

public abstract class Contract {

    int volatility;
    int amount_of_work;
    EmailInvoice invoice;
    public Customer customer;
    public String getDescription() {
        return null;
    }
    public int get_hourly_rate() {
        return -1;
    }
    public float get_hours_of_work() {
        return 0;
    }
    public abstract void doit() ;

}
