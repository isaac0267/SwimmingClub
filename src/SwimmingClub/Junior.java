package SwimmingClub;

import java.util.ArrayList;
public class Junior extends Competitor {
    public Junior(String locationName, String swimmingDiscipline) {
        super(locationName, swimmingDiscipline);
    }
    public Junior() {
        super();
    }

    public void printJunior(ArrayList<Competitor> createList) {
        TheCompetitors.ListCreate(createList);
        System.out.printf("%-12s%-30s%-30s%-10s%n","RANK", "TIME","LOCATION", "SWIMMING DISCIPLINE");
        for (Competitor f :createList)
            System.out.printf("%-12s%-30s%-30s%-10s%n",f.placeList(),f.generateTime(), f.getConvention(),
                    f.getSwimmingDiscipline());
    }
}


