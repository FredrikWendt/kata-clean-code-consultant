package se.jdojo.gbg.consultant;

import se.jdojo.gbg.consultant.services.EmailService;
import se.jdojo.gbg.consultant.services.FaxService;
import se.jdojo.gbg.consultant.services.PostalService;

public class InvoiceService {

    public static InvoiceService getInstance() {
        return new InvoiceService();
    }

    private EmailService emailService;
    private FaxService faxService;
    private PostalService postalService;

    public void sendInvoice(EmailInvoice invoice) {
        // FIXME: this is Frank's job - fix it asap
        if (invoice.isEmailInvoice()) {
            emailService.send(invoice);
        }
        if (invoice.isFaxInvoice()) {
            faxService.send((FaxInvoice) invoice);
        }
        if (invoice.isPaperInvoice()) {
            postalService.send((PaperInvoice) invoice);
        }
        invoice.setSent(true);
    }

}
