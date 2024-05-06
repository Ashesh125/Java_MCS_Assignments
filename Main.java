import java.util.Scanner;
import assignment_1.AssignmentFirst;

public class Main {

    private static final String[] QUESTIONS = {
            "Fahrenheit into Celsius",
            "Read Integer between 0 and 1000 and print sum of digits",
            "Rectangle Client",
            "Fan Client",
            "Date Today",
            "Time Now",
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AssignmentFirst as_f = new AssignmentFirst();

        for (int i = 0; i < QUESTIONS.length; i++) {
            String question = QUESTIONS[i];

            System.out.println("Question " + (i + 1) + ": " + question);
        }
        System.out.print("Enter question no: ");
        int sub = sc.nextInt();

        switch (sub) {
            case 1:
                as_f.temperatureConverter();
                break;

            case 2:
                as_f.numberAdder();
                break;

            case 3:
                as_f.RectangleClient();
                break;

            case 4:
                as_f.FanClient();
                break;

            case 5:
                as_f.dateToday();
                break;

            case 6:
                as_f.timeNow();
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }
    }
}