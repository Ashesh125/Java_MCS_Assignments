package assignment_2.Q3;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "asd", "Asd", 10000);
        System.out.println(emp1);
        System.out.println("emp1 salary after 10% raise:" + emp1.raiseSalary(10));
        System.out.println("emp1 yearly salary:" + emp1.getAnnualSalary());

        Employee emp2 = new Employee(0, "!", "!", 0);
        emp2.setFirstName("first");
        emp2.setLastName("last");
        emp2.setId(2);
        emp2.setSalary(15000);
        System.out.println(emp2.getName() + " / " + emp2.toString());
    }
}
