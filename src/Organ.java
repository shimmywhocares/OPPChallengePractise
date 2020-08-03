import java.util.Scanner;

public class Organ {
    public String name;
    public String medicalCondition;
    public int rate;
    public String hungrinessLevel;

    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public Organ(String name, String medicalCondition, int rate) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.rate = rate;
    }

    public Organ(String name, String medicalCondition, String hungrinessLevel) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.hungrinessLevel = hungrinessLevel;
    }

    public void heartRate() {
        boolean next = false;

        while (!next) {
            System.out.println("\t1. Input a new heart rate: " );
            System.out.println("\t Any key - next organ...");
            Scanner scanner2 = new Scanner(System.in);
            String userInput = scanner2.next();

            if (userInput.equals("1")) {
                System.out.print("Set a new heart rate: ");
                Scanner scanner3 = new Scanner(System.in);
                this.rate = scanner3.nextInt();
                System.out.println("Heart rate: " + this.rate);
                break;
            }else{
                    next = true;
            }

        }
    }

    public void digest() {
        boolean next = false;

        while (!next) {
            System.out.println("\t1. Feed and turn on the digestion: " );
            System.out.println("\t Any key - next organ...");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            if (userInput.equals("1")) {
                System.out.print("What do you want to eat: ");
                Scanner scanner2 = new Scanner(System.in);
                String food;
                food = scanner2.next(); // TODO: here is some bug - scanner takes only first word from string
                this.medicalCondition = "Awesome";
                this.hungrinessLevel = "It's satisfied";
                System.out.println("Process of digestion: " + food);
                break;
            }else{
                next = true;
            }

        }
    }

}
