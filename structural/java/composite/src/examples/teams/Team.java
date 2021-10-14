package examples.teams;

import java.util.ArrayList;
import java.util.List;

public class Team implements Resource {
  private final List<Resource> resources = new ArrayList<>();

  public void add(Resource resource) {
    resources.add(resource);
  }

  @Override
  public void deploy() {
    for (var resource : resources) {
      resource.deploy();
    }
  }
}
