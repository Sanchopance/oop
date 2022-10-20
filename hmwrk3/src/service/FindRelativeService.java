package hmwrk3.src.service;

import hmwrk3.src.data.Human;
import hmwrk3.src.data.Relation;
import hmwrk3.src.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class FindRelativeService {

    public FindRelativeService(){

    }

    public List<String> findRelatives(Human person, List<Relative> relatives) {
        List<String> relations = new ArrayList<>();
        for (Relative item : relatives) {
            if(person.equals(item.getPerson1())) {
                relations.add("(" + item.getPerson2().getFirstName() + " " + item.getPerson2().getSecondName() +
                                item.getStringRelation(item.getRelative()) + ")");
            }

        }
        return relations;
    }

    public Human findPersonByRelation(Human person, Relation relative, List<Relative> relatives) {
        Human find = new Human();
        for (Relative item: relatives) {
            if(person.equals(item.getPerson2()) && relative.equals(item.getRelative())) {
                find = item.getPerson1();
            }

        }
    return  find;
    }

}
