package patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements TeamResource {
    private final List<TeamResource> resources = new ArrayList<>();

    public void add(TeamResource resource) {
        resources.add(resource);
    }

    public void deploy() {
        for (var resource : resources) resource.deploy();
    }
}
