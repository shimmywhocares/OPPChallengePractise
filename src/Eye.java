import java.util.Scanner;

public class Eye extends Organ {
    public String color;

    public Eye(String name, String medicalCondition, String color) {
        super(name, medicalCondition);
        this.color = color;
    }

    public void closeEye() {
        boolean next = false;

        while (!next) {
            System.out.println("\t1. Close " + this.name + "?");
            System.out.println("\tAny key - next organ...");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.next();

            switch (userInput) {
                case "1":
                    System.out.println(this.name + " is closed.");
                    break;
                default:
                    next = true;
            }

        }
    }
}
