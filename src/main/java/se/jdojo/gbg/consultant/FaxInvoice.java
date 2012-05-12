package se.jdojo.gbg.consultant;

public class FaxInvoice extends EmailInvoice {

    public FaxInvoice(String recipientAddress, String descriptionOfWork, int hourlyRateInEuros,
            float numberOfHoursToBill) {
        super(recipientAddress, descriptionOfWork, hourlyRateInEuros, numberOfHoursToBill);
    }
    
    @Override
    public boolean isEmailInvoice() {
        return false;
    }
    
    @Override
    public boolean isPaperInvoice() {
        return false;
    }
    
    @Override
    public boolean isFaxInvoice() {
        return true;
    }
    

}
