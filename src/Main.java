import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Patient patient = new Patient(
                "Shimmy",
                26,
                new Eye("Right Eye", "Short vision", "brown"),
                new Eye("Left eye", "Normal, all right", "violet"),
                new Organ("Heart", "beating", 66),
                new Organ("Stomach", "It's ok but hungry...", "Crazy high - I could eat the zebra z kopytami!"));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        boolean quitVisit = false;

        while (!quitVisit){
            System.out.println();
            System.out.println("Chose an action: ");
            System.out.println("\t1. " + patient.getEye_right().name);
            System.out.println("\t2. " + patient.getEye_left().name);
            System.out.println("\t3. " + patient.getHeart().name);
            System.out.println("\t4. " + patient.getStomach().name);
            System.out.println("\tQuit - any key");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();

            switch (action){
                case 1:
                    System.out.println("Name: " + patient.getEye_right().name);
                    System.out.println("Medical Condition: " + patient.getEye_right().medicalCondition);
                    System.out.println("Color: " + patient.getEye_right().color);
                    patient.getEye_right().closeEye();
                    break;
                case 2:
                    System.out.println("Name: " + patient.getEye_left().name);
                    System.out.println("Medical Condition: " + patient.getEye_left().medicalCondition);
                    System.out.println("Color: " + patient.getEye_left().color);
                    patient.getEye_left().closeEye();
                    break;
                case 3:
                    System.out.println("Name: " + patient.getHeart().name);
                    System.out.println("Medical Condition: " + patient.getHeart().medicalCondition);
                    System.out.println("Heart rate: " + patient.getHeart().rate);
                    patient.getHeart().heartRate();
                    break;
                case 4:
                    System.out.println("Name: " + patient.getStomach().name);
                    System.out.println("Medical Condition: " + patient.getStomach().medicalCondition);
                    System.out.println("Level of hungriness: " + patient.getStomach().hungrinessLevel);
                    patient.getStomach().digest();
                    break;
                default:
                    quitVisit = true;
            }

        }

    }
}
