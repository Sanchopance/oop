package hmwrk3.src.controller;

import hmwrk3.src.data.Human;
import hmwrk3.src.data.Relation;
import hmwrk3.src.data.Relative;
import hmwrk3.src.service.FindRelativeService;

import java.util.List;

public class RelationController {

    private FindRelativeService findRelativeService;

    public RelationController() {
        this.findRelativeService = new FindRelativeService();
    }

    public List<String> findRelations(Human person, List<Relative> relatives) {
        return findRelativeService.findRelatives(person,relatives);
    }

    public Human findPersonByRelations(Human person, Relation relative, List<Relative> relatives) {
        return findRelativeService.findPersonByRelation(person,relative,relatives);
    }
}
