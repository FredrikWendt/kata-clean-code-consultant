package se.jdojo.gbg.consultant;

public class BankingJob extends Contract {

    private final int hourlyRate;
    private final String bankName;

    public BankingJob(String bankName, int hourlyRate, String invoiceAddress, String faxNumber) {
        this.bankName = bankName;
        this.hourlyRate = hourlyRate;
        this.customer = new Customer(invoiceAddress, faxNumber, null, false, false, true);
    }
    
    @Override
    public String getDescription() {
        return "COBOL for " + bankName;
    }
    
    @Override
    public int get_hourly_rate() {
        return hourlyRate;
    }

    @Override
    public void doit() {
    }
    
    

}
