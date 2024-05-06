package assignment_1;

import java.util.Scanner;
import java.util.GregorianCalendar;

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

    public void numberAdder(){
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = this.sc.nextInt();

       
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
            return;
        }

        String numberStr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numberStr.length(); i++) {
            sum += Character.getNumericValue(numberStr.charAt(i));
        }

        System.out.println("The sum of digits in " + number + " is " + sum);

    }

    public void RectangleClient(){
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5,50,"yellow");

        rect1.setHeight(12);
        rect1.setWidth(14);

        System.out.println("area of rectangle 1: " + rect1.findArea());

        System.out.println("height of rectangle 2: " + rect1.getHeight());
        System.out.println("width of rectangle 2: " + rect1.getWidth());
        System.out.println("color of rectangle 2: " + rect1.getColor());
        System.out.println("perimeter of rectangle 2: " + rect1.findPerimeter());
    }

    public void FanClient(){
        Fan f = new Fan(Fan.FAST, false, 10, "yellow");

        f.setOn(true);
        System.out.println(f.toString());
    }

    public void dateToday(){
        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; 
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }

    public void timeNow(){
        Time time = new Time();

        System.out.println("Current Time (GMT):");
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
    }
}