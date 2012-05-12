package se.jdojo.gbg.consultant;

public class EmailInvoice {

    private final float numberOfHoursToBill;
    private final String descriptionOfWork;
    private final String recipientAddress;
    private final int hourlyRateInEuros;
    private boolean sent;

    public EmailInvoice(String recipientAddress, String descriptionOfWork, int hourlyRateInEuros, float numberOfHoursToBill) {
        this.recipientAddress = recipientAddress;
        this.descriptionOfWork = descriptionOfWork;
        this.hourlyRateInEuros = hourlyRateInEuros;
        this.numberOfHoursToBill = numberOfHoursToBill;
    }
    
    public boolean isEmailInvoice() {
        return true;
    }
    
    public boolean isPaperInvoice() {
        return false;
    }
    
    public boolean isFaxInvoice() {
        return false;
    }

    public void setSent(boolean b) {
        sent = b;
    }

}
