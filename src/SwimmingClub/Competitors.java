package SwimmingClub;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public abstract class Competitors {
    private String convention;

    private String locationName;

    private String  inputSwimmingDisciplin;

    private String swimmingDisciplin;


    private int competitionForm;
    static private int places;

    Scanner sc= new Scanner(System.in);

    //........................instance....................
    Membership ms= new Membership();
    //..................constructer..................

    public Competitors(String convention,String swimmingDisciplin ){
        this.inputSwimmingDisciplin = swimmingDisciplin;
        generateTime();
        this.convention =convention;
    }

    public Competitors() {
    }
    public Competitors(String firstname, String surname, String birthinput) {
    }

    //........................................getter................
    public String getConvention(){
        return convention;
    }

    public String getSwimmingDiscipline() {
        return inputSwimmingDisciplin;
    }

    //..........................competition information-.........................
    public String  events(ArrayList<Competitors> lavedListe){
        System.out.println("the name of the location ");
        locationName = sc.nextLine();

        System.out.println("\nSwimming Disciplins" + "(\nChoose 1 (breastSwimming) \nChoose 2 (butterfly)\nChoose 3 (backSwimming)");
        inputSwimmingDisciplin = sc.nextLine();

        if (inputSwimmingDisciplin.equalsIgnoreCase("1")){
            swimmingDisciplin= "BreastSwimming";
        }

        else if (inputSwimmingDisciplin.equalsIgnoreCase("2")){
            swimmingDisciplin="Butterfly";
        }
        else if (inputSwimmingDisciplin.equalsIgnoreCase("3")){
            swimmingDisciplin= "Backswimming";
        }
        else {
            System.out.println("You didnt choose a swimming disciplin");
        }
        Senior mdo = new Senior(locationName,swimmingDisciplin);
        lavedListe.add(mdo);
        //System.out.println("oprettelses dagen er: " + LocalDate.now());
        return locationName+ swimmingDisciplin;
    }

    // ...................place............................................
    public int placeList(){
        places = places+1;
        return places;
    }

    //----------------------time registration------------------------------------
    public LocalTime generateTime() {

        LocalTime lt= LocalTime.of(1,9,1);
        long secound = ChronoUnit.MINUTES.between(lt,LocalTime.now().minusHours(1));
        LocalTime tid= lt.plusMinutes(new Random().nextInt((int) secound + 1));

        return tid;
    }
}
