package se.jdojo.gbg.consultant;

public class LinkingsiteContract extends Contract {

    public LinkingsiteContract() {
        this.customer = new Customer("Silicon Valley 1", null, "info@linking.site", true, false, false);
    }
    
    @Override
    public void doit() {
    }

}
