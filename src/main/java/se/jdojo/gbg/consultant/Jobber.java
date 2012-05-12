package se.jdojo.gbg.consultant;

/**
 * Main class
 */
public final class Jobber {
    
    public void work(Contract... contracts) {
        // do the most risky jobs first
        int maxRisk = Integer.MIN_VALUE;
        int riskIndex = 0;
        boolean theresJobToBeDone = true;
        while (theresJobToBeDone) {
        for (int i = 0; i < contracts.length; i++) {
            Contract contract = contracts[i];
            int thisRisk = contract .volatility * contract.amount_of_work;
            if (thisRisk > maxRisk) {
                riskIndex = i;
            }
        }
        
        Contract contract = contracts[riskIndex];
        
        // do the job
        contract.doit();
        
        // send invoice
        if (contract.customer.prefers_email_invoice) {
            contract.invoice = new EmailInvoice(contract.customer.getEmailAddress(), contract.getDescription(), contract.get_hourly_rate(), contract.get_hours_of_work());
        } else if (contract.customer.prefers_fax_invoice) {
            contract.invoice = new FaxInvoice(contract.customer.getFaxNumber(), contract.getDescription(), contract.get_hourly_rate(), contract.get_hours_of_work());
        } else if (contract.customer.prefers_paper_invoice){
            contract.invoice = new PaperInvoice(contract.customer.getInvoiceAddress(), contract.getDescription(), contract.get_hourly_rate(), contract.get_hours_of_work());
        } else {
            System.out.println("Don't know how to bill this customer");
            System.exit(-1);
        }
        
        InvoiceService.getInstance().sendInvoice(contract.invoice);
        
        // any job left to do?
        theresJobToBeDone = false;
        for (Contract c : contracts) {
            if (c.invoice == null) {
                theresJobToBeDone = true;
            }
        }
        }
    }
    
    
    public static void main(String[] args) {
        runTest();
    }


    private static void runTest() {
        // run in debugger
        Jobber jobber = new Jobber();
        jobber.work(new FacesiteContract(),
                new BankingJob("JP Morgans", 1000, "Streetway 1", "001235689"),
                new BankingJob("GE Money Corp", 100, "Wayplace 2", "002335577"),
                new BirdsiteContract(),
                new LinkingsiteContract());
    }
    
}