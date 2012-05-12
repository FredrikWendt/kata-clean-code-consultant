package se.jdojo.gbg.consultant.services;

import se.jdojo.gbg.consultant.EmailInvoice;

public interface EmailService extends InvoiceSendingService {

    void send(EmailInvoice invoice);

}
