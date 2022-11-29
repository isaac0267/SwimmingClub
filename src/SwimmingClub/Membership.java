package SwimmingClub;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
public  class Membership {
    //—————————————————————————————————————————————————— Variables ———————————————————————————————————————————————————
    private String firstName;
    private String surName;
    private String birthInput;
    private String inputLine;
    private int age;
    private int input;
    private static int nextMember = 1;
    private int memberNumber;
    private int price;

    //—————————————————————————————————————————————————— Constructor ———————————————————————————————————————————————————
    public Membership() {
        memberNumber = nextMember++;
    }
    //——————————————————————————————————————————————————  Arraylist ————————————————————————————————————————————————————
    private ArrayList <Competitor> member = new ArrayList<>();

    //——————————————————————————————————————————————————  Scanner & instance ————————————————————————————————————————————————————
    Scanner sc = new Scanner(System.in);

    //——————————————————————————————————————————————————  Getter ——————————————————————————————————————————————————————

    // getter
    public int getMemberNumber() {
        return memberNumber;
    }

    public String getInputLine() {
        return inputLine;
    }

    public int getPrice() {
        return price;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSurName(){
        return surName;
    }
    public String getBirthInput(){
        return birthInput;
    }



    //——————————————————————————————————————————————————  Setter ——————————————————————————————————————————————————————

    public void setOverAgePrice(int overAgePrice) {
        this.price = overAgePrice;
    }

    //——————————————————————————————————————————————————  Methods ————————————————————————————————————————————————————

    public String createMember(ArrayList<Competitor>createList) {
        System.out.println("What is your first name ?");
        String firstName = sc.nextLine();
        System.out.println("What is your surname ?");
        String surname = sc.nextLine();
        System.out.println("Enter your date of birth in the following format 'YYYY-MM-DD':");
        String birtInput = sc.nextLine();
        //TODO:FIX LIST
        //  activeOrPassiveMember (createList);
        Senior mdo = new Senior(firstName, surname, birtInput);
        createList.add(mdo);


        return firstName + surname + birtInput;
    }

    public void activeOrPassiveMember() {
        System.out.println("Do you want a active or passive membership? ");
        inputLine = sc.nextLine();
        //TODO:FIX LIST
        // createList.add(inputLine);

        if (inputLine.equals("passive".toLowerCase())) {
            setOverAgePrice(500);
            System.out.println("Price: " + (getPrice()));

        } else if (inputLine.equals("active".toLowerCase())) {
            exerciserOrCompetitionSwimmer();
            //swimmingDisciplines.ChooseASwimmingDiscipline();
        }
    }
    public int getAge(){
        return age;
    }

    public int age() {
        LocalDate birth = LocalDate.parse(birthInput);
        LocalDate presentDate = LocalDate.now();
        System.out.println(Period.between(birth, presentDate).getYears());
        return age;
    }

    public int calculatingAge() {
        try {
            LocalDate birth = LocalDate.parse(birthInput);
            LocalDate presentDate = LocalDate.now();
            if (Period.between(birth, presentDate).getYears() < 18 ) {
                setOverAgePrice(1600);
                System.out.println(" You will be set on the junior team\nPrice junior team : " + (getPrice())+ " yeary");
            }
            else if (Period.between(birth, presentDate).getYears() >= 18) {
                setOverAgePrice(1000);
                System.out.println("You will be set on the senior team\nPrice senior team : " +(getPrice())+ " yeary" );
            }
            else if  (Period.between(birth, presentDate).getYears() >= 60 )  {
                setOverAgePrice(1200);
                System.out.println("You are 18 you will be set on the senior team \nPrice senior team : " + (getPrice()) + "(25% of the senori price) ");
            }

        } catch (Exception e) {
            System.err.println("Something went wrong");
        }
        return age;
    }

    public void exerciserOrCompetitionSwimmer() {
        System.out.println("Swimming form ");
        System.out.println("Choose 1 (competition swimmer) \nChoose 2 (exerciser)");
        System.out.print("Enter:");
        input = sc.nextInt();
        if (input == 1)  {
            calculatingAge();
        }
        else if (input == 2) {
            System.out.println("You are now registered as a exerciser");
            //TODO: calculating price
        }
    }

    public void printMember(){

        System.out.printf("%-12s%-30s%-10s%n", firstName, surName, birthInput);

    }
}


