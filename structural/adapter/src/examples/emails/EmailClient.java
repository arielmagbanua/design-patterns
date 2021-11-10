package examples.emails;

import java.util.ArrayList;
import java.util.List;

public class EmailClient {
  private final List<EmailProvider> providers = new ArrayList<>();

  public void addProvider(EmailProvider provider) {
    providers.add(provider);
  }

  public void downloadEmails() {
    for (var provider : providers)
      provider.downloadEmails();
  }
}
