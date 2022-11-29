package SwimmingClub;
import java.util.ArrayList;

public abstract class TheCompetitors {
    public static void ListCreate(ArrayList<Competitor> createList) {

        //BreastSwimmers
        createList.add(new Senior("USA","BreastSwimming"));
        createList.add(new Senior("Indian","BreastSwimming"));

        createList.add(new Junior("Turkey","BreastSwimming"));
        createList.add(new Junior("Mexico","BreastSwimming"));

        // backSwimmers
        createList.add(new Senior("Canada","backSwimming"));
        createList.add(new Senior("Somalia","backSwimming"));

        createList.add(new Junior("Turkey","backSwimming"));
        createList.add(new Junior("Mexico","backSwimming"));

        //Butterfly
        createList.add(new Junior("Turkey","Butterfly"));
        createList.add(new Junior("Mexico","Butterfly"));
    }
}

