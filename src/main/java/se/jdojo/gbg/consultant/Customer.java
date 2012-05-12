package se.jdojo.gbg.consultant;

public class Customer {

    protected boolean prefers_email_invoice = false;
    protected boolean prefers_fax_invoice = false;
    protected boolean prefers_paper_invoice = false;
    private String invoideAddress;
    private String faxNumber;
    private String defaultEmailAddress;

    public Customer(String invoicingAddress, String faxNumber, String defaultEmailAddress, boolean e, boolean f, boolean p) {
        invoideAddress = invoicingAddress;
        this.faxNumber = faxNumber;
        this.defaultEmailAddress = defaultEmailAddress;
        this.prefers_email_invoice = e;
        this.prefers_fax_invoice = f;
        this.prefers_paper_invoice = p;
    }
    
    public String getEmailAddress() {
        return defaultEmailAddress;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getInvoiceAddress() {
        // TODO Auto-generated method stub
        return invoideAddress;
    }

}
