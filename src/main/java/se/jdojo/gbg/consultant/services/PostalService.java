package se.jdojo.gbg.consultant.services;

import se.jdojo.gbg.consultant.PaperInvoice;

public interface PostalService extends InvoiceSendingService {

    void send(PaperInvoice invoice);

}
