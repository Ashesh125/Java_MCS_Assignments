public class Q1 {
    public static void main(String[] args) {

        // creating a student
        Student stu1 = new Student();
        stu1.setName("stu1");
        stu1.setPhone(5465125);
        stu1.setEmail("stu1@gmail.com");
        stu1.setStatus(Student.Status.SENIOR);
        System.out.println(stu1.getInfo());

        // creating a fulltime employee
        Staff.FullTime emp1 = new Staff().new FullTime();
        emp1.setName("fulltime_1");
        emp1.setPhone(445454465);
        emp1.setSalary(50000);
        emp1.setEmail("emp1@gmail.com");
        emp1.setOffice("1");
        emp1.setTitle("HR");
        emp1.setDateHired(new MyDate(2022, 12, 12));

        System.out.println(emp1.getInfo());

        // creating a parttime employee
        Staff.PartTime emp2 = new Staff().new PartTime();
        emp2.setName("parttime_1");
        emp2.setPhone(44484655);
        emp2.setHoursWorked(50);
        emp2.setEmail("emp2@gmail.com");
        emp2.setOffice("2");
        emp2.setTitle("Worker");
        emp2.setDateHired(new MyDate(2023, 01, 1));
        System.out.println(emp2.getInfo());
        System.out.println(emp2.toString());

        // creating a faculty
        Faculty fac1 = new Faculty();
        fac1.setName("faculty_1");
        fac1.setPhone(44484655);
        fac1.setEmail("fac1@gmail.com");
        fac1.setOffice("2");
        fac1.setSalary(25000);
        fac1.setDateHired(new MyDate(2022, 01, 1));
        fac1.setRank("1");
        fac1.setOfficeHours("day");
        System.out.println(fac1.getInfo());
        System.out.println(fac1.toString());
    }
}
