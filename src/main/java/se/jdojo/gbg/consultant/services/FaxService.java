package se.jdojo.gbg.consultant.services;

import se.jdojo.gbg.consultant.FaxInvoice;

public interface FaxService extends InvoiceSendingService {

    void send(FaxInvoice invoice);

}
