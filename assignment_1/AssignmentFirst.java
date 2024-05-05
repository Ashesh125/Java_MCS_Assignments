package assignment_1;

import java.util.Scanner;

public class AssignmentFirst{

    private Scanner sc;

    public AssignmentFirst(){
        this.sc = new Scanner(System.in);
    }

    public void temperatureConverter(){
        System.out.print("Enter value in fahrenheit: ");
        double fahrenheit = this.sc.nextDouble();
        double celsus = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("%.2fF is %.2fC%n", fahrenheit, celsus);
    }
}