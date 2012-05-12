package se.jdojo.gbg.consultant;

public class PaperInvoice extends EmailInvoice {

    public PaperInvoice(String recipientAddress, String descriptionOfWork, int hourlyRateInEuros,
            float numberOfHoursToBill) {
        super(recipientAddress, descriptionOfWork, hourlyRateInEuros, numberOfHoursToBill);
    }
    

    @Override
    public boolean isEmailInvoice() {
        return false;
    }
    
    @Override
    public boolean isPaperInvoice() {
        return true;
    }

}
