package examples.emails;

import examples.emails.gmail.GmailClient;

public class GmailProvider implements EmailProvider {
    private final GmailClient gmailClient;

    public GmailProvider(GmailClient gmailClient) {
        this.gmailClient = gmailClient;
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
