package SwimmingClub;
import java.util.ArrayList;
public class Senior extends  Competitors  {


    public Senior(){
        super();
    }

    public Senior(String firstName, String surName,String birthInput) {
        super(firstName, surName, birthInput);
    }

    public Senior(String locationName, String swimmingDiscipline) {
        super(locationName,swimmingDiscipline);
    }


    public void printSenior(ArrayList<Competitors> lavedListee){
        System.out.printf("%-12s%-30s%-30s%-10s%n","RANK", "TIME","LOCATION", "SWIMMING DISCIPLIN");

        TheCompetitors.ListCreate(lavedListee);
        for (Competitors f :lavedListee)
            System.out.printf("%-12s%-30s%-30s%-30s%-30s%-10s%n",f.placeList(),f.generateTime(), f.getConvention(),
                    f.getSwimmingDiscipline(), f.ms.getFirstName(), f.ms.getSurName());
    }


}
