package hmwrk3.src.data;

public class Relative {

    private Human person1;

    private Human person2;

    private Relation relative;

    public Relative(Human person1, Human person2, Relation relative) {
        this.person1 = person1;
        this.person2 = person2;
        this.relative = relative;

    }

    public Human getPerson1() {
        return person1;
    }

    public Human getPerson2() {
        return person2;
    }

    public Relation getRelative() {
        return relative;
    }
    public String getStringRelation(Relation relative) {
        String string;
        switch (relative) {
            case SON:
                string = " сын";
                break;
            case DAUGHTER:
                string = " дочь";
                break;
            case FATHER:
                string = " отец";
                break;
            case MOTHER:
                string = " мать";
                break;
            case BROTHER:
                string = " брат";
                break;
            case SISTER:
                string = " сестра";
                break;
            case HUSBAND:
                string = " муж";
                break;
            case WIFE:
                string = " жена";
                break;
            default:
                string = " не родственик";
        }
        return  string;
    }

    @Override
    public String toString() {

        return person1.getFirstName() + " " + person1.getSecondName() + getStringRelation(relative) + " " +
               person2.getFirstName() + " " + person2.getSecondName();
    }
}
