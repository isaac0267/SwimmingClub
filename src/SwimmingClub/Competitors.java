package SwimmingClub;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public abstract class Competitors {
    private String convention;

    private String locationName;

    private String inputSwimmingDiscipline;

    private String swimmingDiscipline;


    private int competitionForm;
    static private int places;

    Scanner sc= new Scanner(System.in);

    //........................instance....................
    Membership ms= new Membership();
    //..................constructor..................

    public Competitors(String convention,String swimmingDiscipline){
        this.inputSwimmingDiscipline = swimmingDiscipline;
        generateTime();
        this.convention =convention;
    }

    public Competitors() {
    }
    public Competitors(String firstname, String surname, String birthInput) {
    }

    //........................................getter................
    public String getConvention(){
        return convention;
    }

    public String getSwimmingDiscipline() {
        return inputSwimmingDiscipline;
    }

    //..........................competition information-.........................
    public String  events(ArrayList<Competitors> createList){
        System.out.println("the name of the location ");
        locationName = sc.nextLine();

        System.out.println("\nSwimming Disciplines" + "(\nChoose 1 (breastSwimming) \nChoose 2 (butterfly)\nChoose 3 (backSwimming)");
        inputSwimmingDiscipline = sc.nextLine();

        if (inputSwimmingDiscipline.equalsIgnoreCase("1")){
            swimmingDiscipline = "BreastSwimming";
        }

        else if (inputSwimmingDiscipline.equalsIgnoreCase("2")){
            swimmingDiscipline ="Butterfly";
        }
        else if (inputSwimmingDiscipline.equalsIgnoreCase("3")){
            swimmingDiscipline = "BackSwimming";
        }
        else {
            System.out.println("You didnt choose a swimming discipline");
        }
        Senior mdo = new Senior(locationName, swimmingDiscipline);
        createList.add(mdo);
        //System.out.println("Create day is: " + LocalDate.now());
        return locationName+ swimmingDiscipline;
    }

    // ...................place............................................
    public int placeList(){
        places = places+1;
        return places;
    }

    //----------------------time registration------------------------------------
    public LocalTime generateTime() {

        LocalTime lt= LocalTime.of(1,9,1);
        long second = ChronoUnit.MINUTES.between(lt,LocalTime.now().minusHours(1));
        LocalTime tid= lt.plusMinutes(new Random().nextInt((int) second + 1));

        return tid;
    }
}
