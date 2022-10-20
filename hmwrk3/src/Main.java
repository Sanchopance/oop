package hmwrk3.src;

import hmwrk3.src.controller.RelationController;
import hmwrk3.src.data.Human;
import hmwrk3.src.data.Relation;
import hmwrk3.src.data.Relative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> persons = new ArrayList<>();

        Human person1 = new Human("Валерий","Валерьев", "мужской", "40");
        Human person2 = new Human("Светлана", "Валерьева", "женский", "35");
        Human person3 = new Human("Игнат","Валерьев", "мужской", "10");
        Human person4 = new Human("Валерия", "Валерьева", "женский", "6");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        List<Relative> relatives = new ArrayList<>();

        relatives.add(new Relative(person1, person2, Relation.HUSBAND));
        relatives.add(new Relative(person2, person1, Relation.WIFE));
        relatives.add(new Relative(person1, person3, Relation.FATHER));
        relatives.add(new Relative(person3, person1, Relation.SON));
        relatives.add(new Relative(person1, person4, Relation.FATHER));
        relatives.add(new Relative(person4, person1, Relation.DAUGHTER));
        relatives.add(new Relative(person2, person3, Relation.MOTHER));
        relatives.add(new Relative(person3, person2, Relation.SON));
        relatives.add(new Relative(person2, person4, Relation.MOTHER));
        relatives.add(new Relative(person4, person2, Relation.DAUGHTER));
        relatives.add(new Relative(person3, person4, Relation.BROTHER));
        relatives.add(new Relative(person4, person3, Relation.SISTER));

        //System.out.println(relatives);

        RelationController controller = new RelationController();

        System.out.println(person1.getFirstName() + " " + person1.getSecondName() + " является для: " +
                           controller.findRelations( person1, relatives));
        System.out.println(person3.getFirstName() + " " + person3.getSecondName() + " является для: " +
                controller.findRelations( person3, relatives));
        System.out.println("Для " + person4.getFirstName() + " " + person4.getSecondName() + " мамой " +
                           controller.findPersonByRelations(person4,Relation.MOTHER,relatives));
        System.out.println("Для " + person2.getFirstName() + " " + person2.getSecondName() + " сыном " +
                           controller.findPersonByRelations(person2, Relation.SON, relatives));
    }
}