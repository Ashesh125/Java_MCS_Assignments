import java.util.Scanner;
import assignment_1.AssignmentFirst;

public class Main{
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input: ");
        int input = sc.nextInt();

        switch(input){
            case 1:
                AssignmentFirst as_f = new AssignmentFirst();
                
                System.out.print("Enter your input: ");
                int sub = sc.nextInt();
                
                switch(sub){
                    case 1:
                        as_f.temperatureConverter();
                        break;
                }
                break;
                
            default:
                System.out.println("Invalid input.");
                break;
        
        }
    }
}